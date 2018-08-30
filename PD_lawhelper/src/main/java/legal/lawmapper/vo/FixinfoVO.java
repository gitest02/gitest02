package legal.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

/*
 * TAB_LAW_FIXINFO			소송기일정보
 * 
 LAWSUIT_ADM_NO				소송관리번호			VARCHAR2
 INST_ADM_CODE				심급코드				VARCHAR2
 LAW_FIXINFO_NUM				일련번호				NUMBER
 LAW_FIXINFO_SEPCODE			기일구분코드			VARCHAR2
 LAW_FIXINFO_DATE			기일일시				DATE
 LAW_FIXINFO_PLC				기일장소				VARCHAR2
 LAW_FIXINFO_MAIN_ISSU		주요쟁점사항			VARCHAR2
 LAW_FIXINFO_CP_INSI			당사주장				VARCHAR2
 LAW_FIXINFO_OTH_INSI		상대방주장				VARCHAR2
 LAW_FIXINFO_CORT_OPIN		재판부의견				VARCHAR2
 LAW_FIXINFO_LYR_OPIN		변호사의견				VARCHAR2
 LAW_FIXINFO_DLIN_DATE		기일마감일시			DATE
 */

public class FixinfoVO implements DataSetRowTypeAccessor {
									
	private String lawsuitAdmNo;
	private String instAdmCode;
	private int lawFixinfoNum;
	private String lawFixinfoSepCode;
	private String lawFixinfoSepName;
	private String lawFixinfoDate;
	private String lawFixinfoPlc;
	private String lawFixinfoMainIssu;
	private String lawFixinfoCpInsi;
	private String lawFixinfoOthInsi;
	private String lawFixinfoCortOpin;
	private String lawFixinfoLyrOpin;
	private String lawFixinfoDlinDate;
	private String lawsuitNotiAdmNo;
	private String lawsuitNotiCont;

	private String codeNo;
	private String codeName;

	private int rowType;

	public String getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

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

	public int getLawFixinfoNum() {
		return lawFixinfoNum;
	}

	public void setLawFixinfoNum(int lawFixinfoNum) {
		this.lawFixinfoNum = lawFixinfoNum;
	}

	public String getLawFixinfoSepCode() {
		return lawFixinfoSepCode;
	}

	public void setLawFixinfoSepCode(String lawFixinfoSepCode) {
		this.lawFixinfoSepCode = lawFixinfoSepCode;
	}

	public String getLawFixinfoSepName() {
		return lawFixinfoSepName;
	}

	public void setLawFixinfoSepName(String lawFixinfoSepName) {
		this.lawFixinfoSepName = lawFixinfoSepName;
	}

	public String getLawFixinfoDate() {
		return lawFixinfoDate;
	}

	public void setLawFixinfoDate(String lawFixinfoDate) {
		this.lawFixinfoDate = lawFixinfoDate;
	}

	public String getLawFixinfoPlc() {
		return lawFixinfoPlc;
	}

	public void setLawFixinfoPlc(String lawFixinfoPlc) {
		this.lawFixinfoPlc = lawFixinfoPlc;
	}

	public String getLawFixinfoMainIssu() {
		return lawFixinfoMainIssu;
	}

	public void setLawFixinfoMainIssu(String lawFixinfoMainIssu) {
		this.lawFixinfoMainIssu = lawFixinfoMainIssu;
	}

	public String getLawFixinfoCpInsi() {
		return lawFixinfoCpInsi;
	}

	public void setLawFixinfoCpInsi(String lawFixinfoCpInsi) {
		this.lawFixinfoCpInsi = lawFixinfoCpInsi;
	}

	public String getLawFixinfoOthInsi() {
		return lawFixinfoOthInsi;
	}

	public void setLawFixinfoOthInsi(String lawFixinfoOthInsi) {
		this.lawFixinfoOthInsi = lawFixinfoOthInsi;
	}

	public String getLawFixinfoCortOpin() {
		return lawFixinfoCortOpin;
	}

	public void setLawFixinfoCortOpin(String lawFixinfoCortOpin) {
		this.lawFixinfoCortOpin = lawFixinfoCortOpin;
	}

	public String getLawFixinfoLyrOpin() {
		return lawFixinfoLyrOpin;
	}

	public void setLawFixinfoLyrOpin(String lawFixinfoLyrOpin) {
		this.lawFixinfoLyrOpin = lawFixinfoLyrOpin;
	}

	public String getLawFixinfoDlinDate() {
		return lawFixinfoDlinDate;
	}

	public void setLawFixinfoDlinDate(String lawFixinfoDlinDate) {
		this.lawFixinfoDlinDate = lawFixinfoDlinDate;
	}

	@Override
	public int getRowType() {
		return rowType;
	}

	@Override
	public void setRowType(int rowType) {
		this.rowType = rowType;
	}

	/**
	 * @return the lawsuitNotiAdmNo
	 */
	public String getLawsuitNotiAdmNo() {
		return lawsuitNotiAdmNo;
	}

	/**
	 * @param lawsuitNotiAdmNo the lawsuitNotiAdmNo to set
	 */
	public void setLawsuitNotiAdmNo(String lawsuitNotiAdmNo) {
		this.lawsuitNotiAdmNo = lawsuitNotiAdmNo;
	}

	/**
	 * @return the lawsuitNotiCont
	 */
	public String getLawsuitNotiCont() {
		return lawsuitNotiCont;
	}

	/**
	 * @param lawsuitNotiCont the lawsuitNotiCont to set
	 */
	public void setLawsuitNotiCont(String lawsuitNotiCont) {
		this.lawsuitNotiCont = lawsuitNotiCont;
	}

}