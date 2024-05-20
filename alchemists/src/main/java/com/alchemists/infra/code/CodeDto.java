package com.alchemists.infra.code;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeDto {
	private String codeSeq;
	private String codeName;
	private Integer codeDelNY;
	private Date codeRegDate;
	private Date codeModDate;

	private String codeGroupSeqF;
	
	public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();

	public String getCodeSeq() {
		return codeSeq;
	}

	public void setCodeSeq(String codeSeq) {
		this.codeSeq = codeSeq;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Integer getCodeDelNY() {
		return codeDelNY;
	}

	public void setCodeDelNY(Integer codeDelNY) {
		this.codeDelNY = codeDelNY;
	}

	public Date getCodeRegDate() {
		return codeRegDate;
	}

	public void setCodeRegDate(Date codeRegDate) {
		this.codeRegDate = codeRegDate;
	}

	public Date getCodeModDate() {
		return codeModDate;
	}

	public void setCodeModDate(Date codeModDate) {
		this.codeModDate = codeModDate;
	}

	public String getCodeGroupSeqF() {
		return codeGroupSeqF;
	}

	public void setCodeGroupSeqF(String codeGroupSeqF) {
		this.codeGroupSeqF = codeGroupSeqF;
	}

}
