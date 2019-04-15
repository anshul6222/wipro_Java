/*Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular
 student.*/

package Q1;
import java.util.*;
import java.sql.*;

class JDBCCalls{

	public static void main(String[] args) {
		try{
			DisplayData e = new DisplayData();
				e.display(args);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}