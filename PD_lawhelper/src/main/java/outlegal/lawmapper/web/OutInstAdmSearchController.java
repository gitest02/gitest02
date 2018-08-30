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

import outlegal.lawmapper.service.OutInstAdmSearchService;
import outlegal.lawmapper.vo.OutFixinfoVO;
import outlegal.lawmapper.vo.OutInstAdmSearchVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class OutInstAdmSearchController {
	
	private static final Logger log = LoggerFactory
			.getLogger(AdvancedFileController.class);

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}

	@Resource(name = "outInstAdmSearchService")
	private OutInstAdmSearchService outInstAdmSearchService;	
	
	@RequestMapping("/InstAdmList.do")
	public NexacroResult LawNoSearch(@ParamDataSet(name = "ds_search", required = false) OutInstAdmSearchVO outInstAdmSearchVO) {

		List<OutInstAdmSearchVO> list = outInstAdmSearchService.getInstAdmList(outInstAdmSearchVO);
		
		NexacroResult result = new NexacroResult();
		
		result.addDataSet("ds_lawsuit", list);

		return result;

	}

	//소송번호 기본과 심급기본사항 조회
	@RequestMapping("/getLawsuitInfo.do")
	public NexacroResult getLawsuitInfo(
			@ParamDataSet(name = "ds_search", required = false) OutInstAdmSearchVO outInstAdmSearchVO) {

		NexacroResult result = new NexacroResult();

		List<OutInstAdmSearchVO> list = outInstAdmSearchService.getLawsuitInfo(outInstAdmSearchVO);

		result.addDataSet("ds_lawsuit", list);

		return result;
		
	}

}