package insertlaw.lawmapper.service.impl;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import insertlaw.lawmapper.service.DetcInsertService;
import insertlaw.lawmapper.service.dao.DetcInsertDAO;
import insertlaw.lawmapper.util.ExcelRead;
import insertlaw.lawmapper.util.ExcelReadOption;
import insertlaw.lawmapper.vo.DetcListVO;
import insertlaw.lawmapper.vo.PrecedentInsertVO;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexacro.xapi.data.DataSet;

@Service("detcInsertService")
public class DetcInsertServiceImpl implements DetcInsertService {

	@Resource(name = "detcInsertDAO")
	private DetcInsertDAO detcInsertDAO;

	@Override
	public void excelTodataset(File destFile, DataSet resultDs)
			throws Exception {
		ExcelReadOption excelReadOption = new ExcelReadOption();
		excelReadOption.setFilePath(destFile.getAbsolutePath());
		excelReadOption.setOutputColumns("A", "B", "C", "D", "E", "F", "G",
				"H", "I", "J", "K", "L", "M", "N");
		excelReadOption.setStartRow(1);

		List<Map<String, String>> excelContent = ExcelRead
				.read(excelReadOption);

		for (int i = 0; i < excelContent.size(); i++) {
			Map<String, String> article = excelContent.get(i);
			System.out.println("행 수 : " + excelContent.size());
			System.out.println("행 번호 : " + i);
			String detcno = article.get("A");
			String detcdate = article.get("B");
			String caseno = article.get("C");
			String casename = article.get("D");
			String detaillink = article.get("E");
			String caseclasscode = article.get("F");
			String caseclassname = article.get("G");
			String judgeclasscode = article.get("H");
			String casetext = article.get("I");
			String judgetext = article.get("J");
			String maintext = article.get("K");
			String referlaw = article.get("L");
			String referjudge = article.get("M");
			String targetlaw = article.get("N");

			if (i == 0) {
				System.out.println("컬럼명 : " + detcno);
				System.out.println("컬럼명 : " + detcdate);
				System.out.println("컬럼명 : " + caseno);
				System.out.println("컬럼명 : " + casename);
				System.out.println("컬럼명 : " + detaillink);
				System.out.println("컬럼명 : " + caseclasscode);
				System.out.println("컬럼명 : " + caseclassname);
				System.out.println("컬럼명 : " + judgeclasscode);
				System.out.println("컬럼명 : " + casetext);
				System.out.println("컬럼명 : " + judgetext);
				System.out.println("컬럼명 : " + maintext);
				System.out.println("컬럼명 : " + referlaw);
				System.out.println("컬럼명 : " + referjudge);
				System.out.println("컬럼명 : " + targetlaw);

				if (!detcno.equals("DETCNO")) {
					throw new Exception("일련번호 컬럼명이 일치하지 않음(DETCNO)");
				}
				if (!detcdate.equals("DETCDATE")) {
					throw new Exception("종국일자 컬럼명이 일치하지 않음(DETCDATE)");
				}
				if (!caseno.equals("CASENO")) {
					throw new Exception("사건번호 컬럼명이 일치하지 않음(CASENO)");
				}
				if (!casename.equals("CASENAME")) {
					throw new Exception("사건명 컬럼명이 일치하지 않음(CASENAME)");
				}
				if (!detaillink.equals("DETAILLINK")) {
					throw new Exception("상세링크 컬럼명이 일치하지 않음(DETAILLINK)");
				}
				if (!caseclasscode.equals("CASECLASSCODE")) {
					throw new Exception("사건종류코드 컬럼명이 일치하지 않음(CASECLASSCODE)");
				}
				if (!caseclassname.equals("CASECLASSNAME")) {
					throw new Exception("사건종류명 컬럼명이 일치하지 않음(CASECLASSNAME)");
				}
				if (!judgeclasscode.equals("JUDGECLASSCODE")) {
					throw new Exception("재판구분코드 컬럼명이 일치하지 않음(JUDGECLASSCODE)");
				}
				if (!casetext.equals("CASETEXT")) {
					throw new Exception("판시사항 컬럼명이 일치하지 않음(CASETEXT)");
				}
				if (!judgetext.equals("JUDGETEXT")) {
					throw new Exception("결정요지 컬럼명이 일치하지 않음(JUDGETEXT)");
				}
				if (!maintext.equals("MAINTEXT")) {
					throw new Exception("전문 컬럼명이 일치하지 않음(MAINTEXT)");
				}
				if (!referlaw.equals("REFERLAW")) {
					throw new Exception("참조조문 컬럼명이 일치하지 않음(REFERLAW)");
				}
				if (!referjudge.equals("REFERJUDGE")) {
					throw new Exception("참조판례 컬럼명이 일치하지 않음(REFERJUDGE)");
				}
				if (!targetlaw.equals("TARGETLAW")) {
					throw new Exception("심판대상조문 컬럼명이 일치하지 않음(TARGETLAW)");
				}
			} else {
				System.out.println("컬럼명 : " + detcno);
				System.out.println("컬럼명 : " + detcdate);
				System.out.println("컬럼명 : " + caseno);
				System.out.println("컬럼명 : " + casename);
				System.out.println("컬럼명 : " + detaillink);
				System.out.println("컬럼명 : " + caseclasscode);
				System.out.println("컬럼명 : " + caseclassname);
				System.out.println("컬럼명 : " + judgeclasscode);
				System.out.println("컬럼명 : " + casetext);
				System.out.println("컬럼명 : " + judgetext);
				System.out.println("컬럼명 : " + maintext);
				System.out.println("컬럼명 : " + referlaw);
				System.out.println("컬럼명 : " + referjudge);
				System.out.println("컬럼명 : " + targetlaw);

				int row = resultDs.newRow();
				System.out.println("데이터셋 행 넘버 : " + row);
				resultDs.set(row, "chk", 1);
				resultDs.set(row, "detcno", detcno);
				resultDs.set(row, "detcdate", detcdate);
				resultDs.set(row, "caseno", caseno);
				resultDs.set(row, "casename", casename);
				resultDs.set(row, "detaillink", detaillink);
				resultDs.set(row, "caseclasscode", caseclasscode);
				resultDs.set(row, "caseclassname", caseclassname);
				resultDs.set(row, "judgeclasscode", judgeclasscode);
				resultDs.set(row, "casetext", casetext);
				resultDs.set(row, "judgetext", judgetext);
				resultDs.set(row, "maintext", maintext);
				resultDs.set(row, "referlaw", referlaw);
				resultDs.set(row, "referjudge", referjudge);
				resultDs.set(row, "targetlaw", targetlaw);
			}
		}

	}

	@Transactional
	@Override
	public void detcInsert(List<DetcListVO> detcListVO) throws SQLException {
		for (int i = 0; i < detcListVO.size(); i++) {
			detcInsertDAO.detcInsert(detcListVO.get(i));
		}
	}

	@Override
	public DetcListVO excelSearch(List<DetcListVO> detcListVO) {
		DetcListVO result = null;
		for (int i = 0; i < detcListVO.size(); i++) {
			result = detcInsertDAO.excelSearch(detcListVO.get(i));
			if (result != null) {
				return result;
			}
		}
		return result;
	}
}