package com.alchemists.infra.stadium;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository 
public interface StadiumDao {
	
	public List<StadiumDto> stadiumList();
	
	public StadiumDto selectStadium(StadiumDto stadiumDto);
	
	public int insertStadium(StadiumDto stadiumDto);
	
	public int updateStadium(StadiumDto stadiumDto);
	
	public int ultStadium(StadiumDto stadiumDto);
	
	public int delStadium(StadiumDto stadiumDto);
	
}
