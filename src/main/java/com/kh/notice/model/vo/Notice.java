package com.kh.notice.model.vo;

import java.sql.*;

public class Notice {
	// 캡슐화의 원칙 적용, 낙타표기법 적용
	private int noticeNo;
	private String noticeSubject;
	private String noticeContent;
	private String noticeWriter;
	private Timestamp noticeDate;
	private Timestamp updateDate;
	private int viewCount;

	public Notice() {

	}

	public Notice(int noticeNo, String noticeSubject, String noticeContent, String noticeWriter, Timestamp noticeDate,
			Timestamp updateDate, int viewCount) {
		super();
		this.noticeNo = noticeNo;
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeWriter = noticeWriter;
		this.noticeDate = noticeDate;
		this.updateDate = updateDate;
		this.viewCount = viewCount;
	}

	public Notice(String noticeSubject, String noticeContent) {
		super();
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
	}
	
	public Notice(int noticeNo, String noticeSubject, String noticeContent) {
		super();
		this.noticeNo = noticeNo;
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeWriter() {
		return noticeWriter;
	}

	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}

	public Timestamp getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Timestamp noticeDate) {
		this.noticeDate = noticeDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	// 디버깅 때 사용되는 것 : 데이터가 들어있는지 안들어있는지 확인하기위해
	@Override
	public String toString() {
		return "Notice [공지번호=" + noticeNo + ", 공지명=" + noticeSubject + ", 공지내용=" + noticeContent + ", 공지작성자="
				+ noticeWriter + ", 공지일자=" + noticeDate + ", 업데이트일자=" + updateDate + ", 조회수=" + viewCount + "]";
	}

}
