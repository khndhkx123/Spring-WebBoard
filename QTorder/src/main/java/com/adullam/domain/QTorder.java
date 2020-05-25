package com.adullam.domain;

public class QTorder {

	private int order_no;
	private String mb_name;
	private int total_price;
	private String o_date;

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public String getMb_name() {
		return mb_name;
	}

	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public String getOdate() {
		return o_date;
	}

	public void setOdate(String o_date) {
		this.o_date = o_date;
	}

}
