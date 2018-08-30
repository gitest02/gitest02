package outlegal.lawmapper.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import outlegal.lawmapper.vo.OutFixinfoVO;
import outlegal.lawmapper.vo.OutLegalVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("outFixinfoDAO")
public class OutFixinfoDAO extends EgovAbstractDAO {

	@Autowired
	SqlSession session;

	public List<OutFixinfoVO> getLawFixinfoList(OutFixinfoVO outFixinfoVO) {
		return session.selectList("outFixinfo.getLawFixinfoList", outFixinfoVO);
	}
	
	public void lawFixinfoInsert(OutFixinfoVO outFixinfoVO) {
		session.insert("outFixinfo.lawFixinfoInsert", outFixinfoVO);
	}
	
	public void lawFixinfoUpdate(OutFixinfoVO outFixinfoVO) {
		session.update("outFixinfo.lawFixinfoUpdate", outFixinfoVO);
	}
	
	public void lawFixinfoDelete(OutFixinfoVO outFixinfoVO) {
		session.delete("outFixinfo.lawFixinfoDelete", outFixinfoVO);
	}
	
	public List<OutFixinfoVO> getSepComboList() {
		return session.selectList("outFixinfo.getSepComboList");
	}
	

}