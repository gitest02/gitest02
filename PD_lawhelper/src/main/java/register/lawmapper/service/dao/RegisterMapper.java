package register.lawmapper.service.dao;

import java.util.List;

import register.lawmapper.vo.RegisterResultVo;
import register.lawmapper.vo.RegisterSearchVo;
import register.lawmapper.vo.RegisterVo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * 채무자 등록
 * 
 * @author Kim YeongWoo
 * @since 22.08.2018
 * @version 1.0
 * @see
 */
@Mapper("registerMapper")
public interface RegisterMapper {
	// 채무자 정보 가져오기-아이디 없을때
	public List<RegisterVo> getDebtorNo();
	// 채무자 정보 가져오기-아이디 있을때
	public List<RegisterVo> getDebtorNo(RegisterVo vo);
	// 채무자등록
	public void registerInput(List<RegisterVo> vo);
	// 사원번호 조회
	public List<RegisterResultVo> getInsaSabun(RegisterSearchVo vo);
	// 우편번호 조회
	
}
