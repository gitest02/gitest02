package stats.lawmapper.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import stats.lawmapper.vo.ResReqVo;
import stats.lawmapper.vo.StatsVo;
import stats.lawmapper.vo.UserVo;


@Repository("statsDao")
public class StatsDao {

	@Autowired
	private SqlSessionTemplate sqlsession;
	private static final String NAMESPACE = "stats.lawmapper.service.dao.StatsMapper";
	public List<UserVo> getStatsUserList(StatsVo uservo) {
		// TODO Auto-generated method stub
		return sqlsession.selectList(NAMESPACE+".getStatsUserList", uservo);
	}
	public List<ResReqVo> getResReqList(ResReqVo resvo) {
		// TODO Auto-generated method stub
		return sqlsession.selectList(NAMESPACE+".getResReqList",resvo);
	}
}