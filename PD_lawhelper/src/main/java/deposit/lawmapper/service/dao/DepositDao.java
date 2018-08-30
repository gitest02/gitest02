package deposit.lawmapper.service.dao;

/**  
 * @Class Name : DepositDao.java
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

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import deposit.lawmapper.vo.DepositVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;



@Repository("depositDao")
public class DepositDao extends EgovAbstractDAO{
	
	@Autowired
	private SqlSession session;
	
	//사원 조회
	public List<DepositVo> getMgrList(DepositVo depoVO){
		//test
		System.out.println("getCodeNo ==========>>>>>>>>>> "+depoVO.getCodeNo());
		System.out.println("getCodeName ==========>>>>>>>>>> "+depoVO.getCodeName());
		
		return session.selectList("deposit.mgrList", depoVO);
	}
	
}
