package com.adullam.domain;

public class QTinfoVO {
	/*
	create table qt_info (
	qt_no int not null,
	qt_name varchar(50) not null,
	qt_price int not null,
	primary key(qt_no)
	);
	*/

	private int qt_no;
	private String qt_name;
	private int qt_price;

	public int getQt_no() {
		return qt_no;
	}

	public void setQt_no(int qt_no) {
		this.qt_no = qt_no;
	}

	public String getQt_name() {
		return qt_name;
	}

	public void setQt_name(String qt_name) {
		this.qt_name = qt_name;
	}

	public int getQt_price() {
		return qt_price;
	}

	public void setQt_price(int qt_price) {
		this.qt_price = qt_price;
	}

}
