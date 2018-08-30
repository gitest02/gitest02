package mediation.lawmapper.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import mediation.lawmapper.service.MediationService;
import mediation.lawmapper.vo.MediationVo;
import nexacro.sample.web.AdvancedFileController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import code.lawmapper.vo.CodeVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

import egovframework.rte.fdl.property.EgovPropertyService;

@Controller
public class MediationController {

	@Resource(name="mediationService")
	public MediationService mediationService;
	
	private static final Logger log = LoggerFactory.getLogger(AdvancedFileController.class);
	
	@Resource
	private Validator validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	// 조정안 전체 검색			  
	@RequestMapping(value = "/getMedAllList.do") 
	public NexacroResult getMediationALLList(@ParamDataSet(name = "ds_instance", required = false) MediationVo mediationVo) 
																												throws Exception{
					
		NexacroResult result = new NexacroResult();
		
		List<MediationVo> getMedInstList = mediationService.getMediationInstList(mediationVo);
		List<MediationVo> getMedPladefList = mediationService.getMediationPladefList(mediationVo);
		List<MediationVo> getMedDetailList = mediationService.getMediationDetail(mediationVo);
		
		if(getMedDetailList.size() > 0){
			result.addDataSet("ds_output3", getMedDetailList);			
		}	
		
		result.addDataSet("ds_output", getMedInstList);
		result.addDataSet("ds_output2", getMedPladefList);
		
		return result;
	}
	
	
	// 조정안 등록, 수정 , 삭제		
	@RequestMapping( value = "/medChange")
	public NexacroResult medChange(@ParamDataSet(name = "ds_input", required = false)List<MediationVo> listMedVO) 
																											throws Exception{
		
		mediationService.medChange(listMedVO);
		
		NexacroResult result = new NexacroResult();

		return result;
		
	}
	
	
	// 소송종결 등록
	@RequestMapping( value ="/medReg.do")
	public NexacroResult mediationReg(Object voObject, HttpServletRequest request) throws Exception{
		
		NexacroResult result = new NexacroResult();
		
		mediationService.mediationReg(voObject);
				
		return result;
	}
	
	// 조정안  getCount
	@RequestMapping(value = "/getCnt.do") 
	public NexacroResult getCount(@ParamDataSet(name = "ds_input", required = false)MediationVo mediationVo ) 
																									throws Exception{
	
		NexacroResult result = new NexacroResult();
		
		String aprvCheck = mediationService.getCount(mediationVo); 
		MediationVo temp = new MediationVo();  //output 에 담길 데이터 셋 vo
		temp.setAprvCheck(aprvCheck);  //결과값을 담는다
		
		result.addDataSet("ds_output", temp );
		
		return result;
	}
	
}
