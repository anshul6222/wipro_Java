import java.sql.*;
class DisplayData
{
	Connection con;

	DisplayData{
		ConnectionClass x = new ConnectionClass();
		con = x.connectionFactory();
	}

	void display(String[] args)throws SQLException{
		//display the record of specified roll number
		if(args.length == 1){
			int Rollno = args[0];
			PreparedStatement pst = con.prepareStatement(" Select * from student where Rollno = ?");
			pst.setInt(1, Rollno);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4)
					+ " " + rs.getInt(5));
			}
		}
		// since no roll number is mention thus we will display records of all the students
		else{
			PreparedStatement pst = con.prepareStatement(" Select * from student ");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4)
					+ " " + rs.getInt(5));
			}
		}
	}
}