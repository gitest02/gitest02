package mediation.lawmapper.service.dao;

import java.util.List;

import mediation.lawmapper.vo.MediationVo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;


@Repository("mediationDao")
public class MediationDao extends EgovAbstractDAO {
	
	@Autowired
	private SqlSession session;

	//조회
	public List<MediationVo> getMediationInstList(MediationVo mediationVo){
		return session.selectList("mediation.getMediationInstList", mediationVo);
	}
	
	public List<MediationVo> getMediationPladefList(MediationVo mediationVo){
		return session.selectList("mediation.getMediationPladefList", mediationVo);
	}
    
	public List<MediationVo> getMediationDetail(MediationVo mediationVo){
		return session.selectList("mediation.getMediationDetailList", mediationVo);
	}
	
	//등록
	public void mediation_insert(MediationVo mediationVO) {
		session.insert("mediation.mediation_insert", mediationVO);
	}
	
	//수정
	public void mediation_update(MediationVo mediationVO){
		session.update("mediation.mediation_update",mediationVO);	
	}
	
	//삭제
	public void mediation_delete(MediationVo mediationVO) {
		session.delete("mediation.mediation_delete", mediationVO);
	}
	
	public int mediationReg(MediationVo vo) {
		return update("mediation.mediationReg",vo);	
	}

	public String getCount(MediationVo vo){
		return (String)getSqlMapClientTemplate().queryForObject("mediation.getCount", vo);
	}
	
	public String getLastCount(MediationVo vo){
		return (String)getSqlMapClientTemplate().queryForObject("mediation.getLastCount", vo);
	}
	
}
