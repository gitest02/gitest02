package register.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import register.lawmapper.service.RegisterService2;
import register.lawmapper.service.dao.RegisterMapper;
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
@Service("registerService2")
public class RegisterService2Impl implements RegisterService2 {

	@Resource(name="registerMapper")
	private RegisterMapper registerMapper;
	
	//채무자 정보 검색
	//초기 저장시 최근 채무자 정보 불러오기
	@Override
	public List<RegisterVo> getDebtorNo() throws Exception {
		return registerMapper.getDebtorNo();
	}

	//채무자 정보 검색
	//채무자 번호로 기존정보 불러오기
	@Override
	public List<RegisterVo> getDebtorNo(RegisterVo vo) throws Exception {
		return registerMapper.getDebtorNo(vo);
	}

	//채무자 등록
	@Override
	public void registerInput(List<RegisterVo> vo) throws Exception {
		registerMapper.registerInput(vo);
		
	}

	//사원번호 조회
	@Override
	public List<RegisterResultVo> selectInsaSabun(RegisterSearchVo vo) throws Exception {
		System.out.println("service");
		return registerMapper.getInsaSabun(vo);
	}
	
}
