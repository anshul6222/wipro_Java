/* Write a program to initialize an integer array and print the sum and average of the array*/
class Q1{
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,5,5,3};

		int sum = 0;

		for(int i = 0; i < arr.length; ++i){
			sum = sum + arr[i];
		}

		System.out.println(sum);
	}
}