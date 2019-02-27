/*  Write a program to print the sum of the elements of the array with the given below condition.
 *  If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
 */
import java.util.*;
class HelloWorld{
	 public static void main(String[] args) {
		int[] arr = new int[] {10,3,6,1,2,7,9} ;
		int six = -1;
		int seven = -1;
		int sum = 0;
		for(int i = 0; i < arr.length; ++i)
		{
			if(arr[i] == 6)
				six = i;
			else if(arr[i] == 7)
				seven = i;
		}
		if(six < seven && six != -1 || seven != -1) // 6 and 7 are both present in the array and 6 is occurring before 7
		{
			for(int i = 0; i < arr.length; ++i)
			{
				if(i < six || i > seven) 
					sum = sum + arr[i];
				else
					continue;  // if number is in between six and seven or is six or seven then continue
			}
		}
		else // if either 6 or 7 or both 6 and 7 are not present in array or 7 is occurring before 6
		{
			for(int i = 0; i < arr.length; ++i)
			{
				sum = sum + arr[i];
			}
		}
		
		System.out.println(sum);
	 }
}