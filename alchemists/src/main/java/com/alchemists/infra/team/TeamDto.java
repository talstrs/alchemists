package com.alchemists.infra.team;

import java.util.Date;

public class TeamDto {
	
	//team Column
	private String teamSeq;
	private String teamName;
	private String teamPwd;
	private Integer teamGoalCount;
	private Date teamRegDate;
	private Date teamModDate;
	private Integer teamDelNY;
	
	//getter, setter of team Column
	public String getTeamSeq() {
		return teamSeq;
	}
	public void setTeamSeq(String teamSeq) {
		this.teamSeq = teamSeq;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamPwd() {
		return teamPwd;
	}
	public void setTeamPwd(String teamPwd) {
		this.teamPwd = teamPwd;
	}
	public Integer getTeamGoalCount() {
		return teamGoalCount;
	}
	public void setTeamGoalCount(Integer teamGoalCount) {
		this.teamGoalCount = teamGoalCount;
	}
	public Date getTeamRegDate() {
		return teamRegDate;
	}
	public void setTeamRegDate(Date teamRegDate) {
		this.teamRegDate = teamRegDate;
	}
	public Date getTeamModDate() {
		return teamModDate;
	}
	public void setTeamModDate(Date teamModDate) {
		this.teamModDate = teamModDate;
	}
	public Integer getTeamDelNY() {
		return teamDelNY;
	}
	public void setTeamDelNY(Integer teamDelNY) {
		this.teamDelNY = teamDelNY;
	}
	
	//toString()
	@Override
	public String toString() {
		return "TeamDto [teamSeq=" + teamSeq + ", teamName=" + teamName + ", teamPwd=" + teamPwd + ", teamGoalCount="
				+ teamGoalCount + ", teamRegDate=" + teamRegDate + ", teamModDate=" + teamModDate + ", teamDelNY="
				+ teamDelNY + "]";
	}

}
