/*   Modification of Student record 
When there is a change in the fee to be paid by a student, the respective row should be appropriately updated.
 Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in
  the table for that particular student.*/

package Q1;
import java.util.*;
import java.sql.*;

class JDBCCalls{

	public static void main(String[] args) {
		try{
			ModifyData e = new ModifyData();
			e.modify(args);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}