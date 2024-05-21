package com.alchemists.infra.match;

import java.util.List;

public interface MatchDao {

	// DTO 중 하나를 리턴
	public MatchDto selectOne(MatchDto dto);

	// 등록 버튼
	public int insert(MatchDto dto);

	// 수정 버튼
	public int update(MatchDto dto);

	// 삭제 버튼
	public int uelete(MatchDto dto);

	// 삭제 버튼(drop)
	public int delete(MatchDto dto);

	// 페이징처리없는 코드그룹 리스트 리턴
	public List<MatchDto> selectListWithoutPaging();

	// 페이징 처리 리스트
	public List<MatchDto> selectListWithPaging(MatchVo vo);

	// 개수 리턴
	public Integer selectCount(MatchVo vo);
}
