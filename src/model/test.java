package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public void connect() {
		 String url = "jdbc:mysql://localhost:3306/test";
		 String username = "root";
		 String password = "";

		 System.out.println("Connecting database...");

		 try (Connection connection = DriverManager.getConnection(url, username, password)) {
		     System.out.println("Database connected!");
		 } catch (SQLException e) {
		     throw new IllegalStateException("Cannot connect the database!", e);
		 }
	}
	public static void main(String[] args) {
		
	}
}

