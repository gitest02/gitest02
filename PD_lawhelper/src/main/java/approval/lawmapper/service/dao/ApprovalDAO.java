package approval.lawmapper.service.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import approval.lawmapper.vo.ApprovalTotalVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("approvalDAO")
public class ApprovalDAO extends EgovAbstractDAO {
		
	@Autowired
	private SqlSession session;
	
	
	//결제라인 리스트 가져오기 - approvalProg
	//@SuppressWarnings("unchecked")
	public List<ApprovalTotalVO> getApprovalPigList(ApprovalTotalVO approvalTotalVO) {
		return session.selectList("approval.getApprovalPigList", approvalTotalVO);
	}
	
}