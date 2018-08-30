package outlegal.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

public class OutPreiwrVO implements DataSetRowTypeAccessor  {

	private String lawsuitAdmNo;
	private String instAdmCode;
	private int preIwrNo;
	private String preIwrDfsDeg;
	private String preIwrIssuSepCode;
	private String preIwrName;
	private String preIwrCont;
	private String preIwrWritDate;
	private String preIwrCompWtr;
	private String preIwrOutLyrId;
	private String preIwrOutLyrName;

	private int rowType;
	
	public String getLawsuitAdmNo() {
		return lawsuitAdmNo;
	}

	public void setLawsuitAdmNo(String lawsuitAdmNo) {
		this.lawsuitAdmNo = lawsuitAdmNo;
	}

	public String getInstAdmCode() {
		return instAdmCode;
	}

	public void setInstAdmCode(String instAdmCode) {
		this.instAdmCode = instAdmCode;
	}

	public int getPreIwrNo() {
		return preIwrNo;
	}

	public void setPreIwrNo(int preIwrNo) {
		this.preIwrNo = preIwrNo;
	}

	public String getPreIwrDfsDeg() {
		return preIwrDfsDeg;
	}

	public void setPreIwrDfsDeg(String preIwrDfsDeg) {
		this.preIwrDfsDeg = preIwrDfsDeg;
	}

	public String getPreIwrIssuSepCode() {
		return preIwrIssuSepCode;
	}

	public void setPreIwrIssuSepCode(String preIwrIssuSepCode) {
		this.preIwrIssuSepCode = preIwrIssuSepCode;
	}

	public String getPreIwrName() {
		return preIwrName;
	}

	public void setPreIwrName(String preIwrName) {
		this.preIwrName = preIwrName;
	}

	public String getPreIwrCont() {
		return preIwrCont;
	}

	public void setPreIwrCont(String preIwrCont) {
		this.preIwrCont = preIwrCont;
	}

	public String getPreIwrWritDate() {
		return preIwrWritDate;
	}

	public void setPreIwrWritDate(String preIwrWritDate) {
		this.preIwrWritDate = preIwrWritDate;
	}

	public String getPreIwrCompWtr() {
		return preIwrCompWtr;
	}

	public void setPreIwrCompWtr(String preIwrCompWtr) {
		this.preIwrCompWtr = preIwrCompWtr;
	}

	public String getPreIwrOutLyrId() {
		return preIwrOutLyrId;
	}

	public void setPreIwrOutLyrId(String preIwrOutLyrId) {
		this.preIwrOutLyrId = preIwrOutLyrId;
	}

	public String getPreIwrOutLyrName() {
		return preIwrOutLyrName;
	}

	public void setPreIwrOutLyrName(String preIwrOutLyrName) {
		this.preIwrOutLyrName = preIwrOutLyrName;
	}

	@Override
	public int getRowType() {
		return rowType;
	}

	@Override
	public void setRowType(int rowType) {
		this.rowType = rowType;
		
	}

}
