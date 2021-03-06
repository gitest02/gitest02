package outlegal.lawmapper.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import outlegal.lawmapper.service.OutPreiwrService;
import outlegal.lawmapper.vo.OutPreiwrVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class OutPreiwrController {

	@Resource(name = "outPreiwrService")
	public OutPreiwrService outPreiwrService;

	@RequestMapping("/getPreiwrList.do")
	public NexacroResult getPreiwrDetailListSelect(
			@ParamDataSet(name = "ds_search", required = false) OutPreiwrVO outPreiwrVO) {

		List<OutPreiwrVO> list = outPreiwrService.getPreiwrList(outPreiwrVO);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_preiwr", list);

		return result;

	}

	@RequestMapping("/preiwrChange")
	public NexacroResult preiwrChange(
			@ParamDataSet(name = "ds_preiwr", required = false) List<OutPreiwrVO> listVO) {

		outPreiwrService.preiwrChange(listVO);

		NexacroResult result = new NexacroResult();

		return result;
	}

}
