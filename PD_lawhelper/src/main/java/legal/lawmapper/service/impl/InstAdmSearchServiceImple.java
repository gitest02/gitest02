package legal.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import legal.lawmapper.service.InstAdmSearchService;
import legal.lawmapper.vo.InstAdmSearchVO;
import legal.lawmapper.service.dao.InstAdmSearchDAO;

import org.springframework.stereotype.Service;

@Service("InstAdmSearchService")
public class InstAdmSearchServiceImple implements InstAdmSearchService {

	@Resource(name = "InstAdmSearchDAO")
	private InstAdmSearchDAO InstAdmSearchDAO;

	// 소송관리번호 검색
	@Override
	public List<InstAdmSearchVO> getInstAdmList(InstAdmSearchVO outInstAdmSearchVO) {
		return InstAdmSearchDAO.getInstAdmList(outInstAdmSearchVO);
	}
	
	@Override
	public List<InstAdmSearchVO> getLawsuitInfo(InstAdmSearchVO InstAdmSearchVO) {
		return InstAdmSearchDAO.getLawsuitInfo(InstAdmSearchVO);
	}	
	
}
