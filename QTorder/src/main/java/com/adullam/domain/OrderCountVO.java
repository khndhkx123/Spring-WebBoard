package com.adullam.domain;

public class OrderCountVO {
	private int qt_no;
	private String qt_name;
	private int quantity;
	private int total_price;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

}
