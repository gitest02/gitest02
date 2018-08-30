package outlegal.lawmapper.service;

import java.util.List;

import outlegal.lawmapper.vo.OutFixinfoVO;

public interface OutFixinfoService {

	List<OutFixinfoVO> getLawFixinfoList(OutFixinfoVO outFixinfoVO);
	
	public void lawFixinfoChange(List<OutFixinfoVO> outFixinfoVO);
	
	public List<OutFixinfoVO> getSepComboList();
	
}