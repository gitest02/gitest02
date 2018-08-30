package outlegal.lawmapper.service;

import java.util.List;

import outlegal.lawmapper.vo.OutLegalVO;

public interface OutLegalService {
	
	List<OutLegalVO> getOutList(OutLegalVO outLegalVO);

	List<OutLegalVO> getComboList(OutLegalVO outLegalVO);

	List<OutLegalVO> getCostList(OutLegalVO outLegalVO);

	void getOutUpdate(OutLegalVO outLegalVO);
	
	void getCostInsert(List<OutLegalVO> listVO);
	
}