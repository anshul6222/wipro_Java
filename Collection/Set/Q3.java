import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Apple");
		tree.add("Dell");
		tree.add("Hp");
		tree.add("Razor");
		tree.add("Asus");
		tree.add("Acer");
		//making a new TreeSet to store the reverse order of the original tree
		TreeSet<String> reverseTree = new TreeSet<String>();
		// reversing the content and saving it in reverseTree
		reverseTree = (TreeSet<String>) tree.descendingSet();
		
		//printing all  the elements of tree and reverseTree
		
		Iterator<String> i= tree.iterator();
		Iterator<String> j = reverseTree.iterator();
		
		// printing tree content
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		//printing reverseTree content
		
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		String find = "Razor";
		boolean flag = false;
		
		//reseting the iterator value
		i= tree.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals(find)) {
				flag = true;
				break;
			}
		}
		System.out.println();
		if(flag == true) {
			System.out.println("Element exists in the set.");
		}
		else {
			System.out.println("Element does not exists in the set ");
		}		
		
	}
}
