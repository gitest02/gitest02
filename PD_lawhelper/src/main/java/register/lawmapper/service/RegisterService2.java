package register.lawmapper.service;

import java.util.List;

import register.lawmapper.vo.RegisterResultVo;
import register.lawmapper.vo.RegisterSearchVo;
import register.lawmapper.vo.RegisterVo;

/**
 * 채무자 등록
 * 
 * @author Kim YeongWoo
 * @since 22.08.2018
 * @version 1.0
 * @see
 */
public interface RegisterService2 {
	//채무자 정보 검색
	//초기 저장시 최근 채무자 정보 불러오기
	List<RegisterVo> getDebtorNo() throws Exception;          
	//채무자 정보 검색
	//채무자 번호로 기존정보 불러오기
	List<RegisterVo> getDebtorNo(RegisterVo vo) throws Exception; 
	//채무자 등록
	void registerInput(List<RegisterVo> vo) throws Exception;
	//사원번호 조회
	List<RegisterResultVo> selectInsaSabun(RegisterSearchVo selectVo) throws Exception;
}
