package com.alchemists.infra.stadium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StadiumController {
	
	@Autowired
	StadiumService stadiumService;
	
	//stadium List
	@RequestMapping (value = "/stadiumList")
	public String stadiumList(StadiumDto stadiumDto, Model model) throws Exception {
		
		model.addAttribute("list", stadiumService.stadiumList());
		
		return "usr/stadiumList";
		
	}
	
	//stadium SelectOne
	@RequestMapping (value = "/selectStadium")
	public String selectStadium(StadiumDto stadiumDto, Model model) throws Exception {
		
		model.addAttribute("item", stadiumService.selectStadium(stadiumDto));
		
		return "";
	}
	
	//stadium method 
	@RequestMapping (value = "/insertStadium")
	public String insertStadium (StadiumDto stadiumDto) throws Exception {
		
		stadiumService.insertStadium(stadiumDto);
		
		return "";
		
	}
	
	@RequestMapping (value = "/updateStadium")
	public String updateStadium (StadiumDto stadiumDto) throws Exception {
		
		stadiumService.updateStadium(stadiumDto);
		
		return "";
	}
	
	@RequestMapping (value = "/ultStadium")
	public String ultStadium (StadiumDto stadiumDto) throws Exception {
		
		stadiumService.ultStadium(stadiumDto);
	
		return "";
		
	}
	
	@RequestMapping (value = "/delStadium")
	public String delStadium (StadiumDto stadiumDto) throws Exception {
		
		stadiumService.delStadium(stadiumDto);
		
		return "";
		
	}
}
