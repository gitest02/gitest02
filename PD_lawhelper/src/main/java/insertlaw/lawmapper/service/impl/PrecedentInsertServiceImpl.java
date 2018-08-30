package insertlaw.lawmapper.service.impl;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import insertlaw.lawmapper.service.PrecedentInsertService;
import insertlaw.lawmapper.service.dao.PrecedentInsertDAO;
import insertlaw.lawmapper.util.ExcelRead;
import insertlaw.lawmapper.util.ExcelReadOption;
import insertlaw.lawmapper.vo.PrecedentInsertVO;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexacro.xapi.data.DataSet;

@Service("precedentInsertService")
public class PrecedentInsertServiceImpl implements PrecedentInsertService {

	@Resource(name = "precedentInsertDAO")
	private PrecedentInsertDAO precedentInsertDAO;

	@Override
	public void excelTodataset(File destFile, DataSet resultDs)
			throws Exception {
		ExcelReadOption excelReadOption = new ExcelReadOption();
        excelReadOption.setFilePath(destFile.getAbsolutePath());
        excelReadOption.setOutputColumns("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P");
        excelReadOption.setStartRow(1);
        
         
        List<Map<String, String>>excelContent =ExcelRead.read(excelReadOption);
        
        for(int i=0; i<excelContent.size();i++){
        	Map<String, String> article = excelContent.get(i);
        	System.out.println("행 수 : "+excelContent.size());
        	System.out.println("행 번호 : "+i);
        	String precno = article.get("A");
        	String casename = article.get("B");
        	String caseno = article.get("C");
        	String judgedate = article.get("D");
    		String courtname = article.get("E");
    		String courtclasscode = article.get("F");
    		String caseclassname = article.get("G");
    		String caseclasscode = article.get("H");
    		String judgeclassname = article.get("I");
    		String judge = article.get("J");
    		String precdetaillink = article.get("K");
    		String casetext = article.get("L");
    		String judgetext = article.get("M");
    		String referlaw = article.get("N");
    		String referjudge = article.get("O");
    		String maintext = article.get("P");
    		
        	if(i==0){
        		System.out.println("컬럼명 : "+precno);
        		System.out.println("컬럼명 : "+judgedate);
        		System.out.println("컬럼명 : "+casename);
        		System.out.println("컬럼명 : "+caseno);
        		System.out.println("컬럼명 : "+courtname);
        		System.out.println("컬럼명 : "+courtclasscode);
        		System.out.println("컬럼명 : "+caseclasscode);
        		System.out.println("컬럼명 : "+caseclassname);
        		System.out.println("컬럼명 : "+judgeclassname);
        		System.out.println("컬럼명 : "+judge);
        		System.out.println("컬럼명 : "+precdetaillink);
        		System.out.println("컬럼명 : "+casetext);
        		System.out.println("컬럼명 : "+judgetext);
        		System.out.println("컬럼명 : "+referlaw);
        		System.out.println("컬럼명 : "+referjudge);
        		System.out.println("컬럼명 : "+maintext);
        		
        		if(!precno.equals("PRECNO")){
        			throw new Exception("판례일련번호 컬럼명이 일치하지 않음(PRECNO)");
        		}
        		if(!judgedate.equals("JUDGEDATE")){
        			throw new Exception("선고일자 컬럼명이 일치하지 않음(JUDGEDATE)");
        		}
        		if(!casename.equals("CASENAME")){
        			throw new Exception("사건명 컬럼명이 일치하지 않음(CASENAME)");
        		}
        		if(!caseno.equals("CASENO")){
        			throw new Exception("사건번호 컬럼명이 일치하지 않음(CASENO)");
        		}
        		if(!courtname.equals("COURTNAME")){
        			throw new Exception("법원명 컬럼명이 일치하지 않음(COURTNAME)");
        		}
        		if(!courtclasscode.equals("COURTCLASSCODE")){
        			throw new Exception("법원종류코드 컬럼명이 일치하지 않음(COURTCLASSCODE)");
        		}
        		if(!caseclasscode.equals("CASECLASSCODE")){
        			throw new Exception("사건종류코드 컬럼명이 일치하지 않음(CASECLASSCODE)");
        		}
        		if(!caseclassname.equals("CASECLASSNAME")){
        			throw new Exception("사건종류명 컬럼명이 일치하지 않음(CASECLASSNAME)");
        		}
        		if(!judgeclassname.equals("JUDGECLASSNAME")){
        			throw new Exception("판결유형 컬럼명이 일치하지 않음(JUDGECLASSNAME)");
        		}
        		if(!judge.equals("JUDGE")){
        			throw new Exception("선고 컬럼명이 일치하지 않음(JUDGE)");
        		}
        		if(!precdetaillink.equals("PRECDETAILLINK")){
        			throw new Exception("상세링크 컬럼명이 일치하지 않음(PRECDETAILLINK)");
        		}
        		if(!casetext.equals("CASETEXT")){
        			throw new Exception("판시사항 컬럼명이 일치하지 않음(CASETEXT)");
        		}
        		if(!judgetext.equals("JUDGETEXT")){
        			throw new Exception("결정요지 컬럼명이 일치하지 않음(JUDGETEXT)");
        		}
        		if(!referlaw.equals("REFERLAW")){
        			throw new Exception("참조조문 컬럼명이 일치하지 않음(REFERLAW)");
        		}
        		if(!referjudge.equals("REFERJUDGE")){
        			throw new Exception("참조판례 컬럼명이 일치하지 않음(REFERJUDGE)");
        		}
        		if(!maintext.equals("MAINTEXT")){
        			throw new Exception("전문 컬럼명이 일치하지 않음(MAINTEXT)");
        		}
        	}else{
        		System.out.println("컬럼명 : "+precno);
        		System.out.println("컬럼명 : "+judgedate);
        		System.out.println("컬럼명 : "+casename);
        		System.out.println("컬럼명 : "+caseno);
        		System.out.println("컬럼명 : "+courtname);
        		System.out.println("컬럼명 : "+courtclasscode);
        		System.out.println("컬럼명 : "+caseclasscode);
        		System.out.println("컬럼명 : "+caseclassname);
        		System.out.println("컬럼명 : "+judgeclassname);
        		System.out.println("컬럼명 : "+judge);
        		System.out.println("컬럼명 : "+precdetaillink);
        		System.out.println("컬럼명 : "+casetext);
        		System.out.println("컬럼명 : "+judgetext);
        		System.out.println("컬럼명 : "+referlaw);
        		System.out.println("컬럼명 : "+referjudge);
        		System.out.println("컬럼명 : "+maintext);
        		
        		int row = resultDs.newRow();
        		System.out.println("데이터셋 행 넘버 : "+row);
        		resultDs.set(row, "chk", 1);
        		resultDs.set(row, "precno",precno);
        		resultDs.set(row, "casename",casename);
        		resultDs.set(row, "caseno",caseno);
        		resultDs.set(row, "judgedate",judgedate);
        		resultDs.set(row, "courtname",courtname);
        		resultDs.set(row, "courtclasscode",courtclasscode);
        		resultDs.set(row, "caseclassname",caseclassname);
        		resultDs.set(row, "caseclasscode",caseclasscode);
        		resultDs.set(row, "judgeclassname",judgeclassname);
        		resultDs.set(row, "judge",judge);
        		resultDs.set(row, "precdetaillink",precdetaillink);
        		resultDs.set(row, "casetext",casetext);
        		resultDs.set(row, "judgetext",judgetext);
        		resultDs.set(row, "referlaw",referlaw);
        		resultDs.set(row, "referjudge",referjudge);
        		resultDs.set(row, "maintext",maintext);
        	}
        }
	}

	@Transactional
	@Override
	public void precedentInsert(List<PrecedentInsertVO> precedentInsertVO)
			throws SQLException {
		for(int i = 0; i < precedentInsertVO.size();i++){
			precedentInsertDAO.precedentInsert(precedentInsertVO.get(i));		
		}
		
	}

	@Override
	public PrecedentInsertVO excelSearch(List<PrecedentInsertVO> precedentInsertVO) {
		PrecedentInsertVO result = null;
		for(int i=0; i<precedentInsertVO.size();i++){
			result=precedentInsertDAO.excelSearch(precedentInsertVO.get(i));
			if(result != null){
				return result;
			}
		}
		return result;
	}
}