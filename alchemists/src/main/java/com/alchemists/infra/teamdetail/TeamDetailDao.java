package com.alchemists.infra.teamdetail;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.alchemists.infra.team.TeamDto;

@Repository
public interface TeamDetailDao {
	
	//teamDetail 관련 내용 
	public List <TeamDetailDto> teamDetailList();
	
	public TeamDto selectTeamDetial (TeamDetailDto teamDetailDto);
	
	public int insertTeamDetail (TeamDetailDto teamDetailDto);
	
	public int updateTeamDetail (TeamDetailDto teamDetailDto);
	
	public int ultTeamDetail (TeamDetailDto teamDetailDto);
	
	public int delTeamDetail (TeamDetailDto teamDetailDto);

}
