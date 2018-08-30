package debtinfo.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

public class DebtOccVO implements DataSetRowTypeAccessor{

	private int rowType;
	
	private String debtorListNo;
	private String debtorOccNo;
	private String debtorOccStartdate;
	private String debtorOccEnddate;
	private String debtorOccCode;
	private String debtorOccReason;
	private String debtorOccCheck;
	private String debtorOccPrice;
	private String debtorOccRegistDate;
	private String debtorOccInput;
	private String debtorOccEtc;
	private String debtorOccInterest;
	private String inputName;
	private String sabunName;
	
	public String getDebtorListNo() {
		return debtorListNo;
	}
	public void setDebtorListNo(String debtorListNo) {
		this.debtorListNo = debtorListNo;
	}
	public String getDebtorOccNo() {
		return debtorOccNo;
	}
	public void setDebtorOccNo(String debtorOccNo) {
		this.debtorOccNo = debtorOccNo;
	}
	public String getDebtorOccStartdate() {
		return debtorOccStartdate;
	}
	public void setDebtorOccStartdate(String debtorOccStartdate) {
		this.debtorOccStartdate = debtorOccStartdate;
	}
	public String getDebtorOccEnddate() {
		return debtorOccEnddate;
	}
	public void setDebtorOccEnddate(String debtorOccEnddate) {
		this.debtorOccEnddate = debtorOccEnddate;
	}
	public String getDebtorOccCode() {
		return debtorOccCode;
	}
	public void setDebtorOccCode(String debtorOccCode) {
		this.debtorOccCode = debtorOccCode;
	}
	public String getDebtorOccReason() {
		return debtorOccReason;
	}
	public void setDebtorOccReason(String debtorOccReason) {
		this.debtorOccReason = debtorOccReason;
	}
	public String getDebtorOccCheck() {
		return debtorOccCheck;
	}
	public void setDebtorOccCheck(String debtorOccCheck) {
		this.debtorOccCheck = debtorOccCheck;
	}
	public String getDebtorOccPrice() {
		return debtorOccPrice;
	}
	public void setDebtorOccPrice(String debtorOccPrice) {
		this.debtorOccPrice = debtorOccPrice;
	}
	public String getDebtorOccRegistDate() {
		return debtorOccRegistDate;
	}
	public void setDebtorOccRegistDate(String debtorOccRegistDate) {
		this.debtorOccRegistDate = debtorOccRegistDate;
	}
	public String getDebtorOccInput() {
		return debtorOccInput;
	}
	public void setDebtorOccInput(String debtorOccInput) {
		this.debtorOccInput = debtorOccInput;
	}
	public String getDebtorOccEtc() {
		return debtorOccEtc;
	}
	public void setDebtorOccEtc(String debtorOccEtc) {
		this.debtorOccEtc = debtorOccEtc;
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
	public String getDebtorOccInterest() {
		return debtorOccInterest;
	}
	public void setDebtorOccInterest(String debtorOccInterest) {
		this.debtorOccInterest = debtorOccInterest;
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