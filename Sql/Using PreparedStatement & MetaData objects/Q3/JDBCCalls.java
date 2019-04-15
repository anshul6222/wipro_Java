/*Deleting a Student’s record
When a student leaves the school, the record related to that student needs to be deleted from the Student table.
 The student’s roll no, whose record has to be deleted, should be passed as a command line argument.
Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the details
 such as Rollno, StudentName, Standard and Leaving_date.*/

package Q1;
import java.util.*;
import java.sql.*;

class JDBCCalls{

	public static void main(String[] args) {
		try{
			DeleteData e = new DeleteData();
			e.delete(args);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}