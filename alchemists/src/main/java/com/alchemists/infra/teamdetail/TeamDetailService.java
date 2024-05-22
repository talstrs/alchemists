package com.alchemists.infra.teamdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alchemists.infra.team.TeamDto;

@Service
public class TeamDetailService {
	
	@Autowired
	TeamDetailDao teamDetailDao;
	
	//teamDetail List
	public List <TeamDetailDto> teamDetailList () {
		return teamDetailDao.teamDetailList();
	}
	
	//teamDetail selectOne
	public TeamDto selectTeamDetail (TeamDetailDto teamDetailDto) {
		return teamDetailDao.selectTeamDetial(teamDetailDto);
	}
	
	//메서드 관련 부분 
	public int insertTeamDetail (TeamDetailDto teamDetailDto) {
		return teamDetailDao.insertTeamDetail(teamDetailDto);
	}
	
	public int updateTeamDetail (TeamDetailDto teamDetailDto) {
		return teamDetailDao.updateTeamDetail(teamDetailDto);
	}
	
	public int ultTeamDetail (TeamDetailDto teamDetailDto) {
		return teamDetailDao.ultTeamDetail(teamDetailDto);
	}
	
	public int delTeamDetail (TeamDetailDto teamDetailDto) {
		return teamDetailDao.delTeamDetail(teamDetailDto);
	}

}
