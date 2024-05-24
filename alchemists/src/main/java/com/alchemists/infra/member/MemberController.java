package com.alchemists.infra.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	

//	테스트
	@RequestMapping(value = "/accountIndex")
	public String accountIndex() throws Exception{
		
	
	return  "usr/accountIndex";
}
	
	
	
}
