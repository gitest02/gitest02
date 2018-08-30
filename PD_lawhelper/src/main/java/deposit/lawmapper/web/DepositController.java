package deposit.lawmapper.web;

/**  
 * @Class Name : DepositController.java
 * @Description : 
 * @Modification Information  
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2018.08.16   이창민              최초생성
 *            
 */

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import nexacro.sample.web.AdvancedFileController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

import deposit.lawmapper.service.DepositService;
import deposit.lawmapper.vo.DepositVo;
import egovframework.rte.fdl.property.EgovPropertyService;


@Controller
public class DepositController {
	
	@Resource(name="depositService")
	private DepositService depositService;
	
	private static final Logger log = LoggerFactory.getLogger(AdvancedFileController.class);
	
	@Resource
	private Validator validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
	
	//사원 조회
	@RequestMapping(value="/MgrList.do")
	public NexacroResult mgrList(@ParamDataSet(name = "ds_mgr", required = false)DepositVo depoVO) throws Exception{
		
		NexacroResult result = new NexacroResult();
		
		List<DepositVo> mgrList = depositService.getMgrList(depoVO);
			
		result.addDataSet("ds_output", mgrList);
		
		return result;
	}
	
}
