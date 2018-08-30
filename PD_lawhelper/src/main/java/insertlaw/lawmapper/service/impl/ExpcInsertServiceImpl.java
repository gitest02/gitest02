package insertlaw.lawmapper.service.impl;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import insertlaw.lawmapper.service.ExpcInsertService;
import insertlaw.lawmapper.service.dao.ExpcInsertDAO;
import insertlaw.lawmapper.util.ExcelRead;
import insertlaw.lawmapper.util.ExcelReadOption;
import insertlaw.lawmapper.vo.ExpcListVO;
import insertlaw.lawmapper.vo.PrecedentInsertVO;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexacro.xapi.data.DataSet;

@Service("expcInsertService")
public class ExpcInsertServiceImpl implements ExpcInsertService {

	@Resource(name = "expcInsertDAO")
	private ExpcInsertDAO expcInsertDAO;

	@Override
	public void excelTodataset(File destFile, DataSet resultDs)
			throws Exception {
		ExcelReadOption excelReadOption = new ExcelReadOption();
		excelReadOption.setFilePath(destFile.getAbsolutePath());
		excelReadOption.setOutputColumns("A", "B", "C", "D", "E", "F", "G",
				"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R");
		excelReadOption.setStartRow(1);

		List<Map<String, String>> excelContent = ExcelRead
				.read(excelReadOption);

		for (int i = 0; i < excelContent.size(); i++) {
			Map<String, String> article = excelContent.get(i);
			System.out.println("행 수 : " + excelContent.size());
			System.out.println("행 번호 : " + i);
			String expcno = article.get("A");
			String itemname = article.get("B");
			String itemno = article.get("C");
			String quesorgcode = article.get("D");
			String quesorgname = article.get("E");
			String replorgcode = article.get("F");
			String replorgname = article.get("G");
			String replydate = article.get("H");
			String classname = article.get("I");
			String detaillink = article.get("J");
			String analyzedate = article.get("K");
			String analyzeorgcode = article.get("L");
			String analyzeorgname = article.get("M");
			String careorgcode = article.get("N");
			String regdate = article.get("O");
			String questext = article.get("P");
			String repltext = article.get("Q");
			String reasontext = article.get("R");

			if (i == 0) {
				System.out.println("컬럼명 : " + expcno);
				System.out.println("컬럼명 : " + itemname);
				System.out.println("컬럼명 : " + itemno);
				System.out.println("컬럼명 : " + quesorgcode);
				System.out.println("컬럼명 : " + quesorgname);
				System.out.println("컬럼명 : " + replorgcode);
				System.out.println("컬럼명 : " + replorgname);
				System.out.println("컬럼명 : " + replydate);
				System.out.println("컬럼명 : " + classname);
				System.out.println("컬럼명 : " + detaillink);
				System.out.println("컬럼명 : " + analyzedate);
				System.out.println("컬럼명 : " + analyzeorgcode);
				System.out.println("컬럼명 : " + analyzeorgname);
				System.out.println("컬럼명 : " + careorgcode);
				System.out.println("컬럼명 : " + regdate);
				System.out.println("컬럼명 : " + questext);
				System.out.println("컬럼명 : " + repltext);
				System.out.println("컬럼명 : " + reasontext);

				if (!expcno.equals("EXPCNO")) {
					throw new Exception("일련번호 컬럼명이 일치하지 않음(EXPCNO)");
				}
				if (!itemname.equals("ITEMNAME")) {
					throw new Exception("안건명 컬럼명이 일치하지 않음(ITEMNAME)");
				}
				if (!itemno.equals("ITEMNO")) {
					throw new Exception("안건번호 컬럼명이 일치하지 않음(ITEMNO)");
				}
				if (!quesorgcode.equals("QUESORGCODE")) {
					throw new Exception("질의기관코드 컬럼명이 일치하지 않음(QUESORGCODE)");
				}
				if (!quesorgname.equals("QUESORGNAME")) {
					throw new Exception("질의기관명 컬럼명이 일치하지 않음(QUESORGNAME)");
				}
				if (!replorgcode.equals("REPLORGCODE")) {
					throw new Exception("회신기간코드 컬럼명이 일치하지 않음(REPLORGCODE)");
				}
				if (!replorgname.equals("REPLORGNAME")) {
					throw new Exception("회신기관명 컬럼명이 일치하지 않음(REPLORGNAME)");
				}
				if (!replydate.equals("REPLYDATE")) {
					throw new Exception("회신일 컬럼명이 일치하지 않음(REPLYDATE)");
				}
				if (!classname.equals("CLASSNAME")) {
					throw new Exception("해석례분야명 컬럼명이 일치하지 않음(CLASSNAME)");
				}
				if (!detaillink.equals("DETAILLINK")) {
					throw new Exception("상세링크 컬럼명이 일치하지 않음(DETAILLINK)");
				}
				if (!analyzedate.equals("ANALYZEDATE")) {
					throw new Exception("해석일자 컬럼명이 일치하지 않음(ANALYZEDATE)");
				}
				if (!analyzeorgcode.equals("ANALYZEORGCODE")) {
					throw new Exception("해석기관코드 컬럼명이 일치하지 않음(ANALYZEORGCODE)");
				}
				if (!analyzeorgname.equals("ANALYZEORGNAME")) {
					throw new Exception("해석기관명 컬럼명이 일치하지 않음(ANALYZEORGNAME)");
				}
				if (!careorgcode.equals("CAREORGCODE")) {
					throw new Exception("관리기관코드 컬럼명이 일치하지 않음(CAREORGCODE)");
				}
				if (!regdate.equals("REGDATE")) {
					throw new Exception("등록일시 컬럼명이 일치하지 않음(REGDATE)");
				}
				if (!questext.equals("QUESTEXT")) {
					throw new Exception("질의요지 컬럼명이 일치하지 않음(QUESTEXT)");
				}
				if (!repltext.equals("REPLTEXT")) {
					throw new Exception("회답 컬럼명이 일치하지 않음(REPLTEXT)");
				}
				if (!reasontext.equals("REASONTEXT")) {
					throw new Exception("이유 컬럼명이 일치하지 않음(REASONTEXT)");
				}
			} else {
				System.out.println("컬럼명 : " + expcno);
				System.out.println("컬럼명 : " + itemname);
				System.out.println("컬럼명 : " + itemno);
				System.out.println("컬럼명 : " + quesorgcode);
				System.out.println("컬럼명 : " + quesorgname);
				System.out.println("컬럼명 : " + replorgcode);
				System.out.println("컬럼명 : " + replorgname);
				System.out.println("컬럼명 : " + replydate);
				System.out.println("컬럼명 : " + classname);
				System.out.println("컬럼명 : " + detaillink);
				System.out.println("컬럼명 : " + analyzedate);
				System.out.println("컬럼명 : " + analyzeorgcode);
				System.out.println("컬럼명 : " + analyzeorgname);
				System.out.println("컬럼명 : " + careorgcode);
				System.out.println("컬럼명 : " + regdate);
				System.out.println("컬럼명 : " + questext);
				System.out.println("컬럼명 : " + repltext);
				System.out.println("컬럼명 : " + reasontext);

				int row = resultDs.newRow();
				System.out.println("데이터셋 행 넘버 : " + row);
				resultDs.set(row, "chk", 1);
				resultDs.set(row, "expcno", expcno);
				resultDs.set(row, "itemname", itemname);
				resultDs.set(row, "itemno", itemno);
				resultDs.set(row, "quesorgcode", quesorgcode);
				resultDs.set(row, "quesorgname", quesorgname);
				resultDs.set(row, "replorgcode", replorgcode);
				resultDs.set(row, "replorgname", replorgname);
				resultDs.set(row, "replydate", replydate);
				resultDs.set(row, "classname", classname);
				resultDs.set(row, "detaillink", detaillink);
				resultDs.set(row, "analyzedate", analyzedate);
				resultDs.set(row, "analyzeorgcode", analyzeorgcode);
				resultDs.set(row, "analyzeorgname", analyzeorgname);
				resultDs.set(row, "careorgcode", careorgcode);
				resultDs.set(row, "regdate", regdate);
				resultDs.set(row, "questext", questext);
				resultDs.set(row, "repltext", repltext);
				resultDs.set(row, "reasontext", reasontext);
			}
		}
	}

	@Transactional
	@Override
	public void expcInsert(List<ExpcListVO> expcListVO) throws SQLException {
		for (int i = 0; i < expcListVO.size(); i++) {
			expcInsertDAO.expcInsert(expcListVO.get(i));
		}
	}

	@Override
	public ExpcListVO excelSearch(List<ExpcListVO> expcListVO) {
		ExpcListVO result = null;
		for (int i = 0; i < expcListVO.size(); i++) {
			result = expcInsertDAO.excelSearch(expcListVO.get(i));
			if (result != null) {
				return result;
			}
		}
		return result;
	}
}