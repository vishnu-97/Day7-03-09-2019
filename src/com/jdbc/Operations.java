package com.jdbc;
import java.sql.*;


public class Operations {
	static Connection connection;
	
	static void initialize(String url,String username,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void insert(int age,String first,String last) {
		try {
			String sql="insert into employees(age,first,last) values("+age+",'"+first+"','"+last+"')";
			PreparedStatement p=connection.prepareStatement(sql);
			
			System.out.println(p.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	static void update(int age,String first,String last,int id) {
		try {
			String sql="update employees set age="+age+",first='"+first+"',last='"+last+"' where id="+id;
			PreparedStatement p=connection.prepareStatement(sql);
			
			System.out.println(p.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	static void delete(int id) {
		try {
			String sql="delete from employees where id="+id;
			PreparedStatement p=connection.prepareStatement(sql);
			
			System.out.println(p.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	static void alterAddColumn(String Col,String type) {
		try {
			String sql="alter table employees add "+Col+" "+type;
			PreparedStatement p=connection.prepareStatement(sql);
			
			System.out.println(p.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	static void alterDropColumn(String Col) {
		try {
			String sql="alter table employees drop "+Col;
			PreparedStatement p=connection.prepareStatement(sql);
			
			System.out.println(p.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	static void select(String sql) {
		try {
			PreparedStatement p=connection.prepareStatement(sql);
			ResultSet rs=p.executeQuery();
			while(!rs.isAfterLast()) {
//				System.out.
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		initialize("jdbc:mysql://localhost/java_training","root","hawking");
//		insert(22,"Manav","Jain");
//		update(22,"Anuj","Jhawar",101);
//		delete(102);
//		alterAddColumn("Salary", "int");
		alterDropColumn("Salary");
	}

}
