package com.adullam.domain;

public class MemberVO {
	/*
	create table adullam_member (
	mb_id varchar(50) not null,
	mb_pw varchar(100) not null,
	mb_name varchar(30) not null,
	primary key(mb_id)
	);
	*/

	private String mb_id;
	private String mb_pw;
	private String mb_name;

	public String getMb_id() {
		return mb_id;
	}

	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}

	public String getMb_pw() {
		return mb_pw;
	}

	public void setMb_pw(String mb_pw) {
		this.mb_pw = mb_pw;
	}

	public String getMb_name() {
		return mb_name;
	}

	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}

}
