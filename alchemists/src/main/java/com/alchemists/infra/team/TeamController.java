package com.alchemists.infra.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alchemists.infra.teamdetail.TeamDetailService;

@Controller
public class TeamController {
	
	@Autowired
	TeamService teamService;
	@Autowired
	TeamDetailService teamDetailService;
	
	//team List
	@RequestMapping (value = "/teamList")
	public String teamList (TeamDto teamDto, Model model) throws Exception {
		
		model.addAttribute("team", teamService.teamList());
		
		return "/usr/teamList";
	}
	
	//team selectOne
	@RequestMapping (value = "/teamInfo")
	public String selectTeam (TeamDto teamDto, Model model) throws Exception {
		
		model.addAttribute("item", teamService.selectTeam(teamDto));
		model.addAttribute("teamDetail", teamDetailService.teamDetailList());
		
		return "";
	}
	
	//team method
	@RequestMapping (value = "/insertTeam")
	public String insertTeam (TeamDto teamDto) throws Exception {
		
		teamService.insertTeam(teamDto);
		
		return "";
	}
	
	@RequestMapping (value = "/updateTeam")
	public String updateTeam (TeamDto teamDto) throws Exception {
		
		teamService.updateTeam(teamDto);
		
		return "";
	}
	
	@RequestMapping (value = "/ultTeam")
	public String ultTeam (TeamDto teamDto) throws Exception {
		
		teamService.ultTeam(teamDto);
		
		return "";
	}
	
	@RequestMapping (value = "/delTeam")
	public String delTeam (TeamDto teamDto) throws Exception {
		
		teamService.delTeam(teamDto);
		
		return "";
	}

}
