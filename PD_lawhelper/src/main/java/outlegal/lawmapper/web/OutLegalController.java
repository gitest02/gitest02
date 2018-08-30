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

import outlegal.lawmapper.service.OutLegalService;
import outlegal.lawmapper.vo.OutLegalVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class OutLegalController {

	private static final Logger log = LoggerFactory
			.getLogger(AdvancedFileController.class);

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}

	@Resource(name = "outLegalService")
	private OutLegalService outLegalService;

	@RequestMapping("/OutList.do")
	public NexacroResult outList(
			@ParamDataSet(name = "ds_search", required = false) OutLegalVO outLegalVO) {

		List<OutLegalVO> outList = outLegalService.getOutList(outLegalVO);

		NexacroResult result = new NexacroResult();
		
		result.addDataSet("ds_out", outList);

		return result;
	}

	@RequestMapping("/ComboList.do")
	public NexacroResult comboList(
			@ParamDataSet(name = "ds_code", required = false) OutLegalVO outLegalVO) {

		List<OutLegalVO> comboList = outLegalService.getComboList(outLegalVO);

		NexacroResult result = new NexacroResult();

		result.addDataSet("ds_combo", comboList);

		return result;
	}

	@RequestMapping("/CostList.do")
	public NexacroResult costList(
			@ParamDataSet(name = "ds_search", required = false) OutLegalVO outLegalVO) {

		List<OutLegalVO> costList = outLegalService.getCostList(outLegalVO);

		NexacroResult result = new NexacroResult();

		result.addDataSet("ds_cost", costList);

		return result;

	}

	@RequestMapping("/CostInsert.do")
	public NexacroResult costInsert(
			@ParamDataSet(name = "ds_cost", required = false) List<OutLegalVO> listVO) {

		outLegalService.getCostInsert(listVO);

		NexacroResult result = new NexacroResult();

		return result;

	}

	@RequestMapping("/OutUpdate.do")
	public NexacroResult outUpdate(
			@ParamDataSet(name = "ds_out", required = false) OutLegalVO outLegalVO) {

		outLegalService.getOutUpdate(outLegalVO);
		
		NexacroResult result = new NexacroResult();

		return result;
	}

}
