package insertlaw.lawmapper.service.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import insertlaw.lawmapper.vo.DetcListVO;

@Repository
public class DetcInsertDAO {
	@Autowired 
	private SqlSession session;

	private String namespace = "insertlaw.lawmapper.service.dao.DetcInsertMapper";

	public void detcInsert(DetcListVO detcListVO) {
		session.update(namespace + ".detcListInsert", detcListVO);
		session.update(namespace + ".detcTextInsert", detcListVO);
	}

	public DetcListVO excelSearch(DetcListVO detcListVO) {
		return session.selectOne(namespace + ".excelSearch", detcListVO);
	}
}