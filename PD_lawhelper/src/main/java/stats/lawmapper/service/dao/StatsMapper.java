package stats.lawmapper.service.dao;

import java.util.List;

import stats.lawmapper.vo.ResReqVo;
import stats.lawmapper.vo.StatsVo;
import stats.lawmapper.vo.UserVo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * 소송미결 검색 위한 DAO
 * 
 * @author Kim YeongWoo
 * @since 20.08.2018
 * @version 0.1
 * @see
 */

@Mapper("statsMapper")
public interface StatsMapper {
	// 의뢰자 정보
	public List<UserVo> getStatsUserList(StatsVo uservo);
	// 소송미결 현황 정보
	public List<ResReqVo> getResReqList(ResReqVo resvo);
}