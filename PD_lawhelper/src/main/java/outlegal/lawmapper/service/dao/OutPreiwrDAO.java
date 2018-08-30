package outlegal.lawmapper.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import outlegal.lawmapper.vo.OutPreiwrVO;


@Repository("outPreiwrDAO")
public class OutPreiwrDAO {

	@Autowired
	SqlSession session;

	public List<OutPreiwrVO> getPreiwrList(OutPreiwrVO outPreiwrVO) {
		return session.selectList("outPreiwr.getPreiwrList", outPreiwrVO);
	}

	public void preiwrInsert(OutPreiwrVO outPreiwrVO) {
		session.insert("outPreiwr.preiwrInsert", outPreiwrVO);
	}

	public void preiwrUpdate(OutPreiwrVO outPreiwrVO) {
		session.update("outPreiwr.preiwrUpdate", outPreiwrVO);
	}

	public void preiwrDelete(OutPreiwrVO outPreiwrVO) {
		session.delete("outPreiwr.preiwrDelete", outPreiwrVO);
	}
	
}
