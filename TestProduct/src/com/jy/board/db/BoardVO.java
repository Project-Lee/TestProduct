package com.jy.board.db;

public class BoardVO {
	private int i_num;
	private String title;
	private String ctnt;
	private String i_name;
	
	public int getI_num() {
		return i_num;
	}
	public void setI_num(int i_num) {
		this.i_num = i_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s %S",i_num, title, ctnt, i_name);
	}
}
