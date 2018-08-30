package register.lawmapper.vo;

public class RegisterSearchVo {
	private String code;// 검색코드

	private String search1;// 코드명
	private String search2;// 검색명

	private String pg; // 페이지
	private String count; // 총 게시물 수

	private String debtorNo; // 채무자 번호
	private String seq; // 결제 순번
	private String yn; // 전결 여부

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSearch1() {
		return search1;
	}

	public void setSearch1(String search1) {
		this.search1 = search1;
	}

	public String getSearch2() {
		return search2;
	}

	public void setSearch2(String search2) {
		this.search2 = search2;
	}

	public String getPg() {
		return pg;
	}

	public void setPg(String pg) {
		this.pg = pg;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getDebtorNo() {
		return debtorNo;
	}

	public void setDebtorNo(String debtorNo) {
		this.debtorNo = debtorNo;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getYn() {
		return yn;
	}

	public void setYn(String yn) {
		this.yn = yn;
	}

}
