package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class SQLAccess {
	
	public static String url = "jdbc:mysql://localhost:3308/seminar";
	public static String userName = "root";
	public static String password = "suyog#2003";

	public static void main(String args[]) {
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM seminar.class");
			while(resultSet.next()) {
				String first_name = resultSet.getString("first_name");
				String last_name = resultSet.getString("last_name");
				String phone_no = resultSet.getString("phone_no");
				String address = resultSet.getString("address");
				
				System.out.println("Name: "+first_name+" "+last_name);
				System.out.println("Phone number: "+phone_no);
				System.out.println("Address: "+address);
				System.out.println("\n");
			}
			System.out.println("End of the code");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
