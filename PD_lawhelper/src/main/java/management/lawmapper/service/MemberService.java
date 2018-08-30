package management.lawmapper.service;

import java.util.List;

import management.lawmapper.vo.GradeVo;
import management.lawmapper.vo.MemberSearchVo;
import management.lawmapper.vo.UserSexVO;

public interface MemberService {
	public List<MemberSearchVo> memberSelectOne(MemberSearchVo mvs);
	public MemberSearchVo memberDetail(MemberSearchVo mvs);
	public int memberCount(MemberSearchVo msv);
	public void memberUpdate(MemberSearchVo msv);
	public void memberDelete(MemberSearchVo msv);
	public List<UserSexVO> sexsetting();
	public List<GradeVo> gradesetting();
}
