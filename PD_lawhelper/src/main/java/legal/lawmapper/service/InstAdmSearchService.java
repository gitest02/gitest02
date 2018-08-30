package legal.lawmapper.service;

import java.util.List;

import legal.lawmapper.vo.InstAdmSearchVO;

public interface InstAdmSearchService {

	List<InstAdmSearchVO> getInstAdmList(InstAdmSearchVO outInstAdmSearchVO);
	
	List<InstAdmSearchVO> getLawsuitInfo(InstAdmSearchVO outInstAdmSearchVO);
	
}
