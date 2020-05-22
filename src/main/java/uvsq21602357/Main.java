package uvsq21602357;

import java.sql.SQLException;

public enum Main {

APPLICATION;

public void run(final String[] args) { }

    public static void main(final String[] args) throws ClassNotFoundException, SQLException {
    	JDBC j = new JDBC();
    	j.CreateTable();
    	
     APPLICATION.run(args);
    }

}