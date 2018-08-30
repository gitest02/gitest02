package legal.lawmapper.service.dao;

import java.util.List;

import legal.lawmapper.vo.AlesSueVO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("alesSueDAO")
public class AlesSueDAO extends EgovAbstractDAO {

	@Autowired
	SqlSession session;
	
	public List<AlesSueVO> getAlesSueList(AlesSueVO alesSueVO) {
		List<AlesSueVO> list = session.selectList("alesSue.getAlesList", alesSueVO);
		return list;
	}

	public void alesSueInsert(AlesSueVO alesSueVO) {
		session.insert("alesSue.alesInsert", alesSueVO);
	}

	public void alesSueUpdate(AlesSueVO alesSueVO) {
		session.update("alesSue.alesUpdate", alesSueVO);
	}
	
}