package outlegal.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import outlegal.lawmapper.service.OutFixinfoService;
import outlegal.lawmapper.service.dao.OutFixinfoDAO;
import outlegal.lawmapper.vo.OutFixinfoVO;
import outlegal.lawmapper.vo.OutLegalVO;

@Service("outFixinfoService")
public class OutFixinfoServiceImpl implements OutFixinfoService {

	@Resource(name = "outFixinfoDAO")
	private OutFixinfoDAO outFixinfoDAO;

	@Override
	public List<OutFixinfoVO> getLawFixinfoList(OutFixinfoVO outFixinfoVO) {
		return outFixinfoDAO.getLawFixinfoList(outFixinfoVO);
	}

	@Override
	public void lawFixinfoChange(List<OutFixinfoVO> listVO) {

		for (int i = 0; i < listVO.size(); i++) {
			OutFixinfoVO outFixinfoVO = listVO.get(i);
			if (outFixinfoVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) outFixinfoVO;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					outFixinfoDAO.lawFixinfoInsert(outFixinfoVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					outFixinfoDAO.lawFixinfoUpdate(outFixinfoVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					outFixinfoDAO.lawFixinfoDelete(outFixinfoVO);
				}
			}
		}
		
		
		
	}

	@Override
	public List<OutFixinfoVO> getSepComboList() {
		return outFixinfoDAO.getSepComboList();
	}

}