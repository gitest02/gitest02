package approval.lawmapper.service;

import java.util.List;

import approval.lawmapper.vo.ApprovalTotalVO;


public interface ApprovalService {
	
	//결제라인 리스트 가져오기 - approvalPorg
	List<ApprovalTotalVO> getApprovalPigList(ApprovalTotalVO approvalTotalVO);

}