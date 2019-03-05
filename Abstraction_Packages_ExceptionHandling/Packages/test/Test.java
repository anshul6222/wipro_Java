package test;
import test.*;

class Test{
	public static void main(String[] args) {
		Foundation obj = new Foundation();

		//System.out.println(obj.var1); //error: var1 has private access in Foundation
		System.out.println(obj.var2); // output: 2
		System.out.println(obj.var3); //output: 3
		System.out.println(obj.var4); //output: 4
	}
}