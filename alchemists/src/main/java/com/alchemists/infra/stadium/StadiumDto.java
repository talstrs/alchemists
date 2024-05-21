package com.alchemists.infra.stadium;

import java.util.Date;

public class StadiumDto {
	
	private String stadiumSeq;
	private String stadiumName;
	private String stadiumAddr;
	private String stadiumManagerName;
	private Date stadiumRegDate;
	private Date stadiumModDate;
	private Integer stadiumDelNY;
	
	//getter, setter
	public String getStadiumSeq() {
		return stadiumSeq;
	}
	public void setStadiumSeq(String stadiumSeq) {
		this.stadiumSeq = stadiumSeq;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public String getStadiumAddr() {
		return stadiumAddr;
	}
	public void setStadiumAddr(String stadiumAddr) {
		this.stadiumAddr = stadiumAddr;
	}
	public String getStadiumManagerName() {
		return stadiumManagerName;
	}
	public void setStadiumManagerName(String stadiumManagerName) {
		this.stadiumManagerName = stadiumManagerName;
	}
	public Date getStadiumRegDate() {
		return stadiumRegDate;
	}
	public void setStadiumRegDate(Date stadiumRegDate) {
		this.stadiumRegDate = stadiumRegDate;
	}
	public Date getStadiumModDate() {
		return stadiumModDate;
	}
	public void setStadiumModDate(Date stadiumModDate) {
		this.stadiumModDate = stadiumModDate;
	}
	public Integer getStadiumDelNY() {
		return stadiumDelNY;
	}
	public void setStadiumDelNY(Integer stadiumDelNY) {
		this.stadiumDelNY = stadiumDelNY;
	}
	
	//toString()
	@Override
	public String toString() {
		return "StadiumDto [stadiumSeq=" + stadiumSeq + ", stadiumName=" + stadiumName + ", stadiumAddr=" + stadiumAddr
				+ ", stadiumManagerName=" + stadiumManagerName + ", stadiumRegDate=" + stadiumRegDate
				+ ", stadiumModDate=" + stadiumModDate + ", stadiumDelNY=" + stadiumDelNY + "]";
	}

}
