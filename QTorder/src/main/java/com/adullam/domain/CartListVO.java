package com.adullam.domain;

//FOR members personal cartList : join of qt_cart + qt_info + adullam_member
public class CartListVO {

	private String mb_name;
	private String qt_name;
	private int cart_stock;
	private int total_price;

	public String getMb_name() {
		return mb_name;
	}

	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}

	public String getQt_name() {
		return qt_name;
	}

	public void setQt_name(String qt_name) {
		this.qt_name = qt_name;
	}

	public int getCart_stock() {
		return cart_stock;
	}

	public void setCart_stock(int cart_stock) {
		this.cart_stock = cart_stock;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	
}
