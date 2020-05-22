package uvsq21602357;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class JDBC {
	public Connection conn;
	
	public JDBC() throws SQLException, ClassNotFoundException {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	      //Getting the Connection object
	      String URL = "jdbc:derby:DB;create=true";
	      this.conn = DriverManager.getConnection(URL);
	      if(conn!= null) {
	      System.out.println("ConnectÃ© Ã  la base");
	      }
	      //Creating the Statement object
	   }
	
	
	public void CreateTable() {
		  Statement stmt;
		try {
			stmt = this.conn.createStatement();
			 //Executing the query
		      String query = "CREATE TABLE Personnel( "
		         + "Nom VARCHAR(255) NOT NULL, "
		         + "Prenom VARCHAR(255) NOT NULL, "
		         + "Telephone VARCHAR(255), "
		         + "dateNaissance DATE, "
		         + "Fonction VARCHAR(255)T, "
		         + "PRIMARY KEY (Nom, Prenom))";
		         stmt.execute(query);
		         System.out.println("Table crÃ©er");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
	     
	}

}