package debtor.lawmapper.service.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

import debtor.lawmapper.vo.DebtorVO;

@Repository("DebtorDAO")
public class DebtorDAO extends NexacroIbatisAbstractDAO {
	
	@Resource
	private SqlSession session;
	
	private static final String namespace = "debtor.lawmapper.service.dao.DebtorMapper"; 
	
	public List<DebtorVO> debtorList(DebtorVO debtorVO){
		System.out.println("===================="+debtorVO.getDebtorListNo());
		return session.selectList(namespace+".debtorList", debtorVO);
	}

	public List<DebtorVO> debtorDetail(){
		return session.selectList(namespace+".debtorDetail");
	}

	public List<DebtorVO> historyDetail() {
		return session.selectList(namespace+".historyDetail");
	}

	public List<DebtorVO> historyProperty() {
		return session.selectList(namespace+".historyProperty");
	}

	public List<DebtorVO> historyFamily() {
		return session.selectList(namespace+".historyFamily");
	}

	public List<DebtorVO> codeStatus(DebtorVO debtorVO) {
		return session.selectList(namespace+".comboStatus");
	}
}
