package com.adullam.domain;

public class CartVO {
	/*
	 cart_no int not null,
	 mb_id varchar(50) not null,
	 qt_no int not null,(foreign key reference qt_info),
	 cart_stock int not null,
	 */
	private int cart_no;
	private String mb_id;
	private int qt_no;
	private int cart_stock;

	public int getCart_no() {
		return cart_no;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public String getMb_id() {
		return mb_id;
	}

	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}

	public int getQt_no() {
		return qt_no;
	}

	public void setQt_no(int qt_no) {
		this.qt_no = qt_no;
	}

	public int getCart_stock() {
		return cart_stock;
	}

	public void setCart_stock(int cart_stock) {
		this.cart_stock = cart_stock;
	}

}
