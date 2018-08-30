package mediation.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

public class MediationVo implements DataSetRowTypeAccessor {

	private static final long serialVersionUID = 1L;
	
	// 조정안 입.출력 값 생성
	// 넥사크로 데이터 셋과 대.소문자 동일
	// Lawsuit_ADM_NO 는 잘못된 예시 / LawsuitAdmNo 가 올바른 예시
	
	private String lawsuitAdmNo; //소송관리번호
	private String lawsuitCpPladefSepcode; // 당사 원피고 구분코드
	//private String LawsuitAplCaseCode; // 신청사건번호
	
	private String instAdmCode; //심급코드
	private String instAdmPrgrCode; //소송진행상태코드
	private String instAdmCortCode; // 수행법원코드
	private String instAdmCaseNo; //사건번호
	private String instAdmIssuChg; //쟁점금액
	private String instAdmCtpmgrName; //상대담당자명
	
	private String pladefSeq; // 원피고일련번호
	private String pladefSepCode; // 원피고구분코드
	
	private String pladefName; // 원피고명
	private String pladefRegNo; // 원피고등록번호
	private String pladefMainTel; // 원피고주요전화번호
	private String pladefAddTel; // 원피고추가전화번호
	private String pladefPos; //  원피고 우편번호
	private String pladefAddr1; // 원피고 주소
	private String pladefAddr2; // 원피고 주소2
	private String pladefClamVol; // 원피고별 청구소가
	
	private String pladefLawConcSepcode; // 원피고별종료구분코드
	private String pladefConcDate; // 종결일자
	private String pladefLawconcInstcode; // 원피고별종료심급구분코드
	
	private String pladefRegInst; // 원피고 등록 심급코드
	private String pladefEndInst; // 소송 종결 심급코드
	
	private int mediationSeq;
	private String mediationCont;
	private String mediationWritDate;
	private String mediationRefPoin;
	private String mediationChg;
	private String mediationTempSaveWtr;
	
	private String aprvCheck;
	
	private int rowType;  //rowType설정
	
	
	public String getLawsuitAdmNo() {
		return lawsuitAdmNo;
	}

	public void setLawsuitAdmNo(String lawsuitAdmNo) {
		this.lawsuitAdmNo = lawsuitAdmNo;
	}

	public String getLawsuitCpPladefSepcode() {
		return lawsuitCpPladefSepcode;
	}

	public void setLawsuitCpPladefSepcode(String lawsuitCpPladefSepcode) {
		this.lawsuitCpPladefSepcode = lawsuitCpPladefSepcode;
	}

	public String getInstAdmCode() {
		return instAdmCode;
	}

	public void setInstAdmCode(String instAdmCode) {
		this.instAdmCode = instAdmCode;
	}

	public String getInstAdmPrgrCode() {
		return instAdmPrgrCode;
	}

	public void setInstAdmPrgrCode(String instAdmPrgrCode) {
		this.instAdmPrgrCode = instAdmPrgrCode;
	}

	public String getInstAdmCortCode() {
		return instAdmCortCode;
	}

	public void setInstAdmCortCode(String instAdmCortCode) {
		this.instAdmCortCode = instAdmCortCode;
	}

	public String getInstAdmCaseNo() {
		return instAdmCaseNo;
	}

	public void setInstAdmCaseNo(String instAdmCaseNo) {
		this.instAdmCaseNo = instAdmCaseNo;
	}

	public String getInstAdmIssuChg() {
		return instAdmIssuChg;
	}

	public void setInstAdmIssuChg(String instAdmIssuChg) {
		this.instAdmIssuChg = instAdmIssuChg;
	}

	public String getInstAdmCtpmgrName() {
		return instAdmCtpmgrName;
	}

	public void setInstAdmCtpmgrName(String instAdmCtpmgrName) {
		this.instAdmCtpmgrName = instAdmCtpmgrName;
	}

	public String getPladefSeq() {
		return pladefSeq;
	}

	public void setPladefSeq(String pladefSeq) {
		this.pladefSeq = pladefSeq;
	}

	public String getPladefSepCode() {
		return pladefSepCode;
	}

	public void setPladefSepCode(String pladefSepCode) {
		this.pladefSepCode = pladefSepCode;
	}

	public String getPladefName() {
		return pladefName;
	}

	public void setPladefName(String pladefName) {
		this.pladefName = pladefName;
	}

	public String getPladefRegNo() {
		return pladefRegNo;
	}

	public void setPladefRegNo(String pladefRegNo) {
		this.pladefRegNo = pladefRegNo;
	}

	public String getPladefMainTel() {
		return pladefMainTel;
	}

	public void setPladefMainTel(String pladefMainTel) {
		this.pladefMainTel = pladefMainTel;
	}

	public String getPladefAddTel() {
		return pladefAddTel;
	}

	public void setPladefAddTel(String pladefAddTel) {
		this.pladefAddTel = pladefAddTel;
	}

	public String getPladefPos() {
		return pladefPos;
	}

	public void setPladefPos(String pladefPos) {
		this.pladefPos = pladefPos;
	}

	public String getPladefAddr1() {
		return pladefAddr1;
	}

	public void setPladefAddr1(String pladefAddr1) {
		this.pladefAddr1 = pladefAddr1;
	}

	public String getPladefAddr2() {
		return pladefAddr2;
	}

	public void setPladefAddr2(String pladefAddr2) {
		this.pladefAddr2 = pladefAddr2;
	}

	public String getPladefClamVol() {
		return pladefClamVol;
	}

	public void setPladefClamVol(String pladefClamVol) {
		this.pladefClamVol = pladefClamVol;
	}

	public String getPladefLawConcSepcode() {
		return pladefLawConcSepcode;
	}

	public void setPladefLawConcSepcode(String pladefLawConcSepcode) {
		this.pladefLawConcSepcode = pladefLawConcSepcode;
	}

	public String getPladefConcDate() {
		return pladefConcDate;
	}

	public void setPladefConcDate(String pladefConcDate) {
		this.pladefConcDate = pladefConcDate;
	}

	public String getPladefLawconcInstcode() {
		return pladefLawconcInstcode;
	}

	public void setPladefLawconcInstcode(String pladefLawconcInstcode) {
		this.pladefLawconcInstcode = pladefLawconcInstcode;
	}

	public String getPladefRegInst() {
		return pladefRegInst;
	}

	public void setPladefRegInst(String pladefRegInst) {
		this.pladefRegInst = pladefRegInst;
	}

	public String getPladefEndInst() {
		return pladefEndInst;
	}

	public void setPladefEndInst(String pladefEndInst) {
		this.pladefEndInst = pladefEndInst;
	}

	public int getMediationSeq() {
		return mediationSeq;
	}

	public void setMediationSeq(int mediationSeq) {
		this.mediationSeq = mediationSeq;
	}

	public String getMediationCont() {
		return mediationCont;
	}

	public void setMediationCont(String mediationCont) {
		this.mediationCont = mediationCont;
	}

	public String getMediationWritDate() {
		return mediationWritDate;
	}

	public void setMediationWritDate(String mediationWritDate) {
		this.mediationWritDate = mediationWritDate;
	}

	public String getMediationRefPoin() {
		return mediationRefPoin;
	}

	public void setMediationRefPoin(String mediationRefPoin) {
		this.mediationRefPoin = mediationRefPoin;
	}

	public String getMediationChg() {
		return mediationChg;
	}

	public void setMediationChg(String mediationChg) {
		this.mediationChg = mediationChg;
	}

	public String getMediationTempSaveWtr() {
		return mediationTempSaveWtr;
	}

	public void setMediationTempSaveWtr(String mediationTempSaveWtr) {
		this.mediationTempSaveWtr = mediationTempSaveWtr;
	}

	public String getAprvCheck() {
		return aprvCheck;
	}

	public void setAprvCheck(String aprvCheck) {
		this.aprvCheck = aprvCheck;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
