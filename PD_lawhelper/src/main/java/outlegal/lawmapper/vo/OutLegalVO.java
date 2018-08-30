package outlegal.lawmapper.vo;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

public class OutLegalVO implements DataSetRowTypeAccessor {

	// 법률자문의뢰
	private String legaladvLawAdvReqNo; // 법률자문의뢰번호
	private String legaladvOpenWtr; // 공개여부
	private String legaladvReqDeptCode; // 의뢰부서코드
	private String legaladvReqMgrCode; // 의뢰담당자코드
	private String legaladvReqDate; // 의뢰일자
	private String legaladvAdvTit; // 자문제목
	private String legaladvFactRela; // 사실관계
	private String legaladvQuesIssu; // 질의요지
	private String legaladvEtc; // 기타사항
	private String legaladvLawAdvCode; // 법률자문유형분류코드
	private String legaladvOutReqWtr; // 외부의뢰여부
	private String legaladvReviDay; // 검토일수
	private String legaladvRepDeptCode; // 회신부서코드
	private String legaladvRepMgrCode; // 회신담당자코드
	private String legaladvRepDate; // 회신일자
	private String legaladvRepCont; // 회신내용
	private String legaladvRepTit; // 회신제목
	private String legaladvRepWtr; // 회신여부
	private String legaladvRepWtrName; // 회신여부이름
	private String legaladvEtcRepPoin; // 기타회신사항
	private String legaladvOutReqTit; // 외부의뢰제목
	private String legaladvOutReqLyrid; // 외부의뢰변호사ID
	private String legaladvOutReqRepdate; // 외부의뢰회신요청일자
	private String legaladvOutReqDate; // 외부의뢰일자
	private String legaladvOutReqFact; // 외부의뢰사실관계
	private String legaladvOutReqQues; // 외부의뢰질의사항
	private String legaladvOutReqReq; // 외부의뢰요청사항

	private String legaladvLawAdvName; // 외부의뢰요청사항

	// 법률자문비
	private String legaladvCostLawadvReqno; // 법률자문의뢰번호
	private int legaladvCostLawadvSeq; // 법률자문비일련번호
	private int legaladvCostReqCost; // 자문수수료
	private int legaladvCostStax; // 부가세
	private int legaladvCostClamsumChg; // 청구합계금액
	private String legaladvCostRepCont; // 회신내용

	// 의뢰담당자, 회신담당자 조회
	private String reqMgrName;
	private String repMgrName;
	
	// 의뢰기간
	private String legaladvReqDate1;
	private String legaladvReqDate2;
	
	private String codeNo;
	private String codeName;
	private String classCode;
	
	private int rowType;
	
	public String getLegaladvRepWtrName() {
		return legaladvRepWtrName;
	}

	public void setLegaladvRepWtrName(String legaladvRepWtrName) {
		this.legaladvRepWtrName = legaladvRepWtrName;
	}

	public String getLegaladvLawAdvName() {
		return legaladvLawAdvName;
	}

	public void setLegaladvLawAdvName(String legaladvLawAdvName) {
		this.legaladvLawAdvName = legaladvLawAdvName;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

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

	public String getLegaladvLawAdvReqNo() {
		return legaladvLawAdvReqNo;
	}

	public void setLegaladvLawAdvReqNo(String legaladvLawAdvReqNo) {
		this.legaladvLawAdvReqNo = legaladvLawAdvReqNo;
	}

	public String getLegaladvOpenWtr() {
		return legaladvOpenWtr;
	}

	public void setLegaladvOpenWtr(String legaladvOpenWtr) {
		this.legaladvOpenWtr = legaladvOpenWtr;
	}

	public String getLegaladvReqDeptCode() {
		return legaladvReqDeptCode;
	}

	public void setLegaladvReqDeptCode(String legaladvReqDeptCode) {
		this.legaladvReqDeptCode = legaladvReqDeptCode;
	}

	public String getLegaladvReqMgrCode() {
		return legaladvReqMgrCode;
	}

	public void setLegaladvReqMgrCode(String legaladvReqMgrCode) {
		this.legaladvReqMgrCode = legaladvReqMgrCode;
	}

	public String getLegaladvReqDate() {
		return legaladvReqDate;
	}

	public void setLegaladvReqDate(String legaladvReqDate) {
		this.legaladvReqDate = legaladvReqDate;
	}

	public String getLegaladvAdvTit() {
		return legaladvAdvTit;
	}

	public void setLegaladvAdvTit(String legaladvAdvTit) {
		this.legaladvAdvTit = legaladvAdvTit;
	}

	public String getLegaladvFactRela() {
		return legaladvFactRela;
	}

	public void setLegaladvFactRela(String legaladvFactRela) {
		this.legaladvFactRela = legaladvFactRela;
	}

	public String getLegaladvQuesIssu() {
		return legaladvQuesIssu;
	}

	public void setLegaladvQuesIssu(String legaladvQuesIssu) {
		this.legaladvQuesIssu = legaladvQuesIssu;
	}

	public String getLegaladvEtc() {
		return legaladvEtc;
	}

	public void setLegaladvEtc(String legaladvEtc) {
		this.legaladvEtc = legaladvEtc;
	}

	public String getLegaladvLawAdvCode() {
		return legaladvLawAdvCode;
	}

	public void setLegaladvLawAdvCode(String legaladvLawAdvCode) {
		this.legaladvLawAdvCode = legaladvLawAdvCode;
	}

	public String getLegaladvOutReqWtr() {
		return legaladvOutReqWtr;
	}

	public void setLegaladvOutReqWtr(String legaladvOutReqWtr) {
		this.legaladvOutReqWtr = legaladvOutReqWtr;
	}

	public String getLegaladvReviDay() {
		return legaladvReviDay;
	}

	public void setLegaladvReviDay(String legaladvReviDay) {
		this.legaladvReviDay = legaladvReviDay;
	}

	public String getLegaladvRepDeptCode() {
		return legaladvRepDeptCode;
	}

	public void setLegaladvRepDeptCode(String legaladvRepDeptCode) {
		this.legaladvRepDeptCode = legaladvRepDeptCode;
	}

	public String getLegaladvRepMgrCode() {
		return legaladvRepMgrCode;
	}

	public void setLegaladvRepMgrCode(String legaladvRepMgrCode) {
		this.legaladvRepMgrCode = legaladvRepMgrCode;
	}

	public String getLegaladvRepDate() {
		return legaladvRepDate;
	}

	public void setLegaladvRepDate(String legaladvRepDate) {
		this.legaladvRepDate = legaladvRepDate;
	}

	public String getLegaladvRepCont() {
		return legaladvRepCont;
	}

	public void setLegaladvRepCont(String legaladvRepCont) {
		this.legaladvRepCont = legaladvRepCont;
	}

	public String getLegaladvRepTit() {
		return legaladvRepTit;
	}

	public void setLegaladvRepTit(String legaladvRepTit) {
		this.legaladvRepTit = legaladvRepTit;
	}

	public String getLegaladvRepWtr() {
		return legaladvRepWtr;
	}

	public void setLegaladvRepWtr(String legaladvRepWtr) {
		this.legaladvRepWtr = legaladvRepWtr;
	}

	public String getLegaladvEtcRepPoin() {
		return legaladvEtcRepPoin;
	}

	public void setLegaladvEtcRepPoin(String legaladvEtcRepPoin) {
		this.legaladvEtcRepPoin = legaladvEtcRepPoin;
	}

	public String getLegaladvOutReqTit() {
		return legaladvOutReqTit;
	}

	public void setLegaladvOutReqTit(String legaladvOutReqTit) {
		this.legaladvOutReqTit = legaladvOutReqTit;
	}

	public String getLegaladvOutReqLyrid() {
		return legaladvOutReqLyrid;
	}

	public void setLegaladvOutReqLyrid(String legaladvOutReqLyrid) {
		this.legaladvOutReqLyrid = legaladvOutReqLyrid;
	}

	public String getLegaladvOutReqRepdate() {
		return legaladvOutReqRepdate;
	}

	public void setLegaladvOutReqRepdate(String legaladvOutReqRepdate) {
		this.legaladvOutReqRepdate = legaladvOutReqRepdate;
	}

	public String getLegaladvOutReqDate() {
		return legaladvOutReqDate;
	}

	public void setLegaladvOutReqDate(String legaladvOutReqDate) {
		this.legaladvOutReqDate = legaladvOutReqDate;
	}

	public String getLegaladvOutReqFact() {
		return legaladvOutReqFact;
	}

	public void setLegaladvOutReqFact(String legaladvOutReqFact) {
		this.legaladvOutReqFact = legaladvOutReqFact;
	}

	public String getLegaladvOutReqQues() {
		return legaladvOutReqQues;
	}

	public void setLegaladvOutReqQues(String legaladvOutReqQues) {
		this.legaladvOutReqQues = legaladvOutReqQues;
	}

	public String getLegaladvOutReqReq() {
		return legaladvOutReqReq;
	}

	public void setLegaladvOutReqReq(String legaladvOutReqReq) {
		this.legaladvOutReqReq = legaladvOutReqReq;
	}

	public String getLegaladvCostLawadvReqno() {
		return legaladvCostLawadvReqno;
	}

	public void setLegaladvCostLawadvReqno(String legaladvCostLawadvReqno) {
		this.legaladvCostLawadvReqno = legaladvCostLawadvReqno;
	}

	public int getLegaladvCostLawadvSeq() {
		return legaladvCostLawadvSeq;
	}

	public void setLegaladvCostLawadvSeq(int legaladvCostLawadvSeq) {
		this.legaladvCostLawadvSeq = legaladvCostLawadvSeq;
	}

	public int getLegaladvCostReqCost() {
		return legaladvCostReqCost;
	}

	public void setLegaladvCostReqCost(int legaladvCostReqCost) {
		this.legaladvCostReqCost = legaladvCostReqCost;
	}

	public int getLegaladvCostStax() {
		return legaladvCostStax;
	}

	public void setLegaladvCostStax(int legaladvCostStax) {
		this.legaladvCostStax = legaladvCostStax;
	}

	public int getLegaladvCostClamsumChg() {
		return legaladvCostClamsumChg;
	}

	public void setLegaladvCostClamsumChg(int legaladvCostClamsumChg) {
		this.legaladvCostClamsumChg = legaladvCostClamsumChg;
	}

	public String getLegaladvCostRepCont() {
		return legaladvCostRepCont;
	}

	public void setLegaladvCostRepCont(String legaladvCostRepCont) {
		this.legaladvCostRepCont = legaladvCostRepCont;
	}

	public String getReqMgrName() {
		return reqMgrName;
	}

	public void setReqMgrName(String reqMgrName) {
		this.reqMgrName = reqMgrName;
	}

	public String getRepMgrName() {
		return repMgrName;
	}

	public void setRepMgrName(String repMgrName) {
		this.repMgrName = repMgrName;
	}

	public String getLegaladvReqDate1() {
		return legaladvReqDate1;
	}

	public void setLegaladvReqDate1(String legaladvReqDate1) {
		this.legaladvReqDate1 = legaladvReqDate1;
	}

	public String getLegaladvReqDate2() {
		return legaladvReqDate2;
	}

	public void setLegaladvReqDate2(String legaladvReqDate2) {
		this.legaladvReqDate2 = legaladvReqDate2;
	}

    @Override
    public int getRowType() {
        return this.rowType;
    }

    @Override
    public void setRowType(int rowType) {
        this.rowType = rowType;
    }

}
