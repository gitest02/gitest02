package outlegal.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import outlegal.lawmapper.service.OutLegalService;
import outlegal.lawmapper.service.dao.OutLegalDAO;
import outlegal.lawmapper.vo.OutLegalVO;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

@Service("outLegalService")
public class OutLegalServiceImpl implements OutLegalService {

	@Resource(name = "outLegalDAO")
	private OutLegalDAO outLegalDAO;

	@Override
	public List<OutLegalVO> getOutList(OutLegalVO outLegalVO) {
		return outLegalDAO.getOutList(outLegalVO);
	}

	@Override
	public List<OutLegalVO> getComboList(OutLegalVO outLegalVO) {
		return outLegalDAO.getComboList(outLegalVO);
	}

	@Override
	public List<OutLegalVO> getCostList(OutLegalVO outLegalVO) {
		return outLegalDAO.getCostList(outLegalVO);
	}

	@Override
	public void getCostInsert(List<OutLegalVO> listVO) {

		for (int i = 0; i < listVO.size(); i++) {
			OutLegalVO outLegalVO = listVO.get(i);
			if (outLegalVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) outLegalVO;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					outLegalDAO.getCostInsert(outLegalVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					outLegalDAO.getCostUpdate(outLegalVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					outLegalDAO.getCostDelete(outLegalVO);
				}
			}
		}
	}

	@Override
	public void getOutUpdate(OutLegalVO outLegalVO) {
		outLegalDAO.getOutUpdate(outLegalVO);
	}

}
