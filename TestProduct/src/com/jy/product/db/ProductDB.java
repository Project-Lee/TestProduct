package com.jy.product.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class ProductDB {
	
	// product 테이블의 모든 값을 나타내는 메소드
	public static List<ProductVO> selectProduct() {
		
		List<ProductVO> productList = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT i_num, i_name, i_price FROM product "
				+ " ORDER BY i_num ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				
				vo.setI_num(rs.getInt("i_num"));
				vo.setI_name(rs.getNString("i_name"));
				vo.setI_price(rs.getInt("i_price"));
				
				productList.add(vo);
			}
					
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(rs, ps, con);
		}
		
		return productList;
		
		
		
		
	}
	
	// i_num 컬럼의 n번째 값만 그 레코드 컬럼을 출력할지 나타내는 메소드
	public static List<ProductVO> selectProduct(int num) {
			
			List<ProductVO> productList = new ArrayList();
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			String sql = " SELECT i_num, i_name, i_price FROM product WHERE i_num = ? ";
					
			
			try {
				con = DAO.getCon();
				ps = con.prepareStatement(sql);
				ps.setInt(1,num);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					ProductVO vo = new ProductVO();
					
					vo.setI_num(rs.getInt("i_num"));
					vo.setI_name(rs.getNString("i_name"));
					vo.setI_price(rs.getInt("i_price"));
					
					productList.add(vo);
				}
						
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				DAO.close(rs, ps, con);
			}
			
			return productList;
		
		
		
		
	}

	// i_num 컬럼의 n번째값을 삭제할지 결정하는 메소드
	public static void deleteProduct(int i_num) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " DELETE product WHERE i_num = ? ";
		
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, i_num);
			ps.executeUpdate();
				
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAO.close(ps, con);
		}
		
		
	}
	
	
	// insert문 만들기 
	public static void insertProduct(String i_name, int i_price) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO product(i_num, i_name, i_price) "
				+ " SELECT nvl(max(i_num),0)+1, ?, ? "
				+ " FROM product ";
				
		try {
			con = DAO.getCon();
			ps = con.prepareStatement(sql);
			ps.setNString(1, i_name);
			ps.setInt(2, i_price);
			ps.executeUpdate();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			DAO.close(ps, con);
		}
	}

	
	
	
	
}
