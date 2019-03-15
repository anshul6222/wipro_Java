import java.io.*;
import java.util.*;
public class Q3 {
	
	// to count the number of occurrence of word in input file
	static int countOfOccurences(String[] a, String word) {  
		 
		    int count = 0; 
		    for (int i = 0; i < a.length; i++)  
		    { 
		    // if match found increase count 
		    if (word.equals(a[i])) 
		        count++; 
		    } 
		  
		    return count; 
	}

	public static void main (String[] args)throws IOException
	{
		// Storing the word and it's corresponding frequency in the input file, in Map
		Map<String, Integer> map = new HashMap<>();  
		
		String inputFile = args[0];   // input file name
		String outputFile = args[1];   // output file name
		String str1 = "";
		
		 Scanner sc = new Scanner(new File(inputFile));
		 BufferedWriter br = new BufferedWriter(new FileWriter(outputFile));
		 
		// copying the content of the input file to string 'str1'
		while (sc.hasNextLine()) {  
		   str1  = str1 + sc.nextLine();
		   if(sc.hasNextLine())
			   str1 = str1 + " ";
	}
	
		// Storing each word in the string in a String array 'arr1' 
		String[] arr1 = str1.split(" ", 90);
	
		for(int i  = 0; i < arr1.length; ++i) {
			int number = countOfOccurences(arr1, arr1[i]);
			// storing word as key and frequency of that word as value in Map
			 map.put(arr1[i], number);
		}
		
		   // using TreeMap which is naturally sorted, to sort the content of Map
	       TreeMap<String, Integer> sorted = new TreeMap<>(); 
	       
	        // Copy all data from hashMap into TreeMap 
	        sorted.putAll(map); 
	  
	        // Copying the TreeMap values which is naturally sorted to output file
	        for (Map.Entry<String, Integer> entry : sorted.entrySet())  {
	            br.write(entry.getKey() + " " + entry.getValue() + "\n");
	        }
	        //closing the file
	        br.close();
}	
}
