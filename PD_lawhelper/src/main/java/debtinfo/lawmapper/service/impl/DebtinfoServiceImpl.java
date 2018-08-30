package debtinfo.lawmapper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import debtinfo.lawmapper.service.DebtinfoService;
import debtinfo.lawmapper.service.dao.DebtinfoDAO;
import debtinfo.lawmapper.vo.DebtGiveUpVO;
import debtinfo.lawmapper.vo.DebtOccVO;
import debtinfo.lawmapper.vo.DebtReVO;
import debtinfo.lawmapper.vo.DebtStopVO;


@Service("DebtinfoServiceImpl")
public class DebtinfoServiceImpl implements DebtinfoService{

	@Resource(name="DebtinfoDAO")
	private DebtinfoDAO DebtinfoDAO;
	
	//채무등록 리스트 가져오기(select)
	@Override
	public List<DebtOccVO> debtorOccList() {
		return DebtinfoDAO.debtorOccList();
	}

	//환입관리 리스트 가져오기(select)
	@Override
	public List<DebtReVO> debtorReList() {
		return DebtinfoDAO.debtorReList();
	}

	//정지품의 리스트 가져오기(select)
	@Override
	public List<DebtStopVO> debtorStopList() {
		return DebtinfoDAO.debtorStopList();
	}

	//포기품의 리스트 가져오기(select)
	@Override
	public List<DebtGiveUpVO> debtorGiveUpList() {
		return DebtinfoDAO.debtorGiveUpList();
	}

}
