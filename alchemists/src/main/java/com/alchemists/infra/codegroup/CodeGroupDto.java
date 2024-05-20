package com.alchemists.infra.codegroup;

import java.util.Date;

public class CodeGroupDto {
	private String codeGroupSeq;
	private String codeGroupName;
	private Date codeGroupRegDate;
	private Date codeGroupmodDate;
	private Integer codeGroupDelNY;

	public String getCodeGroupSeq() {
		return codeGroupSeq;
	}

	public void setCodeGroupSeq(String codeGroupSeq) {
		this.codeGroupSeq = codeGroupSeq;
	}

	public String getCodeGroupName() {
		return codeGroupName;
	}

	public void setCodeGroupName(String codeGroupName) {
		this.codeGroupName = codeGroupName;
	}

	public Date getCodeGroupRegDate() {
		return codeGroupRegDate;
	}

	public void setCodeGroupRegDate(Date codeGroupRegDate) {
		this.codeGroupRegDate = codeGroupRegDate;
	}

	public Date getCodeGroupmodDate() {
		return codeGroupmodDate;
	}

	public void setCodeGroupmodDate(Date codeGroupmodDate) {
		this.codeGroupmodDate = codeGroupmodDate;
	}

	public Integer getCodeGroupDelNY() {
		return codeGroupDelNY;
	}

	public void setCodeGroupDelNY(Integer codeGroupDelNY) {
		this.codeGroupDelNY = codeGroupDelNY;
	}

}
