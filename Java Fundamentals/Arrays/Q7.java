/*  Write a program to remove the duplicate elements in an array and print
Eg) Array Elements-12,34,12,45,67,89
O/P: 12,34,45,67,89
 */
class Q7{
	 public static void main(String[] args) {
		 int[] arr = new int[] {12,34,12,45,67,89};
		 int[] arr2 = new int[arr.length];// copy array
		 
		 for(int i = 0; i < arr.length; ++i) {
			 for(int j = i+1; j < arr.length; ++j) {
				 if(arr[i] == arr[j]) {
					 arr[j] = -999; //element is duplicate
				 }
			 }
		 }
		 int j = 0;
		 for(int i = 0; i < arr.length; ++i) {  // copying the non duplicate elements of the original array
			 if(arr[i] != -999) { // if the element of the array is unique
				 arr2[j] = arr[i];
				 ++j;
			 }
		 }
		 for(int i = 0; i < j; ++i) {
			 System.out.println(arr2[i]);
		 }
	 }	 
 }
 