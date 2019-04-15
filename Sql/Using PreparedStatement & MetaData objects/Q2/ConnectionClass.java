package Q1;
import java.sql.*;
class ConnectionClass{

	Connection con;

	Connection connectionFactory(){
		try{
			//Registering the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Establishing connection
			String url = "jdbc:oracle:thin:@localhost:1521/orcl";
			con = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");
		}
		catch(Exception e){
			System.out.println(e);
		}

		return con;
	}
}