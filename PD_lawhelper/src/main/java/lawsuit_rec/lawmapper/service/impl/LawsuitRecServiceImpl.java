package lawsuit_rec.lawmapper.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import lawsuit_rec.lawmapper.service.LawsuitRecService;
import lawsuit_rec.lawmapper.service.dao.LawsuitRecDao;
import lawsuit_rec.lawmapper.vo.LawsuitRecVO;
import mediation.lawmapper.vo.MediationVo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;


@Service("lawsuitRecSer")
public class LawsuitRecServiceImpl extends AbstractServiceImpl implements LawsuitRecService {
	
	@Resource (name = "lawRecDao" )
	private LawsuitRecDao lawsuitRecDao;
	
	// 기본 사항 조회 ( 심급 )
	@Override
	public List<LawsuitRecVO> getLawsuitRecSelect(LawsuitRecVO lawsuitrecVO) throws Exception{
	
		return lawsuitRecDao.getLawsuitRecSelect(lawsuitrecVO);
	}
    
	// 기본 사항 조회 ( 원피고 )
	@Override
	public List<LawsuitRecVO> getLawsuitRecPladefSelect(LawsuitRecVO lawsuitrecVO) throws Exception{
		
		return lawsuitRecDao.getLawsuitRecPladefSelect(lawsuitrecVO);
	}
	
	// 재판외화해 상세 조회
	@Override
	public List<LawsuitRecVO> getLawsuitRecDetailSelect(LawsuitRecVO lawsuitrecVO) throws Exception{
		
		return lawsuitRecDao.getLawsuitRecDetailSelect(lawsuitrecVO);
	}
	
	// 재판외화해 등록, 수정 , 삭제
	@Override
	public void createReconcil(List<LawsuitRecVO> listRecVO) throws Exception {
		
		for (int i = 0; i < listRecVO.size(); i++) {
			LawsuitRecVO lawsuitRecVO = listRecVO.get(i);
			if (lawsuitRecVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) lawsuitRecVO;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println("insert 하겠습니다");
					lawsuitRecDao.reconcil_insert(lawsuitRecVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println("update 하겠습니다");
					lawsuitRecDao.reconcil_update(lawsuitRecVO); 
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					System.out.println("delete 하겠습니다");
					lawsuitRecDao.reconcil_delete(lawsuitRecVO);
				}
			}
		}	
		
//		Object vo = new Object();		
//		HashMap voMap = (HashMap<String, Object>) objectVo;
//		
//		List voInsertList = (List) voMap.get("insert");		//등록
//
//		for (int i = 0; i < voInsertList.size(); i++){
//			System.out.println("insert 통과");
//			vo = voInsertList.get(i);
//			lawsuitrecDao.reconcil_insert((LawsuitRecVO)vo);
//		}
//		
//		List voUpdateList = (List) voMap.get("update");		//수정
//
//		for (int i = 0; i < voUpdateList.size(); i++){
//			System.out.println("update 통과");
//			vo = voUpdateList.get(i);
//			lawsuitrecDao.reconcil_update((LawsuitRecVO)vo);
//		}
//		
//		List voDeleteList = (List) voMap.get("delete");		//삭제
//
//		for (int i = 0; i < voDeleteList.size(); i++){
//			System.out.println("delete 통과");
//			vo = voDeleteList.get(i);
//			lawsuitrecDao.reconcil_delete((LawsuitRecVO)vo);
//		}
		
	}
	
	
	// 재판외화해 종결 등록, 취소
	@Override
	public void reconcilReg(Object objectVo) throws Exception {
	
	    Object vo = new Object();
	
		HashMap voMap = (HashMap<String, Object>) objectVo;
		
		List voUpdateList = (List) voMap.get("update"); 
		
		for (int i = 0; i < voUpdateList.size(); i++) {
		
			vo = voUpdateList.get(i);
		
			lawsuitRecDao.reconcilReg((LawsuitRecVO) vo);
		}
	}

	// 종결시 결재상태 체크
	@Override
	public String getCount(Object voObject) throws Exception {
		
		String aprvCheck=""; // 리턴 변수
		
		HashMap voMap = (HashMap<String, Object>) voObject;
		List getCount = (List) voMap.get("normal"); 
		
		LawsuitRecVO vo = new LawsuitRecVO(); // vo 선언
		String[] maxCheck = new String[getCount.size()]; // 로우 수만큼 배열 생성  (확인용)
		
		int  nCount= 0; // 진행 갯수
		int  xCount= 0; // 진행 안된 갯수 
        
		for (int i = 0; i < getCount.size(); i++) {
			
			vo = (LawsuitRecVO)getCount.get(i); 
			
            String temp = lawsuitRecDao.getCount(vo); // 쿼리 실행 결과 받는 변수
           
            maxCheck[i] = temp; // 결과값을 배열에 담는다 (확인용)
            
            // 전체 결재내역 확인
	        if( temp == null){   // 결재를 안했을 경우
	            
	            xCount++;
	            
	        }else if( Integer.parseInt(temp) == 1){  // 결재가 진행중
	               
	            nCount++;
	              
	        }else if( Integer.parseInt(temp) == 0 ){ // 결재가 끝났을 경우
	          
	        }
	        
		}
		
		// 마지막 조정안의 결과값 확인
		vo = (LawsuitRecVO) getCount.get(0); 
		String lastTemp = lawsuitRecDao.getLastCount(vo);
		
		if( lastTemp == null ){  //결재를 안했을 경우 
			
			aprvCheck = getCount.size()+"&"+nCount+"&"+xCount+"&"+"X";
			
		}else if(Integer.parseInt( lastTemp ) ==1 ){ // 반려일 경우
			
			aprvCheck = getCount.size()+"&"+nCount+"&"+xCount+"&"+"Z";
			
		}else{  // 결재가 끝났을 경우, 결재가 진행중인 경우
			
			aprvCheck = getCount.size()+"&"+nCount+"&"+xCount+"&"+"Y";
		}
		
		String temp ="";
		for(String x : maxCheck ){temp+=" "+x+",";}
		System.out.println("@@@@@ 쿼리 리턴값: "+ temp+" and "+lastTemp); 
		System.out.println("@@@@@ 최종 리턴 값: "+ aprvCheck); 
		
		return aprvCheck;
	}


}