package com.novonordisk.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmploeeCRUD {
	private String userName = "root";
	private String password = "Root123$";
	private String databaseURL = "jdbc:mysql://localhost:3306/trainingdb";
	private String select_all = "select * from employee_details";
	private String select_one = "select * from employee_details where employee_id =?";
	private String insert_one = "insert into employee_details values(?,?,?)";
	private String update_one = "update employee_details set name=? , salary=? where employee_id=?";
	private String delete_one ="delete from employee_details where employee_id =?";
	
	

	public void deleteEmployee(int employeeId) {
		try {

			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			PreparedStatement preparedStatement = connection.prepareStatement(delete_one);
			preparedStatement.setInt(1, employeeId);
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");
		}
	}

	public void getEmployeeByEmployeeID(int employeeId) {

		try {

			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			PreparedStatement preparedStatement = connection.prepareStatement(select_one);
			preparedStatement.setInt(1, employeeId);
			ResultSet result = preparedStatement.executeQuery();;
			while (result.next()) {
				System.out.print(result.getInt("employee_id"));
				System.out.print("\t" + result.getString("name"));
				System.out.println("\t" + result.getDouble("salary"));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");
		}
	}

	public void getAllEmployess() {

		try {
			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
			PreparedStatement preparedStatement = connection.prepareStatement(select_all);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				System.out.print(result.getInt("employee_id"));
				System.out.print("\t" + result.getString("name"));
				System.out.println("\t" + result.getDouble("salary"));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Connection Failed");
			System.out.println("Invalid Login Details");
		}
	}

//	public void updateEmployee(int employeeId, String name, double salary) {
//		// TODO Auto-generated method stub
//		
//	}


}

//	public void getEmployeeByEmployeeID(int employeeId) {
//
//		try {
//
//			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
//			PreparedStatement preparedStatement = connection.prepareStatement(select_one);
//			preparedStatement.setInt(1, employeeId);
//			ResultSet result = preparedStatement.executeQuery();
//			while (result.next()) {
//				System.out.print(result.getInt("employee_id"));
//				System.out.print("\t" + result.getString("name"));
//				System.out.println("\t" + result.getDouble("salary"));
//			}
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println("Connection Failed");
//			System.out.println("Invalid Login Details");
//		}
//	}
//
//	public void getAllEmployess() {
//
//		try {
//			Connection connection = DriverManager.getConnection(databaseURL, userName, password);
//			PreparedStatement preparedStatement = connection.prepareStatement(select_all);
//			ResultSet result = preparedStatement.executeQuery();
//			while (result.next()) {
//				System.out.print(result.getInt("employee_id"));
//				System.out.print("\t" + result.getString("name"));
//				System.out.println("\t" + result.getDouble("salary"));
//			}
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println("Connection Failed");
//			System.out.println("Invalid Login Details");
//		}
//	}
//}
