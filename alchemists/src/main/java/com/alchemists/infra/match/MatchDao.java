package com.alchemists.infra.match;

import java.util.List;

public interface MatchDao {

	// DTO 중 하나를 리턴
	public MatchDto selectOneMatch(MatchDto dto);

	// 등록 버튼
	public int insertMatch(MatchDto dto);

	// 수정 버튼
	public int updateMatch(MatchDto dto);

	// 삭제 버튼
	public int ueleteMatch(MatchDto dto);

	// 삭제 버튼(drop)
	public int deleteMatch(MatchDto dto);

	// 페이징처리없는 코드그룹 리스트 리턴
	public List<MatchDto> selectListMatchWithoutPaging();

	// 페이징 처리 리스트
	public List<MatchDto> selectListMatchWithPaging(MatchVo vo);

	// 개수 리턴
	public Integer selectCountMatch(MatchVo vo);
	
	
	// matchReply
	// DTO 중 하나를 리턴
		public MatchDto selectOneMatchReply(MatchDto dto);

		// 등록 버튼
		public int insertMatchReply(MatchDto dto);

		// 수정 버튼
		public int updateMatchReply(MatchDto dto);

		// 삭제 버튼
		public int ueleteMatchReply(MatchDto dto);

		// 삭제 버튼(drop)
		public int deleteMatchReply(MatchDto dto);

		// 페이징처리없는 코드그룹 리스트 리턴
		public List<MatchDto> selectListMatchReplyWithoutPaging();

		// 페이징 처리 리스트
		public List<MatchDto> selectListMatchReplyWithPaging(MatchVo vo);

		// 개수 리턴
		public Integer selectCountMatchReply(MatchVo vo);
	
	
}
