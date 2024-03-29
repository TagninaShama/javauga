/**
 * 
 */
package dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Product;


public class AddQuery {
	
	public Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAdd(Product product){
		String query = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?)";
				
						
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, product.getSKU());
			ps.setString(2, product.getProductType());
			ps.setString(3, product.getFlavor());
			ps.setDouble(4, product.getCost());
			ps.setDouble(5, product.getPrice());
			ps.setInt(6, product.getQuantity());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
