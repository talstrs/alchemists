package com.alchemists.infra.matchreply;

import java.util.Date;

public class MatchReplyMatchDto {
	private String matchReplySeq;
	private String matchReplyTeamSeqF;
	private Integer matchReplyJoinNY;
	private Date matchReplyRegDate;
	private Date matchReplyModDate;

	public String getMatchReplySeq() {
		return matchReplySeq;
	}

	public void setMatchReplySeq(String matchReplySeq) {
		this.matchReplySeq = matchReplySeq;
	}

	public String getMatchReplyTeamSeqF() {
		return matchReplyTeamSeqF;
	}

	public void setMatchReplyTeamSeqF(String matchReplyTeamSeqF) {
		this.matchReplyTeamSeqF = matchReplyTeamSeqF;
	}

	public Integer getMatchReplyJoinNY() {
		return matchReplyJoinNY;
	}

	public void setMatchReplyJoinNY(Integer matchReplyJoinNY) {
		this.matchReplyJoinNY = matchReplyJoinNY;
	}

	public Date getMatchReplyRegDate() {
		return matchReplyRegDate;
	}

	public void setMatchReplyRegDate(Date matchReplyRegDate) {
		this.matchReplyRegDate = matchReplyRegDate;
	}

	public Date getMatchReplyModDate() {
		return matchReplyModDate;
	}

	public void setMatchReplyModDate(Date matchReplyModDate) {
		this.matchReplyModDate = matchReplyModDate;
	}

}
