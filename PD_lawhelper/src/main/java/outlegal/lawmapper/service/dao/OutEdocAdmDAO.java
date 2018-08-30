package outlegal.lawmapper.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import outlegal.lawmapper.vo.OutEdocAdmVO;

@Repository("outEdocAdmDAO")
public class OutEdocAdmDAO {

	@Autowired
	private SqlSession session;
	
	public List<OutEdocAdmVO> getEdocAdmList(OutEdocAdmVO outEdocAdmVO) {
		
		return session.selectList("outEdocAdm.getEdocAdmList", outEdocAdmVO);
		
	}
	
	public void edocAdmInsert(OutEdocAdmVO outEdocAdmVO) {
		session.insert("outEdocAdm.edocAdmInsert", outEdocAdmVO);
	}
	public void edocAdmUpdate(OutEdocAdmVO outEdocAdmVO) {
		session.update("outEdocAdm.edocAdmUpdate", outEdocAdmVO);
	}
	public void edocAdmDelete(OutEdocAdmVO outEdocAdmVO) {
		session.delete("outEdocAdm.edocAdmDelete", outEdocAdmVO);
	}
	
}