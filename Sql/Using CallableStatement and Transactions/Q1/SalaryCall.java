/* Create a stored procedure that calculates net salary of all the employees whose records are stored in table "emp".
The criteria for calculating net salary is as follows :
Gross salary = sal + comm.
Net Salary = gross salary - IT
If the employee's commission is null then IT is calculated as
IT =  10% of gross salary
else if the employees commission is less than 500, then IT is calculated as
IT =  15% of gross salary
else
IT = 20% of gross salary.
Develop a jdbc program that invokes this stored procedure by passing the empno. and in return get
s the net salary of each employee. Display on screen the empno., ename and net salary of all the employees.*/

imoprt java.sql.*;

class SalaryCall{

    void calculateSalary(String[] args){
	float salary;
	Connection con;
	try{
	    ConnectionClassx = new ConnectionClass();
	    conn = x.connectionFactory();
	    String query = "{ Call netSalary (?)}";
	    int counter = 0;
	    //executing the query for all the employees present in the table
	    while(counter == args.length - 1){
		CallableStatement cstatement = con.prepareCall(query);
		cstatement.registerOutParameter(1, Type.FLOAT):
		cstatement.execute();
		salary = cstatement.getFloat();
		System.out.println("The salary of employee number: " + args[counter] + " is " + salary);
		counter++;
		cstatement.close();
		conn.close();
	    }catch(SQLException e){
		System.out.println("Cannot connect to the database.");
	    }
	    
	}
    }
}
