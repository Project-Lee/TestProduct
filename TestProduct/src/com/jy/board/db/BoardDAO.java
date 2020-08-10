package com.jy.board.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jy.product.db.DAO;

public class BoardDAO {
	// 전체 글목록을 보여주는 메소드 
	public static List<BoardVO> selBoard() {
		List<BoardVO> boardList = new ArrayList();
		
		BoardVO vo = null;  
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT i_num, title, i_name FROM board ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				vo = new BoardVO();
				
				vo.setI_num(rs.getInt("i_num"));
				vo.setTitle(rs.getNString("title"));
				vo.setI_name(rs.getNString("i_name"));
				
				boardList.add(vo);			
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(rs, ps, con); 
		}
		
		return boardList;
	}
	
	// BoardDetail에 사용할 상세 페이지
	public static BoardVO detailBoard(int i_num) {		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		BoardVO vo = null;
				
		String sql = " SELECT i_num, title, ctnt, i_name FROM board"
				+ " WHERE i_num = ? ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, i_num);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				vo = new BoardVO();
				
				vo.setI_num(rs.getInt("i_num"));
				vo.setTitle(rs.getNString("title"));
				vo.setCtnt(rs.getNString("ctnt"));
				vo.setI_name(rs.getNString("i_name"));
				
			}
					
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			DAO.close(rs, ps, con); 
		}
		return vo;
	}

	
	

}
