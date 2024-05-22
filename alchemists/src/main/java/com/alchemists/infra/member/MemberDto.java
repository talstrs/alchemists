package com.alchemists.infra.member;

import java.util.Date;

public class MemberDto {
	private String memberSeq;
	private String memberName;
	private String memberID;
	private String memberPwd;
	private Date memberBirthday;
	private Integer memberGenderCD;
	private Integer memberTypeCD;
	private Integer memberPhoneNum;
	private Integer memberDelNy;
	private Date memberModDate;
	private Date memberRegDate;

	
	public Integer getMemberDelNy() {
		return memberDelNy;
	}

	public void setMemberDelNy(Integer memberDelNy) {
		this.memberDelNy = memberDelNy;
	}

	public String getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(String memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public Date getMemberBirthday() {
		return memberBirthday;
	}

	public void setMemberBirthday(Date memberBirthday) {
		this.memberBirthday = memberBirthday;
	}

	public Integer getMemberGenderCD() {
		return memberGenderCD;
	}

	public void setMemberGenderCD(Integer memberGenderCD) {
		this.memberGenderCD = memberGenderCD;
	}

	public Integer getMemberTypeCD() {
		return memberTypeCD;
	}

	public void setMemberTypeCD(Integer memberTypeCD) {
		this.memberTypeCD = memberTypeCD;
	}

	public Integer getMemberPhoneNum() {
		return memberPhoneNum;
	}

	public void setMemberPhoneNum(Integer memberPhoneNum) {
		this.memberPhoneNum = memberPhoneNum;
	}

	public Date getMemberModDate() {
		return memberModDate;
	}

	public void setMemberModDate(Date memberModDate) {
		this.memberModDate = memberModDate;
	}

	public Date getMemberRegDate() {
		return memberRegDate;
	}

	public void setMemberRegDate(Date memberRegDate) {
		this.memberRegDate = memberRegDate;
	}

}
