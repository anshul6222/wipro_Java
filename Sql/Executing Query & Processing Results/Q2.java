/*Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. 
Display the columns ename, job, sal and comm.*/

import java.sql.*;
import java.util.Properties;

public class Q2 {

    public static void main(String args[]) throws SQLException {
		
       //URL of Oracle database server
       String url = "jdbc:oracle:thin:@localhost:1521/orcl"; 
	   
	   Statement stmt;
	   ResultSet rs;
       Connection conn;
		
        
    //register the driver
	try {
  	 Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	catch(ClassNotFoundException ex) {
   		System.out.println("Error: unable to load driver class!");
   		System.exit(1);
	}
    
        try{
            //creating connection to Oracle database using JDBC
            conn = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");
		    //creating statement
            stmt = conn.createStatement();
            rs = stmt.executeQuery("Select * from emp where salary between 1000 and 2000 ");
            while(rs.next()){
              System.out.println(rs.getInt(1) + "\t" + rs.getString("LAST_NAME"));
            }
              conn.close();

    }
    catch(Exception e){
      System.out.println("Exception: " + e);
    }
    
		
      
    }
}