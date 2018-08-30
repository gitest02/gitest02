package debtor.lawmapper.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.web.UserController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import outlegal.lawmapper.vo.OutLegalVO;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

import debtor.lawmapper.service.DebtorService;
import debtor.lawmapper.vo.DebtorVO;

@Controller
public class DebtorController {
	private static final Logger log = LoggerFactory.getLogger(DebtorController.class);
	
	@Resource(name="DebtorServiceImpl")
	private DebtorService debtorService;
	
	@RequestMapping(value = "debtorList.do")
	public NexacroResult debtorList(@ParamDataSet(name = "ds_search", required = false) DebtorVO debtorVO){
		System.out.println("====================>>>>"+debtorVO.getDebtorListNo() );
		List<DebtorVO> ds_debtor = debtorService.debtorList(debtorVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_debtor", ds_debtor);
		
		return result;
	}
	
	@RequestMapping(value = "codeStatus.do")
	public NexacroResult comboList(@ParamDataSet(name = "ds_status", required = false) DebtorVO debtorVO) {

		List<DebtorVO> ds_status = debtorService.codeStatus(debtorVO);

		NexacroResult result = new NexacroResult();

		result.addDataSet("ds_status", ds_status);

		return result;
	}
	
	@RequestMapping(value = "debtorDetail.do")
	public NexacroResult debtorDetail(){
		
		List<DebtorVO> ds_debtor = debtorService.debtorDetail();
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_debtor", ds_debtor);
		
		return result;
	}
	
	@RequestMapping(value = "historyDetail.do")
	public NexacroResult historyDetail(){
		List<DebtorVO> ds_detail = debtorService.historyDetail();
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_detail", ds_detail);
		
		return result;
	}
	
	@RequestMapping(value = "historyProperty.do")
	public NexacroResult historyProperty(){
		List<DebtorVO> ds_property = debtorService.historyProperty();
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_property", ds_property);
		
		return result;
	}
	
	@RequestMapping(value = "historyFamily.do")
	public NexacroResult historyFamily(){
		List<DebtorVO> ds_family = debtorService.historyFamily();
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_family", ds_family);
		
		return result;
	}
}
