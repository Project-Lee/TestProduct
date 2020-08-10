package com.jy.login.db;

public class LoginVO {
	private int i_numId;
	private String i_id;
	private String i_ps;
	private String i_name;
	private String i_email;
	private String i_gender;
	
	/*
	private String i_info;   // 상세정보 기능 만들때 추가하기
	private String i_picture;  // 사진기능 넣을때 추가하기
	 */
	
	public void setI_numId(int i_numID) {
		this.i_numId = i_numID;
	}
	
	public int getI_numId() {
		return i_numId;
	}		
	
	public String getI_id() {
		return i_id;
	}
	public void setI_id(String i_id) {
		this.i_id = i_id;
	}
	public String getI_ps() {
		return i_ps;
	}
	public void setI_ps(String i_ps) {
		this.i_ps = i_ps;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public String getI_email() {
		return i_email;
	}
	public void setI_email(String i_email) {
		this.i_email = i_email;
	}
	public String getI_gender() {
		return i_gender;
	}
	public void setI_gender(String i_gender) {
		this.i_gender = i_gender;
	}
	
	
	// 혹시나 객체넘어갈때 주소값 찍힐 경우, 값이 잘넘어왔는지 '확인용'으로 만든 toString() 메소드
	@Override
	public String toString() {
		return String.format("%d %s %s %s %s %s",i_numId, i_id, i_ps, i_name, i_email, i_gender);
	}
}
