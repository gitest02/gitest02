package code.lawmapper.service.service;

import java.util.List;

import code.lawmapper.vo.CodeVO;

public interface CodeService {

//	public abstract boolean insertCode(CodeVO code);

//	public abstract boolean deleteCode(CodeVO code);

	public abstract void updateCode(List<CodeVO> codeList);

	public abstract List<CodeVO> selectCodelist(CodeVO code);

	public abstract List<CodeVO> AllCodelist();

}