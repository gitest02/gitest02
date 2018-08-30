package outlegal.lawmapper.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import outlegal.lawmapper.vo.OutLegalVO;

@Repository("outLegalDAO")
public class OutLegalDAO {
	
	@Autowired 
	private SqlSession session;

	public List<OutLegalVO> getOutList(OutLegalVO outLegalVO) {
		return session.selectList("outLegal.outList", outLegalVO);
	}

	public List<OutLegalVO> getComboList(OutLegalVO outLegalVO) {
		return session.selectList("outLegal.comboList", outLegalVO);
	}

	public List<OutLegalVO> getCostList(OutLegalVO outLegalVO) {
		return session.selectList("outLegal.costList", outLegalVO);
	}
	
	public void getOutUpdate(OutLegalVO outLegalVO) {
		System.out.println("뭘까? " + outLegalVO.getLegaladvRepWtr());
		session.update("outLegal.outUpdate", outLegalVO);
	}

	public void getCostInsert(OutLegalVO outLegalVO) {
		session.insert("outLegal.costInsert", outLegalVO);
	}
	public void getCostUpdate(OutLegalVO outLegalVO) {
		session.insert("outLegal.costUpdate", outLegalVO);
	}
	public void getCostDelete(OutLegalVO outLegalVO) {
		session.insert("outLegal.costDelete", outLegalVO);
	}

}