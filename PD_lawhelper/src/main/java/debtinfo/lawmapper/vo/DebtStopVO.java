package debtinfo.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

public class DebtStopVO implements DataSetRowTypeAccessor{

	private int rowType;
	
	private String adminStopNo;
	private String debtorListNo;
	private String adminStopSignCheck;
	private String adminStopReasonCode;
	private String adminStopReason;
	private String adminStopMoney;
	private String adminStopInterest;
	private String adminStopDebtReturnMoney;
	private String adminStopRequestDate;
	private String adminStopSignEiNo;
	private String adminStopSignDate;
	private String adminStopSignerComment;
	private String adminStopProgressSummary;
	private String adminStopRegistDate;
	private String adminStopInput;
	private String adminStopEtc;
	private String adminStopCd;
	private String inputName;
	private String sabunName;
	private String signerSabunName;
	
	public String getAdminStopNo() {
		return adminStopNo;
	}
	public void setAdminStopNo(String adminStopNo) {
		this.adminStopNo = adminStopNo;
	}
	public String getDebtorListNo() {
		return debtorListNo;
	}
	public void setDebtorListNo(String debtorListNo) {
		this.debtorListNo = debtorListNo;
	}
	public String getAdminStopSignCheck() {
		return adminStopSignCheck;
	}
	public void setAdminStopSignCheck(String adminStopSignCheck) {
		this.adminStopSignCheck = adminStopSignCheck;
	}
	public String getAdminStopReasonCode() {
		return adminStopReasonCode;
	}
	public void setAdminStopReasonCode(String adminStopReasonCode) {
		this.adminStopReasonCode = adminStopReasonCode;
	}
	public String getAdminStopReason() {
		return adminStopReason;
	}
	public void setAdminStopReason(String adminStopReason) {
		this.adminStopReason = adminStopReason;
	}
	public String getAdminStopMoney() {
		return adminStopMoney;
	}
	public void setAdminStopMoney(String adminStopMoney) {
		this.adminStopMoney = adminStopMoney;
	}
	public String getAdminStopInterest() {
		return adminStopInterest;
	}
	public void setAdminStopInterest(String adminStopInterest) {
		this.adminStopInterest = adminStopInterest;
	}
	public String getAdminStopDebtReturnMoney() {
		return adminStopDebtReturnMoney;
	}
	public void setAdminStopDebtReturnMoney(String adminStopDebtReturnMoney) {
		this.adminStopDebtReturnMoney = adminStopDebtReturnMoney;
	}
	public String getAdminStopRequestDate() {
		return adminStopRequestDate;
	}
	public void setAdminStopRequestDate(String adminStopRequestDate) {
		this.adminStopRequestDate = adminStopRequestDate;
	}
	public String getAdminStopSignEiNo() {
		return adminStopSignEiNo;
	}
	public void setAdminStopSignEiNo(String adminStopSignEiNo) {
		this.adminStopSignEiNo = adminStopSignEiNo;
	}
	public String getAdminStopSignDate() {
		return adminStopSignDate;
	}
	public void setAdminStopSignDate(String adminStopSignDate) {
		this.adminStopSignDate = adminStopSignDate;
	}
	public String getAdminStopSignerComment() {
		return adminStopSignerComment;
	}
	public void setAdminStopSignerComment(String adminStopSignerComment) {
		this.adminStopSignerComment = adminStopSignerComment;
	}
	public String getAdminStopProgressSummary() {
		return adminStopProgressSummary;
	}
	public void setAdminStopProgressSummary(String adminStopProgressSummary) {
		this.adminStopProgressSummary = adminStopProgressSummary;
	}
	public String getAdminStopRegistDate() {
		return adminStopRegistDate;
	}
	public void setAdminStopRegistDate(String adminStopRegistDate) {
		this.adminStopRegistDate = adminStopRegistDate;
	}
	public String getAdminStopInput() {
		return adminStopInput;
	}
	public void setAdminStopInput(String adminStopInput) {
		this.adminStopInput = adminStopInput;
	}
	public String getAdminStopEtc() {
		return adminStopEtc;
	}
	public void setAdminStopEtc(String adminStopEtc) {
		this.adminStopEtc = adminStopEtc;
	}
	public String getAdminStopCd() {
		return adminStopCd;
	}
	public void setAdminStopCd(String adminStopCd) {
		this.adminStopCd = adminStopCd;
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
	public String getSignerSabunName() {
		return signerSabunName;
	}
	public void setSignerSabunName(String signerSabunName) {
		this.signerSabunName = signerSabunName;
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
