package legal.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import legal.lawmapper.service.AlesSueService;
import legal.lawmapper.service.dao.AlesSueDAO;
import legal.lawmapper.vo.AlesSueVO;

@Service("alesSueService")
public class AlesSueServiceImpl implements AlesSueService {
	
	@Resource(name="alesSueDAO")
	AlesSueDAO alesSueDao;
	
	@Override
	public List<AlesSueVO> getAlesList(AlesSueVO alesSueVo){
		
		return alesSueDao.getAlesSueList(alesSueVo); 
	}

	@Override
	public void alesSueChange(List<AlesSueVO> list){
		
		//System.out.println("list: "+list);
		for (int i = 0; i < list.size(); i++) {
			AlesSueVO alesSueVo = list.get(i);
			if (alesSueVo instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) alesSueVo;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println(accessor.getRowType());
					System.out.println("insert");
					alesSueDao.alesSueInsert(alesSueVo);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println(accessor.getRowType());
					System.out.println("update");
					alesSueDao.alesSueUpdate(alesSueVo);
				} 
			}
		}
	}
}
