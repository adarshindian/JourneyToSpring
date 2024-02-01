package com.database;

import java.sql.*;
import com.model.Customer;

public class DML {

	public int insertDataToDatabase(Customer c) throws SQLException {
		try {
			Connection con = DatabaseCon.initializeDatabase();
			PreparedStatement st = con
					.prepareStatement("insert into personal(name,address,contact_no,email,pass) values(?,?,?,?,?)");
			st.setString(1, c.getFname() + " " + c.getLname());
			st.setString(2, c.getStreet() + " " + c.getCity() + " " + c.getAddress());
			st.setString(3, c.getPhone());
			st.setString(4, c.getEmail());
			st.setString(5, c.getPass());
			st.executeUpdate();
			st.close();
			con.close();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con = DatabaseCon.initializeDatabase();
		String query = "SELECT * FROM personal WHERE email=?";
		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean validateLogin(String email, String pass) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con = DatabaseCon.initializeDatabase();
		String query = "SELECT * FROM personal WHERE email=? and pass=?";
		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, email);
			statement.setString(2, pass);
			ResultSet resultSet = statement.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
