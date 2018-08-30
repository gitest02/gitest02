package insertlaw.lawmapper.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.nexacro.xapi.data.DataSet;

import insertlaw.lawmapper.vo.PrecedentInsertVO;

public interface PrecedentInsertService {

	public void excelTodataset(File destFile, DataSet resultDs) throws Exception;

	public void precedentInsert(List<PrecedentInsertVO> precedentInsertVO) throws SQLException;

	public PrecedentInsertVO excelSearch(List<PrecedentInsertVO> precedentInsertVO);
}