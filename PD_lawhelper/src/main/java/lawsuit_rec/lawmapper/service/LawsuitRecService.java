package lawsuit_rec.lawmapper.service;

import java.util.List;

import lawsuit_rec.lawmapper.vo.LawsuitRecVO;


public interface LawsuitRecService {

	// 기본 사항 조회 ( 심급 )
	public List<LawsuitRecVO> getLawsuitRecSelect(LawsuitRecVO lawsuitrecVO) throws Exception;
   
	// 기본 사항 조회 ( 원피고 )
	public List<LawsuitRecVO> getLawsuitRecPladefSelect(LawsuitRecVO lawsuitrecVO) throws Exception;
	
	// 재판외화해 상세 조회
	public List<LawsuitRecVO> getLawsuitRecDetailSelect(LawsuitRecVO lawsuitrecVO) throws Exception;

	// 재판외화해 등록,수정,삭제
	public void createReconcil(List<LawsuitRecVO> listRecVO) throws Exception;
	
	// 재판외화해 종결 등록,취소 
	public void reconcilReg(Object objectVo) throws Exception;
	
	// 종결 체크
	public String getCount(Object voObject) throws Exception;
}
