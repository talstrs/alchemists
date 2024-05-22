package com.alchemists.infra.member;

import java.util.List;

public interface MemberDao {
	
	public List<MemberDto> memberList(MemberVo vo); 
	public MemberDto selectMemberOne(MemberDto dto);
	
	public int memberInst(MemberDto dto);
	
	public int memberUpdt(MemberDto dto);
	
	public int memberUelt(MemberDto dto);
	
	public int memberDelt(MemberDto dto);
	
	public List<MemberDto> selectListWithoutPaging(MemberVo vo); 

}
