package stats.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import stats.lawmapper.service.StatsService;
import stats.lawmapper.service.dao.StatsDao;
import stats.lawmapper.vo.ResReqVo;
import stats.lawmapper.vo.StatsVo;
import stats.lawmapper.vo.UserVo;


@Service("statsService")
public class StatsServiceImpl implements StatsService{

	@Resource(name = "statsDao")
	private StatsDao statsDao;
	

	@Override
	public List<UserVo> getStatsUserList(StatsVo uservo) {
		System.out.println("statsUserList service 호출");
		return statsDao.getStatsUserList(uservo);
	}


	@Override
	public List<ResReqVo> getResReqList(ResReqVo resvo) {
		System.out.println("resReqList service 호출");
		return statsDao.getResReqList(resvo);
	}

}
