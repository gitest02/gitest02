package code.lawmapper.service.mapper;

import java.util.List;

import code.lawmapper.vo.CodeVO;


public interface CodeMapper {

	public void insertCode (CodeVO code);
	
	public void deleteCode (CodeVO code);

	public void updateCode (CodeVO code);
	
	public List<CodeVO> selectCodelist(CodeVO code);
	
	public List<CodeVO> AllCodelist();
	
}
