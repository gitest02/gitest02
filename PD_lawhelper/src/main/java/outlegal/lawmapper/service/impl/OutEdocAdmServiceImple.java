package outlegal.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import outlegal.lawmapper.service.OutEdocAdmService;
import outlegal.lawmapper.service.dao.OutEdocAdmDAO;
import outlegal.lawmapper.vo.OutEdocAdmVO;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

@Service("outEdocAdmService")
public class OutEdocAdmServiceImple implements OutEdocAdmService {

	@Resource(name = "outEdocAdmDAO")
	private OutEdocAdmDAO outEdocAdmDAO;

	@Override
	public List<OutEdocAdmVO> getEdocAdmList(OutEdocAdmVO outEdocAdmVO) {
		return outEdocAdmDAO.getEdocAdmList(outEdocAdmVO);
	}

	@Override
	public void edocAdmChange(List<OutEdocAdmVO> listVO) {
		for (int i = 0; i < listVO.size(); i++) {
			OutEdocAdmVO outEdocAdmVO = listVO.get(i);
			if (outEdocAdmVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) outEdocAdmVO;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					outEdocAdmDAO.edocAdmInsert(outEdocAdmVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					outEdocAdmDAO.edocAdmUpdate(outEdocAdmVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					outEdocAdmDAO.edocAdmDelete(outEdocAdmVO);
				}
			}
		}
		
	}

}