/*Deleting a Student’s record
When a student leaves the school, the record related to that student needs to be deleted from the Student table. The student’s roll no, whose record has to be deleted, should be passed as a command line argument.
Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the details such as Rollno, StudentName, Standard and Leaving_date.*/


import java.sql.*;
class DeleteData{

	Connection con;

	DeleteData(){
		ConnectionClass x = new ConnectionClass();
		con = x.connectionFactory();
	}

	public void delete(String[] args)throws SQLException{
		int Rollno = args[0];
		//saving the record of the student whose record has to be deleted in StudentLog
		PreparedStatement ps = con.prepareStatement("insert into StudentLog(Rollno, StudentName, Standard, Leaving_date)
		 select Rollno, StudentName, Standard, TimeStamp from student where Rollno = ?");
		ps.setInt(1, Rollno);
		ps.executeUpdate();

		// deleting  the record of the student
		PreparedStatement pst = con.prepareStatement(" delete from student where Rollno = ?");
		pst.setInt(1, Rollno);
		pst.executeUpdate();
	}
}