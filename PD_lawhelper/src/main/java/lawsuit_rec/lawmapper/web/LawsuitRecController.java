package lawsuit_rec.lawmapper.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import lawsuit_rec.lawmapper.service.LawsuitRecService;
import lawsuit_rec.lawmapper.vo.LawsuitRecVO;
import nexacro.sample.web.AdvancedFileController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

import egovframework.rte.fdl.property.EgovPropertyService;

@Controller
public class LawsuitRecController {

	@Resource(name = "lawsuitRecSer")
	public LawsuitRecService lawsuitrecService;

	private static final Logger log = LoggerFactory.getLogger(AdvancedFileController.class);
	
	@Resource
	private Validator validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

	// 기본 사항 조회 ( 심급 )
	@RequestMapping(value = "/getLawRecSel.do")
	public NexacroResult getLawsuitRecSelect(@ParamDataSet(name = "ds_instance", required = false)LawsuitRecVO lawsuitrecVO) throws Exception {

		NexacroResult result = new NexacroResult();

		List<LawsuitRecVO> lawsuitrecSelect = lawsuitrecService.getLawsuitRecSelect(lawsuitrecVO);
		List<LawsuitRecVO> lawsuitrecPladefSelect = lawsuitrecService.getLawsuitRecPladefSelect(lawsuitrecVO);
		List<LawsuitRecVO> lawsuitrecDetailSelect = lawsuitrecService.getLawsuitRecDetailSelect(lawsuitrecVO);
		
		result.addDataSet("ds_output", lawsuitrecSelect);
		result.addDataSet("ds_output2", lawsuitrecPladefSelect);
		
		if( lawsuitrecDetailSelect.size() > 0){
			result.addDataSet("ds_output3", lawsuitrecDetailSelect);
		}
			
		return result;
	}


	// 재판외화해 등록, 수정, 삭제
	@RequestMapping(value = "/createReconc")
	public NexacroResult createReconcil(@ParamDataSet(name = "ds_input", required = false)List<LawsuitRecVO> listRecVO) 
																												throws Exception {
		
		NexacroResult result = new NexacroResult();
		
		lawsuitrecService.createReconcil(listRecVO);
			
		return result;
	}

	
	// 소송종결 등록
	@RequestMapping( value ="/reconcReg.do")
	public NexacroResult mediationReg(@ParamDataSet(name = "LawsuitRecVo") LawsuitRecVO lawsuitrecVO) throws Exception{
		
		NexacroResult result = new NexacroResult();
	
		lawsuitrecService.reconcilReg(lawsuitrecVO);
			
		return result;
		
	}
   
	@RequestMapping(value = "/getCoun.do") 
	public NexacroResult getCount(@ParamDataSet(name = "LawsuitRecVo") LawsuitRecVO lawsuitrecVO) throws Exception{
	
		NexacroResult result = new NexacroResult();
	
		String aprvCheck = lawsuitrecService.getCount(lawsuitrecVO);
		LawsuitRecVO temp = new LawsuitRecVO();
		temp.setAprvCheck(aprvCheck);
		
		result.addDataSet("ds_output", temp);
		
		return result;
	}
}