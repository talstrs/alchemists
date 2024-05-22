package com.alchemists.infra.teamdetail;

import java.util.Date;

public class TeamDetailDto {
	
	//teamDetail Column
	private String teamDetailSeq;
	private String teamDetailMemberSeqF;
	private String teamDetailTeamSeqF;
	private Integer teamDetailCaptainNY;
	private String teamDetailMemberBackNum;
	private Integer teamDetailMemberGoalCount;
	private Date teamDetailRegDate;
	private Date teamDetailModDate;
	private Integer teamDetailDelNY;
	
	//getter, setter of teamDetail
	public String getTeamDetailSeq() {
		return teamDetailSeq;
	}
	public void setTeamDetailSeq(String teamDetailSeq) {
		this.teamDetailSeq = teamDetailSeq;
	}
	public String getTeamDetailMemberSeqF() {
		return teamDetailMemberSeqF;
	}
	public void setTeamDetailMemberSeqF(String teamDetailMemberSeqF) {
		this.teamDetailMemberSeqF = teamDetailMemberSeqF;
	}
	public String getTeamDetailTeamSeqF() {
		return teamDetailTeamSeqF;
	}
	public void setTeamDetailTeamSeqF(String teamDetailTeamSeqF) {
		this.teamDetailTeamSeqF = teamDetailTeamSeqF;
	}
	public Integer getTeamDetailCaptainNY() {
		return teamDetailCaptainNY;
	}
	public void setTeamDetailCaptainNY(Integer teamDetailCaptainNY) {
		this.teamDetailCaptainNY = teamDetailCaptainNY;
	}
	public String getTeamDetailMemberBackNum() {
		return teamDetailMemberBackNum;
	}
	public void setTeamDetailMemberBackNum(String teamDetailMemberBackNum) {
		this.teamDetailMemberBackNum = teamDetailMemberBackNum;
	}
	public Integer getTeamDetailMemberGoalCount() {
		return teamDetailMemberGoalCount;
	}
	public void setTeamDetailMemberGoalCount(Integer teamDetailMemberGoalCount) {
		this.teamDetailMemberGoalCount = teamDetailMemberGoalCount;
	}
	public Date getTeamDetailRegDate() {
		return teamDetailRegDate;
	}
	public void setTeamDetailRegDate(Date teamDetailRegDate) {
		this.teamDetailRegDate = teamDetailRegDate;
	}
	public Date getTeamDetailModDate() {
		return teamDetailModDate;
	}
	public void setTeamDetailModDate(Date teamDetailModDate) {
		this.teamDetailModDate = teamDetailModDate;
	}
	public Integer getTeamDetailDelNY() {
		return teamDetailDelNY;
	}
	public void setTeamDetailDelNY(Integer teamDetailDelNY) {
		this.teamDetailDelNY = teamDetailDelNY;
	}
	
	//toString()
	@Override
	public String toString() {
		return "TeamDetailDto [teamDetailSeq=" + teamDetailSeq + ", teamDetailMemberSeqF=" + teamDetailMemberSeqF
				+ ", teamDetailTeamSeqF=" + teamDetailTeamSeqF + ", teamDetailCaptainNY=" + teamDetailCaptainNY
				+ ", teamDetailMemberBackNum=" + teamDetailMemberBackNum + ", teamDetailMemberGoalCount="
				+ teamDetailMemberGoalCount + ", teamDetailRegDate=" + teamDetailRegDate + ", teamDetailModDate="
				+ teamDetailModDate + ", teamDetailDelNY=" + teamDetailDelNY + "]";
	}
	
	

}
