
import java.sql.*;

class InsertData{

	Connection con;

	InsertData(){
		ConnectionClass x = new ConnectionClass();
		con = x.connectionFactory();
	}

	//insert
	public void insert(String[] args){
		int Rollno = args[0];
		String StudentName = args[1];
		String Standard =  args[2];
		String Date_Of_Birth = args[3];
		int Fees = args[4];
		PreparedStatement pst = con.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
		pst.setInt(1, Rollno);
		pst.setString(2, StudentName);
		pst.setString(3, Standard);
		pst.setString(4, Date_Of_Birth);
		pst.setInt(5, Fees);
		pst.executeUpdate();
	}
}





