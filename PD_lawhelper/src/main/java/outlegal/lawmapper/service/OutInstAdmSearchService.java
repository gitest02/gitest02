package outlegal.lawmapper.service;

import java.util.List;

import outlegal.lawmapper.vo.OutInstAdmSearchVO;

public interface OutInstAdmSearchService {

	List<OutInstAdmSearchVO> getInstAdmList(OutInstAdmSearchVO outInstAdmSearchVO);
	
	List<OutInstAdmSearchVO> getLawsuitInfo(OutInstAdmSearchVO outInstAdmSearchVO);
	
}
