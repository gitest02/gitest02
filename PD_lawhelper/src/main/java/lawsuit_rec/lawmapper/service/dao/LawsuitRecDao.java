package lawsuit_rec.lawmapper.service.dao;

import java.util.List;

import lawsuit_rec.lawmapper.vo.LawsuitRecVO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;






import egovframework.rte.psl.dataaccess.EgovAbstractDAO;


@Repository("lawRecDao")
public class LawsuitRecDao extends EgovAbstractDAO {
	
	@Autowired
	private SqlSession session;
	
	// 기본 사항 조회 ( 심급 )
	public List<LawsuitRecVO> getLawsuitRecSelect(LawsuitRecVO lawsuitrecVO){
		
		return session.selectList("lawRec.getLawsuitRecSelect",lawsuitrecVO);		
	}							  
    
	// 기본 사항 조회 ( 원피고 )
	public List<LawsuitRecVO> getLawsuitRecPladefSelect(LawsuitRecVO lawsuitrecVO) {
		
		return session.selectList("lawRec.getLawsuitRecPladefSelect",lawsuitrecVO);
	}
	
	// 재판외화해 상세 조회
	public List<LawsuitRecVO> getLawsuitRecDetailSelect(LawsuitRecVO lawsuitrecVO) {
		
		return session.selectList("lawRec.getLawsuitRecDetailSelect",lawsuitrecVO);
	}

	// 재판외화해 등록
	public void reconcil_insert(LawsuitRecVO lawsuitRecVO) {
		
		session.insert("lawRec.reconcil_insert",lawsuitRecVO);
	}

	// 재판외화해 수정
	public void reconcil_update(LawsuitRecVO lawsuitRecVO) {
		
		session.update("lawRec.reconcil_update",lawsuitRecVO);
	}

	// 재판외화해 삭제
	public void reconcil_delete(LawsuitRecVO lawsuitRecVO) {
		
		session.delete("lawRec.reconcil_delete",lawsuitRecVO);
	}

	// 재판외화해 종결 등록, 취소
	public int reconcilReg(LawsuitRecVO vo) {
		
		return  session.update("lawRec.reconcilReg",vo);
	}

	// 종결 체크
	public String getCount(LawsuitRecVO vo){
		 
		return (String)getSqlMapClientTemplate().queryForObject("lawRec.getCount", vo);
		
	}
	
	public String getLastCount(LawsuitRecVO vo){
		 
		return (String)getSqlMapClientTemplate().queryForObject("lawRec.getLastCount", vo);
		
	}
	
}