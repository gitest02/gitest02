package legal.lawmapper.service.dao;

import java.util.List;

import legal.lawmapper.vo.InstAdmSearchVO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import outlegal.lawmapper.vo.OutFixinfoVO;
import outlegal.lawmapper.vo.OutInstAdmSearchVO;

@Repository("InstAdmSearchDAO")
public class InstAdmSearchDAO {
	
	@Autowired
	private SqlSession session;
	
	// 소송관리번호 검색
	public List<InstAdmSearchVO> getInstAdmList(InstAdmSearchVO InstAdmSearchVO) {
		return session.selectList("InstAdmSearch.getInstAdmList", InstAdmSearchVO);
	}
	
	public List<InstAdmSearchVO> getLawsuitInfo(InstAdmSearchVO InstAdmSearchVO) {
		return session.selectList("InstAdmSearch.getLawsuitInfo", InstAdmSearchVO);
	}

}
