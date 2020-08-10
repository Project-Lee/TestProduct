package com.jy.product.db;

public class ProductVO {
	private int i_num;
	private String i_name;
	private int i_price;
	
	public int getI_num() {
		return i_num;
	}
	public void setI_num(int i_num) {
		this.i_num = i_num;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public int getI_price() {
		return i_price;
	}
	public void setI_price(int i_price) {
		this.i_price = i_price;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %d",i_num, i_name, i_price);
	}
}
