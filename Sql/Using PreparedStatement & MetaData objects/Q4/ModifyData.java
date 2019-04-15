/*.  Modification of Student record 
When there is a change in the fee to be paid by a student, the respective row should be appropriately updated.
 Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the 
 table for that particular student.*/

import java.sql.*;

class ModifyData{

	Conncetion con;

	ModifyData(){
		ConnectionClass x = new ConnectionClass();
		con = x.connectionFactory();
	}

	//modifying a record
	void modify(String[] args)throws SQLException{

		int Rollno = args[0];
		int Fees = args[1];
		PreparedStatement pst = con.prepareStatement(" Update student set Fees = ? where Rollno = ?");
		pst.setInt(1, Fees);
		pst.setInt(2, Rollno);
		pst.executeUpdate();
	}
}