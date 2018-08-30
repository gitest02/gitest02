package insertlaw.lawmapper.service.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import insertlaw.lawmapper.vo.ExpcListVO;

@Repository
public class ExpcInsertDAO {
	@Autowired 
	private SqlSession session;

	private String namespace = "insertlaw.lawmapper.service.dao.ExpcInsertMapper";

	public void expcInsert(ExpcListVO expcListVO) throws SQLException {
		session.update(namespace + ".expcListInsert", expcListVO);
		session.update(namespace + ".expcTextInsert", expcListVO);
	}

	public ExpcListVO excelSearch(ExpcListVO expcListVO) {
		return session.selectOne(namespace + ".excelSearch", expcListVO);
	}
}