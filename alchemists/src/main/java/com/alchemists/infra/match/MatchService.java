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

}
