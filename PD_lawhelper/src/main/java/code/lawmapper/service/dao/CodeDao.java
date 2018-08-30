package code.lawmapper.service.dao;

import java.util.List;

import code.lawmapper.vo.CodeVO;


public interface CodeDao {

	public abstract void insertCode(CodeVO code);

	public abstract void deleteCode(CodeVO code);

	public abstract void updateCode(CodeVO code);

	public abstract List<CodeVO> selectCodelist(CodeVO code);

	public abstract List<CodeVO> AllCodelist();

}