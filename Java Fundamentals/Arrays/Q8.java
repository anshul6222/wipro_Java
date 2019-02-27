/*  Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P:10
 */
class HelloWorld{
	 public static void main(String[] args) {
		int[] arr = new int[] {10,20,10,30,40,100,99} ;
		int high = 0; // highest frequency
		int temp = 0;
		int max_number = arr[0];// number with highest frequency 
		
		for(int i = 0; i < arr.length; ++i) {
			for(int j = i+1; j < arr.length; ++j) {
				if(arr[i] == arr[j]) {  // counting the frequency of each element of the array
					temp++;
				}
			}
			if(temp > high) {
				high = temp;
				max_number = arr[i];
			}
			temp = 0;
		}
		if (high != 0) {
			System.out.println(max_number);
		}
		else
			System.out.println("ALl numbers have the same frequency");
	 }
}