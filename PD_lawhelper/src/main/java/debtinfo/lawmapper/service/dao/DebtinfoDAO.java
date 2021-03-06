package debtinfo.lawmapper.service.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

import debtinfo.lawmapper.vo.DebtGiveUpVO;
import debtinfo.lawmapper.vo.DebtOccVO;
import debtinfo.lawmapper.vo.DebtReVO;
import debtinfo.lawmapper.vo.DebtStopVO;

@Repository("DebtinfoDAO")
public class DebtinfoDAO extends NexacroIbatisAbstractDAO{

	@Resource
	private SqlSession session;

	private static final String namespace = "debtinfo.lawmapper.service.dao.DebtinfoMapper";

	//채무등록 리스트 가져오기(select)
	public List<DebtOccVO> debtorOccList(){
		return session.selectList(namespace+".debtorOccList");
	}

	//환입관리 리스트 가져오기(select)
	public List<DebtReVO> debtorReList() {
		return session.selectList(namespace+".debtorReList");
	}

	//정지품의 리스트 가져오기(select)
	public List<DebtStopVO> debtorStopList() {
		return session.selectList(namespace+".debtorStopList");
	}

	//포기품의 리스트 가져오기(select)
	public List<DebtGiveUpVO> debtorGiveUpList() {
		return session.selectList(namespace+".debtorGiveUpList");
	}
}
