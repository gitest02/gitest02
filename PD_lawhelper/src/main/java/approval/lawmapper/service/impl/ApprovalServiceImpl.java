package approval.lawmapper.service.impl;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import approval.lawmapper.service.ApprovalService;
import approval.lawmapper.service.dao.ApprovalDAO;
import approval.lawmapper.vo.ApprovalTotalVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
/**  
 * @Class Name : DepositServiceImpl.java
 * @Description : 
 * @Modification Information  
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2013.08.07   신미향              최초생성
 * 
 */

@Service("approvalService")
public class ApprovalServiceImpl extends AbstractServiceImpl implements ApprovalService {
	
	@Resource(name = "approvalDAO")
	private ApprovalDAO approvalDAO;
	
	
	//결제라인 리스트 가져오기 - approvalProg
	@Override
	public List<ApprovalTotalVO> getApprovalPigList(ApprovalTotalVO approvalTotalVO) {		
		return approvalDAO.getApprovalPigList(approvalTotalVO);
	}
	
}