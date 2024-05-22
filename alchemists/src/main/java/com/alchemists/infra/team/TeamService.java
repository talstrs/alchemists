package com.alchemists.infra.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

	@Autowired
	TeamDao teamDao;
	
	//team List
	public List <TeamDto> teamList() {
		return teamDao.teamList();
	}
	
	//team selectOne
	public TeamDto selectTeam(TeamDto teamDto) {
		return teamDao.selectTeam(teamDto);
	}
	
	//메서드 관련 부분 
	public int insertTeam (TeamDto teamDto) {
		return teamDao.insertTeam(teamDto);
	}
	
	public int updateTeam (TeamDto teamDto) {
		return teamDao.updateTeam(teamDto);
	}
	
	public int ultTeam (TeamDto teamDto) {
		return teamDao.ultTeam(teamDto);
	}
	
	public int delTeam (TeamDto teamDto) {
		return teamDao.delTeam(teamDto);
	}

}
