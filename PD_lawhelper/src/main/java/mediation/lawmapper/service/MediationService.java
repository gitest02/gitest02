package mediation.lawmapper.service;

import java.util.List;

import mediation.lawmapper.vo.MediationVo;


public interface MediationService {

	// 조정안 기본 사항 검색(심급)
	public List<MediationVo> getMediationInstList(MediationVo mediationVo) throws Exception; 
	
	// 조정안 기본 사항 검색(심급)
	public List<MediationVo> getMediationPladefList(MediationVo mediationVo) throws Exception; 
		
    // 조정안 세부사항검색
	public List<MediationVo> getMediationDetail(MediationVo mediationVo) throws Exception;
	
	// 조정안 등록,수정,삭제
	public void medChange(List<MediationVo> listMedVO) throws Exception;
	
    // 소송종결 등록
	public void mediationReg(Object voObject) throws Exception;

	// 종결체크
	public String getCount(Object voObject) throws Exception;
		
}
