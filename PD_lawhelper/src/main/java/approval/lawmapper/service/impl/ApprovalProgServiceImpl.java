package approval.lawmapper.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import mediation.lawmapper.vo.MediationVo;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import approval.lawmapper.service.ApprovalProgService;
import approval.lawmapper.service.dao.ApprovalProgDAO;
import approval.lawmapper.vo.ApprovalDefVO;
import approval.lawmapper.vo.ApprovalProgVO;
import approval.lawmapper.vo.ApprovalTotalVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("approProService")
public class ApprovalProgServiceImpl extends AbstractServiceImpl implements ApprovalProgService {

	@Resource(name = "approProDAO")
	private ApprovalProgDAO approvalProgDAO;

	//작성자 조회
	@Override
	public List<ApprovalProgVO>  getApprovalWriter(String sabun) {
		return approvalProgDAO.getApprovalWriter(sabun);
	}
	
	
	//기안자&작성자 등록
	public void createProg(List<ApprovalDefVO> approvalDefList) throws Exception {
		
		for (int i = 0; i < approvalDefList.size(); i++) {
			ApprovalDefVO approvalDefVO = approvalDefList.get(i);
			if (approvalDefVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) approvalDefVO;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println("insert 하겠습니다");
					approvalProgDAO.insertProg(approvalDefVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println("update 하겠습니다");
					approvalProgDAO.updateProg(approvalDefVO);
				} 
			}
		}
	}
	
//	//기안 정보 조회 (reload)
//	@Override
//	public List<ApprovalTotalVO> getApprovalVita(ApprovalTotalVO approvalTotalVO) {		
//		return approvalProgDAO.getApprovalVita(approvalTotalVO);
//	}
}