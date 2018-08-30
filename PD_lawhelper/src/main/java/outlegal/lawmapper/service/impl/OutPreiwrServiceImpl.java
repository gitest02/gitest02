package outlegal.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import outlegal.lawmapper.service.OutPreiwrService;
import outlegal.lawmapper.service.dao.OutPreiwrDAO;
import outlegal.lawmapper.vo.OutPreiwrVO;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;


@Service("outPreiwrService")
public class OutPreiwrServiceImpl implements OutPreiwrService{

	@Resource(name = "outPreiwrDAO")
	private OutPreiwrDAO outPreiwrDAO;
	
	@Override
	public List<OutPreiwrVO> getPreiwrList(OutPreiwrVO outPreiwrVO) {
		return outPreiwrDAO.getPreiwrList(outPreiwrVO);
	}

	@Override
	public void preiwrChange(List<OutPreiwrVO> listVO) {
		
		for (int i = 0; i < listVO.size(); i++) {
			OutPreiwrVO outPreiwrVO = listVO.get(i);
			if (outPreiwrVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) outPreiwrVO;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println("insert");
					outPreiwrDAO.preiwrInsert(outPreiwrVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println("update");
					outPreiwrDAO.preiwrUpdate(outPreiwrVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					System.out.println("delete");
					outPreiwrDAO.preiwrDelete(outPreiwrVO);
				}
			}
		}
		
	}


}