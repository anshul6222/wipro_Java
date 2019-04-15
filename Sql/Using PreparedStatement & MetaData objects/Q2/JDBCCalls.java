/*  Inserting a record
ABC International School wants to computerize students details. The school maintains a database of students in Oracle. The student table contains information related to students and is shown in the following student table structure. 
Column Name Type  Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20)  Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date 
Fees Number (9,2) 
           
 When a new student joins the school, the student record is inserted in the student table.  The valid student details are as follows:
• Rollno: Valid value is a 4-digit number 
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Write a Java program to insert some records to the table*/

package Q1;
import java.util.*;
import java.sql.*;

class JDBCCalls{

	public static void main(String[] args) {
		try{
			InsertData e = new InsertData();
			e.insert(args);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}