package nexacro.sample.service;



import java.util.List;

import nexacro.sample.vo.InterestVo;

public interface InterestService {
	


void modifyMultiInterest(List<InterestVo> modifyList);

//리스트
List<InterestVo>  selectInterestVoList();
//리스트 세부
List<InterestVo> selectDetailList(InterestVo interest_interestVo);


	
}