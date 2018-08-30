package debtor.lawmapper.service;

import java.util.List;

import debtor.lawmapper.vo.DebtorVO;

public interface DebtorService {

	List<DebtorVO> debtorList(DebtorVO debtorVO);

	List<DebtorVO> debtorDetail();

	List<DebtorVO> historyDetail();

	List<DebtorVO> historyProperty();

	List<DebtorVO> historyFamily();

	List<DebtorVO> codeStatus(DebtorVO debtorVO);

}
