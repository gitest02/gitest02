package insertlaw.lawmapper.service.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import insertlaw.lawmapper.vo.PrecedentInsertVO;

@Repository
public class PrecedentInsertDAO {
	@Autowired
	private SqlSession session;

	private String namespace = "insertlaw.lawmapper.service.dao.PrecedentInsertMapper";

	public void precedentInsert(PrecedentInsertVO precedentInsertVO)
			throws SQLException {
		session.update(namespace + ".precListInsert", precedentInsertVO);
		session.update(namespace + ".precTextInsert", precedentInsertVO);
	}

	public PrecedentInsertVO excelSearch(PrecedentInsertVO precedentInsertVO) {
		return session.selectOne(namespace + ".excelSearch", precedentInsertVO);
	}
}