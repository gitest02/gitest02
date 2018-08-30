package deposit.lawmapper.service.impl;

/**  
 * @Class Name : DepositServiceImpl.java
 * @Description : 
 * @Modification Information  
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2013.08.07   신미향              최초생성
 * 
 */

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import deposit.lawmapper.service.DepositService;
import deposit.lawmapper.service.dao.DepositDao;
import deposit.lawmapper.vo.DepositVo;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;



@Service("depositService")
public class DepositServiceImpl extends AbstractServiceImpl implements DepositService{
	
	@Resource(name = "depositDao")
	private DepositDao depositDao;
	
	
	//사원 조회
	@Override
	public List<DepositVo> getMgrList(DepositVo depoVO) throws Exception {
		return depositDao.getMgrList(depoVO);
	}
	
}
