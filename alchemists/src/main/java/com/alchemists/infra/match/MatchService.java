package com.alchemists.infra.match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * 로직을 처리하는 클래스
 * DAO의 구현체를 호출하는 역할을 한다고 보면됨
 */

@Service
public class MatchService {

	// @autowired : 객체 생성어노테이션
	@Autowired
	MatchDao matchDao;

	// DTO 중 하나를 리턴
	public MatchDto selectOneMatch(MatchDto dto) {
		return matchDao.selectOneMatch(dto);

	}

	// 등록 버튼
	public int insertMatch(MatchDto dto) {
		matchDao.insertMatch(dto);
		return 1;
	}

	// 수정 버튼
	public int updateMatch(MatchDto dto) {
		matchDao.updateMatch(dto);
		return 1;
	}

	// 삭제 버튼
	public int ueleteMatch(MatchDto dto) {
		matchDao.ueleteMatch(dto);
		return 1;
	}

	// 삭제 버튼(drop)
	public int deleteMatch(MatchDto dto) {
		matchDao.deleteMatch(dto);
		return 1;
	}

	// 페이징처리없는 코드그룹 리스트 리턴
	public List<MatchDto> selectListMatchWithoutPaging() {
		return matchDao.selectListMatchWithoutPaging();
	}

	// 페이징 처리 리스트
	public List<MatchDto> selectListMatchWithPaging(MatchVo vo) {
		return matchDao.selectListMatchWithPaging(vo);
	}

	// 개수 리턴
	public Integer selectCountMatch(MatchVo vo) {
		return matchDao.selectCountMatch(vo);
	}

	// matchReply
	// DTO 중 하나를 리턴
	public MatchDto selectOneMatchReply(MatchDto dto) {
		return matchDao.selectOneMatchReply(dto);

	}

	// 등록 버튼
	public int insertMatchReply(MatchDto dto) {
		matchDao.insertMatchReply(dto);
		return 1;
	}

	// 수정 버튼
	public int updateMatchReply(MatchDto dto) {
		matchDao.updateMatchReply(dto);
		return 1;
	}

	// 삭제 버튼
	public int ueleteMatchReply(MatchDto dto) {
		matchDao.ueleteMatchReply(dto);
		return 1;
	}

	// 삭제 버튼(drop)
	public int deleteMatchReply(MatchDto dto) {
		matchDao.deleteMatchReply(dto);
		return 1;
	}

	// 페이징처리없는 코드그룹 리스트 리턴
	public List<MatchDto> selectListMatchReplyWithoutPaging() {
		return matchDao.selectListMatchReplyWithoutPaging();
	}

	// 페이징 처리 리스트
	public List<MatchDto> selectListMatchReplyWithPaging(MatchVo vo) {
		return matchDao.selectListMatchReplyWithPaging(vo);
	}

	// 개수 리턴
	public Integer selectCountMatchReply(MatchVo vo) {
		return matchDao.selectCountMatchReply(vo);
	}

}
