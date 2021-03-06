package stats.lawmapper.web;

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

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

import stats.lawmapper.service.StatsService;
import stats.lawmapper.vo.ResReqVo;
import stats.lawmapper.vo.StatsVo;
import stats.lawmapper.vo.UserVo;
import util.com.utils.InsertLog;

@Controller
public class StatsController {

	private static final Logger log = LoggerFactory.getLogger(AdvancedFileController.class); 
	
	@Resource
	InsertLog InsertLog;
	
	@Resource
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	@Resource(name = "statsService")
	private StatsService statsService;
	
	
	@RequestMapping(value = "/searchUser.do")
	public NexacroResult getStatsUserList(@ParamDataSet(name="ds_in", required=false) StatsVo uservo) {
		System.out.println("searchUser controller 호출");
		List<UserVo> param = statsService.getStatsUserList(uservo); 
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_out", param);
		return result;
	}
	@RequestMapping(value = "/resReqList.do")
	public NexacroResult getResReqList(ResReqVo resvo) {
		System.out.println("resReqList controller 호출");
		List<ResReqVo> param = statsService.getResReqList(resvo); 
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_out", param);
		return result;
	}
}