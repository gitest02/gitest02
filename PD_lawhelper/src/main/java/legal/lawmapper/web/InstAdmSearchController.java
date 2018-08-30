package legal.lawmapper.web;

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

import legal.lawmapper.service.InstAdmSearchService;
import legal.lawmapper.vo.FixinfoVO;
import legal.lawmapper.vo.InstAdmSearchVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class InstAdmSearchController {
	
	private static final Logger log = LoggerFactory
			.getLogger(AdvancedFileController.class);

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}

	@Resource(name = "InstAdmSearchService")
	private InstAdmSearchService InstAdmSearchService;	
	
	@RequestMapping("/PrgrInstAdmList.do")
	public NexacroResult LawNoSearch(
			@ParamDataSet(name = "ds_search", required = false) InstAdmSearchVO InstAdmSearchVO) {

		List<InstAdmSearchVO> list = InstAdmSearchService.getInstAdmList(InstAdmSearchVO);
		
		NexacroResult result = new NexacroResult();
		
		result.addDataSet("ds_lawsuit", list);

		return result;

	}

	@RequestMapping("/getPrgrLawsuitInfo.do")
	public NexacroResult getLawsuitInfo(
			@ParamDataSet(name = "ds_search", required = false) InstAdmSearchVO InstAdmSearchVO) {

		NexacroResult result = new NexacroResult();

		List<InstAdmSearchVO> list = InstAdmSearchService.getLawsuitInfo(InstAdmSearchVO);

		result.addDataSet("ds_lawsuit", list);

		return result;
		
	}

}
