package nexacro.sample.web;

import java.util.List;

import javax.annotation.Resource;





import nexacro.sample.service.InterestService;
import nexacro.sample.vo.InterestVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.spring.NexacroException;


@Controller
public class InterestController {
	private static final Logger log = LoggerFactory.getLogger(InterestController.class);
	
	@Resource(name = "interestService")
	private InterestService interestService;
	@Resource
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	@RequestMapping(value="/interest_list.do")
	public NexacroResult interest_iflist(){
		List<InterestVo> interestList = interestService.selectInterestVoList();
		NexacroResult result = new NexacroResult();
		result.addDataSet("output1",interestList);
	
		return result;
	}
	@RequestMapping(value="/interestDetail.do")
	public NexacroResult interestDetail(InterestVo interest_interestVo){
	List<InterestVo> interestDetailList=interestService.selectDetailList(interest_interestVo);
	NexacroResult result = new NexacroResult();
	result.addDataSet("output1",interestDetailList);
	
	return result;
}
	@RequestMapping(value= "/create_interest.do")
	public NexacroResult create_interest(@ParamDataSet(name="input1",required=false) List<InterestVo> modifyList)throws NexacroException{
		validate(modifyList);
		interestService.modifyMultiInterest(modifyList);
     NexacroResult result = new NexacroResult();
		return result;
	}
	private void validate(List<InterestVo> modifyList)throws NexacroException{
		BindingResult bindingResult =null;
		for(InterestVo interestVo:modifyList){
			bindingResult=new BeanPropertyBindingResult(interestVo, "interestVo");
			validator.validate(interestVo, bindingResult);
			if(bindingResult.hasErrors()){
				String errorMessages = getErrorMessages(bindingResult);
				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);
				
				throw nexacroException;
			}
		}
	}
	private String getErrorMessages(BindingResult bindingResult) {
		StringBuffer sb = new StringBuffer();
		
		for (ObjectError error : bindingResult.getAllErrors()){
			sb.append(error.getDefaultMessage()).append("\n");
		}
		
		return sb.toString();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
