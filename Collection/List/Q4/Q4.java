import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		ArrayList<DataType> al = new ArrayList<DataType>(); //only integer, float and double data type value can be added as declared in the 
															//DataType class
		DataType obj = new DataType();
		obj.addInteger(3);
		obj.addDouble(2.0);
		obj.addFloat(99);
		
		al.add(obj); // number added to the array list
		
	}
}
