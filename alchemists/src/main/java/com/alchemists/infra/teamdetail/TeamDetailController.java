package com.alchemists.infra.teamdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamDetailController {

	@Autowired
	TeamDetailService teamDetailService;
	
	//teamDetail list
	@RequestMapping(value = "/teamDetailList")
	public String teamDetailList (TeamDetailDto teamDetailDto, Model model) throws Exception {
		
		model.addAttribute("teamDetail", teamDetailService.selectTeamDetail(teamDetailDto));
		
		return "";
	}
	//teamDetail selectOne
	@RequestMapping(value = "/selectteamDetail")
	public String selectTeamDetail (TeamDetailDto teamDetailDto, Model model)throws Exception {
		
		model.addAttribute("item", teamDetailService.selectTeamDetail(teamDetailDto));
		
		return "";
		
	}
	
	//teamDetail Method
	@RequestMapping (value = "/insertTeamDetail")
	public String insertTeamDetail (TeamDetailDto teamDetailDto) throws Exception {
		
		teamDetailService.insertTeamDetail(teamDetailDto);
		
		return "";
		
	}
	
	@RequestMapping (value = "/updateTeamDetail")
	public String updateTeamDetail (TeamDetailDto teamDetailDto) throws Exception  {
		
		teamDetailService.updateTeamDetail(teamDetailDto);
		
		return "";
	}
	
	@RequestMapping (value = "/ultTeamDetail")
	public String ultTeamDetail (TeamDetailDto teamDetailDto) throws Exception {
		
		teamDetailService.ultTeamDetail(teamDetailDto);
		
		return "";
	}
	
	@RequestMapping (value = "/delTeamDetail")
	public String delTeamDDetail (TeamDetailDto teamDetailDto) throws Exception {
		
		teamDetailService.delTeamDetail(teamDetailDto);
		
		return "";
		
	}
}
