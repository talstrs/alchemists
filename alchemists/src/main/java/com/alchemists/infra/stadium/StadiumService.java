package com.alchemists.infra.stadium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StadiumService {
	
	@Autowired
	StadiumDao stadiumDao;
	
	//selectList
	public List<StadiumDto> stadiumList() {
		return stadiumDao.stadiumList();
	}

	//selectOne
	public StadiumDto selectStadium(StadiumDto stadiumDto) {
		return stadiumDao.selectStadium(stadiumDto);
	}
	
	//메서드 관련 부분 
	public int insertStadium(StadiumDto stadiumDto) {
		return stadiumDao.insertStadium(stadiumDto);
	}
	
	public int updateStadium(StadiumDto stadiumDto) {
		return stadiumDao.updateStadium(stadiumDto);
	}
	
	public int ultStadium(StadiumDto stadiumDto) {
		return stadiumDao.ultStadium(stadiumDto);
	}
	
	public int delStadium(StadiumDto stadiumDto) {
		return stadiumDao.delStadium(stadiumDto);
	}

}
