package com.alchemists.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alchemists.common.constants.Constants;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
// 로그인
	@RequestMapping(value = "/usrLogin")
	public String usrLogin() throws Exception{
		
	
	return  "usr/usrLogin";
}
	
	// 로그인 체크
		@ResponseBody
		@RequestMapping(value = "loginCheck")
		public Map<String, Object> loginCheck(MemberDto dto, HttpSession httpSession) throws Exception {
			
			Map<String, Object> returnMap = new HashMap<String, Object>();

			// DB에서 데이터 가져오기
			MemberDto dtoCheck = memberService.selectOneLoginCheck(dto);
			
			
			if(dtoCheck.getMemberPwd() != null) {
				
				String checkPw = dtoCheck.getMemberPwd();
				String loginId = dto.getMemberID();
				String loginPw = dto.getMemberPwd();
				
				
					
				httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_XDM); // 60second * 30 = 30minute
				httpSession.setAttribute("sessSeqXdm", dtoCheck.getMemberSeq());
				httpSession.setAttribute("sessIdXdm", dtoCheck.getMemberID());
				httpSession.setAttribute("sessNameXdm", dtoCheck.getMemberName());
				
				if(loginId.equals(dtoCheck.getMemberID())) {
					if(loginPw.equals(checkPw)) {
						returnMap.put("rt", "success");
					} else {
						returnMap.put("rt", "failPw");
					}
				} else {
					returnMap.put("rt", "failId");
				}
			} else {
				returnMap.put("rt", "failId");
			}
			return returnMap;
		}
		
		// 관리자 세션 로그아웃
		@ResponseBody
		@RequestMapping(value = "logOutCheck")
		public Map<String, Object> signOutXdmCheck(MemberDto dto, HttpSession httpSession) throws Exception {
			Map<String, Object> returnMap = new HashMap<String, Object>();
			
			httpSession.invalidate(); // 세션 무효화
			
			returnMap.put("rt", "success");
			
	        return returnMap; // 로그아웃 후 관리자 로그인 페이지로 리다이렉트
	    }
	
	
//	어카운트 인덱스
	@RequestMapping(value = "/accountIndex")
	public String accountIndex() throws Exception{
		
	
	return  "usr/accountIndex";
}
	
	
	
}
