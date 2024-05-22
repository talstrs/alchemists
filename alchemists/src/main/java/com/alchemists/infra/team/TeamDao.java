package com.alchemists.infra.team;

import java.util.List;

import org.springframework.stereotype.Repository; 

@Repository
public interface TeamDao {

	//team 관련 내용 
	public List<TeamDto> teamList();
	
	public TeamDto selectTeam (TeamDto teamDto);
	
	public int insertTeam (TeamDto teamDto);
	
	public int updateTeam (TeamDto teamDto);
	
	public int ultTeam (TeamDto teamDto);
	
	public int delTeam (TeamDto teamDto);

}
