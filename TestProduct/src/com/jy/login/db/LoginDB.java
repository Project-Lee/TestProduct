package com.jy.login.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.product.db.DAO;

public class LoginDB {
	
	// 회원가입시 값 입력받는 메소드 (LoginSignInsert 서블릿)
	public static void insertLogin(String i_id, String i_ps,
			String i_name, String i_email, String i_gender) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO login(i_numID, i_id, i_ps, i_name, i_email, i_gender) "
				+ " SELECT nvl(max(i_numID),0) + 1,?,?,?,?,? " 
				+ " FROM login ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			ps.setNString(1, i_id);
			ps.setNString(2, i_ps);
			ps.setNString(3, i_name);
			ps.setNString(4, i_email);
			ps.setNString(5, i_gender);
			
//			if(i_id == "" || i_ps == "" || i_name == "" || 	i_email == "") {
//				System.out.println("Error - 입력하지 않은 값이 있습니다");								
//				return;
//			}
			
			ps.executeUpdate();					
					
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			DAO.close(ps, con);
		}
	}
	
	// 회원리스트 보여주는 메소드 (LoginMember서블릿) 
	public static List<LoginVO> selectMember() {
		List<LoginVO> loginVO = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT i_numID, i_id, i_ps, i_name, i_email, "
				+ " i_gender FROM login ORDER BY i_numID DESC";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				LoginVO vo = new LoginVO();
				vo.setI_numId(rs.getInt("i_numID"));
				vo.setI_id(rs.getNString("i_id"));
				vo.setI_ps(rs.getNString("i_ps"));
				vo.setI_name(rs.getNString("i_name"));
				vo.setI_email(rs.getNString("i_email"));
				vo.setI_gender(rs.getNString("i_gender"));
				
				loginVO.add(vo);	
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(ps, con);
		}
		
		return loginVO;
	}
	
	// i_numID 값을 매개변수로 받아 그 레코드를 삭제하는 메소드
	public static void deleteMember(LoginVO vo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " DELETE login WHERE i_numID = ? ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getI_numId());
			ps.executeUpdate();
				
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(ps, con);
		}
		
		
	}
	
	// i_numID 값을 받아 디테일화면에 뿌려주는 메소드 (추후 업데이트예정 : 사진넣기기능,주소,자기소개 추가하기)
	// 뭔가 selectMember() 메소드랑 중복되는 값이 보임 추후 내가 실력되거나 그러면 중복제거 해보기
	public static LoginVO detailMember(LoginVO param) {
		LoginVO vo = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT i_id, i_name, i_email, i_gender FROM login "
				+ " WHERE i_numID = ? ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getI_numId());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				vo = new LoginVO();
				vo.setI_id(rs.getNString("i_id"));
				vo.setI_name(rs.getNString("i_name"));
				vo.setI_email(rs.getNString("i_email"));
				vo.setI_gender(rs.getNString("i_gender"));
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(rs, ps, con); 
		}
		return vo;
	}
	
	// 로그인했을시 아이디/비번 유효검사 하는 메소드
	// 내가진짜 잔대가리 굴려서 만든 메소드 ! 
	public static String loginMain(String i_id, String i_ps) {
		List<LoginVO> loginList = new ArrayList(); 
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT i_id, i_ps FROM login ";
		String answer = "";
						
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				LoginVO vo = new LoginVO();
				
				//i_id = rs.getNString("i_id");
				vo.setI_id(rs.getNString("i_id"));
				vo.setI_ps(rs.getNString("i_ps"));
				
				if(i_id.equals(vo.getI_id()) && i_ps.equals(vo.getI_ps())) {
					answer = "yes";
				} 
			}	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(rs, ps, con);
		}
		
		return answer;
	}
	
	
}
