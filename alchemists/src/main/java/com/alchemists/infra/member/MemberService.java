package com.alchemists.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public List<MemberDto> memberList(MemberVo vo) {
		return memberDao.memberList(vo);
	}
	
	public MemberDto selectMemberOne(MemberDto dto) {
		return memberDao.selectMemberOne(dto);
	}

	public int memberInst(MemberDto dto) {
		return memberDao.memberInst(dto);
	}
	
	public int memberUpdt(MemberDto dto) {
		return memberDao.memberUpdt(dto);
	}
	
	public int memberUelt(MemberDto dto) {
		return memberDao.memberUelt(dto);
	}
	
	public int memberDelt(MemberDto dto) {
		return memberDao.memberDelt(dto);
	}
	
	public List<MemberDto> selectListWithoutPaging(MemberVo vo) {
		return memberDao.selectListWithoutPaging(vo);
	}

}
