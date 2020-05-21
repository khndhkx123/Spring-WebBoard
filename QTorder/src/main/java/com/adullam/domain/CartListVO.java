package com.adullam.domain;

//FOR members personal cartList : join of qt_cart + qt_info + adullam_member
public class CartListVO {

	private String mb_name;
	private String qt_name;
	private int cart_stock;
	private int qt_price;

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

	public int getQt_price() {
		return qt_price;
	}

	public void setQt_price(int qt_price) {
		this.qt_price = qt_price;
	}
	
}
