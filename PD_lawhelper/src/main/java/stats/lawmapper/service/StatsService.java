package stats.lawmapper.service;

import java.util.List;

import stats.lawmapper.vo.ResReqVo;
import stats.lawmapper.vo.StatsVo;
import stats.lawmapper.vo.UserVo;

public interface StatsService {

	List<UserVo> getStatsUserList(StatsVo uservo);
	List<ResReqVo> getResReqList(ResReqVo resvo);
}
