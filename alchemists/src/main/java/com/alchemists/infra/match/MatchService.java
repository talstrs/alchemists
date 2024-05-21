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
	public MatchDto selectOne(MatchDto dto) {
		return matchDao.selectOne(dto);

	}

	// 등록 버튼
	public int insert(MatchDto dto) {
		matchDao.insert(dto);
		return 1;
	}

	// 수정 버튼
	public int update(MatchDto dto) {
		matchDao.update(dto);
		return 1;
	}

	// 삭제 버튼
	public int uelete(MatchDto dto) {
		matchDao.uelete(dto);
		return 1;
	}

	// 삭제 버튼(drop)
	public int delete(MatchDto dto) {
		matchDao.delete(dto);
		return 1;
	}

	// 페이징처리없는 코드그룹 리스트 리턴
	public List<MatchDto> selectListWithoutPaging() {
		return matchDao.selectListWithoutPaging();
	}

	// 페이징 처리 리스트
	public List<MatchDto> selectListWithPaging(MatchVo vo) {
		return matchDao.selectListWithPaging(vo);
	}

	// 개수 리턴
	public Integer selectCount(MatchVo vo) {
		return matchDao.selectCount(vo);
	}
}
