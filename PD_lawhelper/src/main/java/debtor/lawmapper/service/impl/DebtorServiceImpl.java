package debtor.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import debtor.lawmapper.service.DebtorService;
import debtor.lawmapper.service.dao.DebtorDAO;
import debtor.lawmapper.vo.DebtorVO;

@Service("DebtorServiceImpl")
public class DebtorServiceImpl implements DebtorService{

	@Resource(name="DebtorDAO")
	private DebtorDAO DebtorDAO;
	
	@Override
	public List<DebtorVO> debtorList(DebtorVO debtorVO) {
		return DebtorDAO.debtorList(debtorVO);
	}

	@Override
	public List<DebtorVO> debtorDetail() {
		return DebtorDAO.debtorDetail();
	}

	@Override
	public List<DebtorVO> historyDetail() {
		return DebtorDAO.historyDetail();
	}

	@Override
	public List<DebtorVO> historyProperty() {
		return DebtorDAO.historyProperty();
	}

	@Override
	public List<DebtorVO> historyFamily() {
		return DebtorDAO.historyFamily();
	}

	@Override
	public List<DebtorVO> codeStatus(DebtorVO debtorVO) {
		return DebtorDAO.codeStatus(debtorVO);
	}


}
