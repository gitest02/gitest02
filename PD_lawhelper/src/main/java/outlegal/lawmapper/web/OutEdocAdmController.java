package outlegal.lawmapper.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.web.AdvancedFileController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import outlegal.lawmapper.service.OutEdocAdmService;
import outlegal.lawmapper.vo.OutEdocAdmVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class OutEdocAdmController {

	private static final Logger log = LoggerFactory
			.getLogger(AdvancedFileController.class);

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}

	@Resource(name = "outEdocAdmService")
	private OutEdocAdmService outEdocAdmService;	
	
	@RequestMapping("/getEdocAdmList.do")
	public NexacroResult getEdocAdmList(@ParamDataSet(name = "ds_search", required = false) OutEdocAdmVO outEdocAdmVO) {
		
		List<OutEdocAdmVO> list = outEdocAdmService.getEdocAdmList(outEdocAdmVO);
		
		NexacroResult result = new NexacroResult();
		
		result.addDataSet("ds_edoc1", list);
		result.addDataSet("ds_edoc2", list);
		
		return result;
	}
	
	@RequestMapping("/edocChange.do")
	public NexacroResult getEdocAdmList(@ParamDataSet(name = "ds_edoc", required = false) List<OutEdocAdmVO> listVO) {
		
		outEdocAdmService.edocAdmChange(listVO);
		
		NexacroResult result = new NexacroResult();
		
		return result;
	}
	
}
