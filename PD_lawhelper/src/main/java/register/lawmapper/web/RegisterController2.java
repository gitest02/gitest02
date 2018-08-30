package register.lawmapper.web;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import register.lawmapper.service.RegisterService2;
import register.lawmapper.vo.RegisterResultVo;
import register.lawmapper.vo.RegisterSearchVo;
import register.lawmapper.vo.RegisterVo;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

/**
 * 채무자 등록
 * 
 * @author Kim YeongWoo
 * @since 22.08.2018
 * @version 1.0
 * @see
 */
@Controller
public class RegisterController2 {
	
	private static final Logger log = LoggerFactory.getLogger(RegisterController2.class);
	
	@Resource(name="registerService2")
	private RegisterService2 registerService2;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}
	
	// 조회하기
	@RequestMapping(value = "/register/registerSearch.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) RegisterVo searchVo) 
			throws Exception {
		System.out.println("controller");
		List<RegisterVo> userList = registerService2.getDebtorNo(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", userList);

		return result;
	}
	
	// 저장하기
	@RequestMapping(value = "/register/registerInput.do")
	public NexacroResult insertVo(@ParamDataSet(name = "ds_input", required = false) List<RegisterVo> searchVo) 
			throws Exception{
		System.out.println("controller");
		registerService2.registerInput(searchVo);
		
		NexacroResult result = new NexacroResult();

		return result;
		
	}
	
	//사원번호 조회
	@RequestMapping(value = "/register/selectInsaSabun.do")
	public NexacroResult selectInsaSabun(@ParamDataSet(name = "ds_input", required = false) RegisterSearchVo searchVo) 
			throws Exception {
		System.out.println("controller");
		
		List<RegisterResultVo> selectSabun = registerService2.selectInsaSabun(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", selectSabun);

		return result;
	}
	
	//우편번호 조회
	
}
