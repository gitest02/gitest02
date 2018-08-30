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

import outlegal.lawmapper.service.OutFixinfoService;
import outlegal.lawmapper.vo.OutFixinfoVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class OutFixinfoController {

	private static final Logger log = LoggerFactory
			.getLogger(AdvancedFileController.class);

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}

	@Resource(name = "outFixinfoService")
	public OutFixinfoService outFixinfoService;

	@RequestMapping("/getLawFixinfoList.do")
	public NexacroResult getLawFixinfoList(
			@ParamDataSet(name = "ds_search", required = false) OutFixinfoVO outFixinfoVO) {

		List<OutFixinfoVO> list = outFixinfoService
				.getLawFixinfoList(outFixinfoVO);

		NexacroResult result = new NexacroResult();

		result.addDataSet("ds_fixinfo", list);

		return result;

	}

	@RequestMapping("/lawFixinfoChange.do")
	public NexacroResult lawFixinfoChange(
			@ParamDataSet(name = "ds_fixinfo", required = false) List<OutFixinfoVO> outFixinfoVO) {

		outFixinfoService.lawFixinfoChange(outFixinfoVO);

		NexacroResult result = new NexacroResult();

		return result;

	}

	@RequestMapping("/SepComboList.do")
	public NexacroResult comboList() {

		List<OutFixinfoVO> comboList = outFixinfoService.getSepComboList();

		NexacroResult result = new NexacroResult();

		result.addDataSet("ds_sep", comboList);

		return result;
	}	
	
}
