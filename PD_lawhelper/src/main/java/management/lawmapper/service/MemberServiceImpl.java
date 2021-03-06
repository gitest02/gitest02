package management.lawmapper.service;

import java.util.List;

import javax.annotation.Resource;

import management.lawmapper.vo.GradeVo;
import management.lawmapper.vo.MemberSearchVo;
import management.lawmapper.vo.UserSexVO;

import org.springframework.stereotype.Service;

@Service("kkMemberService")
public class MemberServiceImpl implements MemberService{
	
	
	@Resource(name="memberMapper")
	private MemberMapper memberMapper;
	

	@Override
	public MemberSearchVo memberDetail(MemberSearchVo mvs) {
		return memberMapper.memberDetail(mvs);
	}

	@Override
	public int memberCount(MemberSearchVo msv) {
		return memberMapper.memberCount(msv);
	}

	@Override
	public List<MemberSearchVo> memberSelectOne(MemberSearchVo mvs) {
		return memberMapper.memberSelectOne(mvs);
	}

	@Override
	public void memberUpdate(MemberSearchVo msv) {
		memberMapper.memberUpdate(msv);
	}

	@Override
	public void memberDelete(MemberSearchVo msv) {
		memberMapper.memberDelete(msv);
	}

	@Override
	public List<UserSexVO> sexsetting() {
		return memberMapper.sexsetting();
	}

	@Override
	public List<GradeVo> gradesetting() {
		return memberMapper.gradesetting();
	}

}
