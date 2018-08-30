package debtinfo.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

public class DebtReVO implements DataSetRowTypeAccessor{

	private int rowType;
	
	private String moneyInNo;
	private String debtorListNo;
	private String moneyInSum;
	private String moneyInCode;
	private String moneyInReason;
	private String moneyInInterest;
	private String moneyInDayin;
	private String moneyInRegistDate;
	private String moneyInInput;
	private String moneyInEtc;
	private String inputName;
	private String sabunName;
	
	public String getMoneyInNo() {
		return moneyInNo;
	}
	public void setMoneyInNo(String moneyInNo) {
		this.moneyInNo = moneyInNo;
	}
	public String getDebtorListNo() {
		return debtorListNo;
	}
	public void setDebtorListNo(String debtorListNo) {
		this.debtorListNo = debtorListNo;
	}
	public String getMoneyInSum() {
		return moneyInSum;
	}
	public void setMoneyInSum(String moneyInSum) {
		this.moneyInSum = moneyInSum;
	}
	public String getMoneyInCode() {
		return moneyInCode;
	}
	public void setMoneyInCode(String moneyInCode) {
		this.moneyInCode = moneyInCode;
	}
	public String getMoneyInReason() {
		return moneyInReason;
	}
	public void setMoneyInReason(String moneyInReason) {
		this.moneyInReason = moneyInReason;
	}
	public String getMoneyInInterest() {
		return moneyInInterest;
	}
	public void setMoneyInInterest(String moneyInInterest) {
		this.moneyInInterest = moneyInInterest;
	}
	public String getMoneyInDayin() {
		return moneyInDayin;
	}
	public void setMoneyInDayin(String moneyInDayin) {
		this.moneyInDayin = moneyInDayin;
	}
	public String getMoneyInRegistDate() {
		return moneyInRegistDate;
	}
	public void setMoneyInRegistDate(String moneyInRegistDate) {
		this.moneyInRegistDate = moneyInRegistDate;
	}
	public String getMoneyInInput() {
		return moneyInInput;
	}
	public void setMoneyInInput(String moneyInInput) {
		this.moneyInInput = moneyInInput;
	}
	public String getMoneyInEtc() {
		return moneyInEtc;
	}
	public void setMoneyInEtc(String moneyInEtc) {
		this.moneyInEtc = moneyInEtc;
	}
	public String getInputName() {
		return inputName;
	}
	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	public String getSabunName() {
		return sabunName;
	}
	public void setSabunName(String sabunName) {
		this.sabunName = sabunName;
	}
	@Override
	public int getRowType() {
		return rowType;
	}
	@Override
	public void setRowType(int rowType) {
		this.rowType=rowType;
	}

}
