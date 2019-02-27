/* Java Fundamentals Mini Project */

import java.io.*;
import java.util.*;
class HelloWorld
{
	public static void main(String[] args)
	{	boolean flag = false;

		// employee database array
		String[][] arr = new String[][] {{"1001","Ashish","01/04/2009","e","R & D","20000","8000","3000"}, {"1002","Sushma","23/08/2012","c",
			"PM","30000","12000","9000"},{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
			{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
			{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
			
			// 7*8 array
			/*col 1: emp no, col 2:Emp Name, col 3: Join date, col 4: Designation code, col 5: Depratment,
			 * col 6: Basic, col 7: HRA, col 8: IT  */
			
			if(args.length == 0) // if employee id is not given in arguments
			{
				System.out.println("Please enter the empid.");
				System.exit(0);
			}
			else { // to check whether employee with the given id is present or not
				String empid = args[0];
				
				for(int i = 0; i <7; ++i ) {
					if(empid.equals(arr[i][0])) {
						flag = true;
						break;
					}	
				}
				
			}
			if(flag == false)
				System.out.println("There is no employee with empid "+ args[0]);
			else
			{	String empid = args[0];
				String code="";
				int da;
				int basic = 0;
				int hra = 0;
				int it = 0;
				System.out.println("Emp No.\t Emp Name\t Department\t Designation\t Salary");// displaying the output heading
				System.out.print(empid + "\t"); // displaying employee id
				int i = 0; // index of the employee in array
				for(i=0; i<7; ++i)
				{   
					if(arr[i][0].equals(empid)) {
						System.out.print(arr[i][1] + "\t\t");  //displaying Employee name
						System.out.print(arr[i][4] + "\t\t");  // displaying Department name
						code = arr[i][3];
						basic = Integer.parseInt(arr[i][5]);
						hra =  Integer.parseInt(arr[i][6]);
						it = Integer.parseInt(arr[i][7]);
						break;
					}	
				}
				int salary = 0;
				
				switch(code) // to display designation and salary. Where salary = Basic + Hra + DA - It.
				{
					case "e": System.out.print("Engineer\t\t");
								salary = basic + hra + 20000 - it;
								System.out.println(salary);
								break; 
					
					case "c": System.out.print("Consultant\t\t");
								 salary = basic + hra + 32000 - it;
								System.out.println(salary);
								break; 
					
					case "k": System.out.print("Clerk\t\t");
								salary = basic + hra + 12000 - it;
								System.out.println(salary);
								break; 
								
					case "r": System.out.print("Receptionist\t\t");
							 salary = basic + hra + 15000 - it;
								System.out.println(salary);
								break; 		
								
					case "m": System.out.print("Manager\t\t");
								salary = basic + hra + 40000  - it;
								System.out.println(salary);
								break; 						
				}
			}
	}
}
 