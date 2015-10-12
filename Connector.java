
package JDBC;

import java.sql.*;

public class Connector {
    
    Connection myConnection;
    Statement myStatement;
    ResultSet myRS;
    
    public Connector() {
        myConnection = null;
        myStatement = null;
        myRS = null;
    }
    
    /* open a connection */
    public void openConnection() throws SQLException {
        String user = "root";
        String pass = "p@ssword";
        String url = "jdbc:mysql://127.0.0.1:3306/inventory";
    
        try {
            myConnection = DriverManager.getConnection(url, user, pass);
            
            myStatement = myConnection.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /* close connection with database */
    public void closeConnection() throws SQLException {
        if(myRS != null)
            myRS.close();
        if(myStatement != null)
            myStatement.close();
        if(myConnection != null)
            myConnection.close();
    }
    
//    public abstract void addObject(Object o);
//    public abstract boolean objectExists(Object o);
//    public abstract ArrayList getObjectList(Statement s, ResultSet rs);
}
