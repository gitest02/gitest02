package deposit.lawmapper.service;

/**  
 * @Class Name : DepositService.java
 * @Description : 
 * @Modification Information  
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2013.08.07   신미향              최초생성
 * 
 */

import java.sql.SQLException;
import java.util.List;

import deposit.lawmapper.vo.DepositVo;



public interface DepositService {
	
	//사원 조회
	List<DepositVo> getMgrList(DepositVo depoVO) throws Exception;

}
