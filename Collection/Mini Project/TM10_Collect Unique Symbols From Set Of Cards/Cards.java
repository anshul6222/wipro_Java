import java.util.*;
public class Cards {
	
	static String symbol;
	static int number;
	// TreeSet to store the symbol of the card. Where symbols are "a", "b", "c", "d".
	TreeSet<String> card = new TreeSet<String>();
	//Array to store the number of card
	ArrayList<Integer> al = new ArrayList<Integer>(Collections.nCopies(60, 4));// Initialising array list to zeroes
	int counter = 0;
	// 97 is ASCII code for 'a'
	int flag = 97;
	// ch is used to check the presence of each unique card symbol in the set
	Character ch = (char)flag;
	
	public void add(String symbol, int number, int n) {
		this.symbol = symbol;
		this.number = number;
		
		// to check if the symbol to be added is unique in the set
		if(card.add(symbol) == true) {
			
			// number for card "a" is stored in index 0 in the list, "b" in index 1 and so on......
			if(symbol.equals("a"))
				al.set(0, number);
			if(symbol.equals("b"))
				al.set(1, number);
			if(symbol.equals("c"))
				al.set(2, number);
			if(symbol.equals("d"))
				al.set(3, number);
		}
		
		Iterator<String> i = card.iterator();
		while(i.hasNext()) {
			if(ch.toString().equals(i.next())) {
				// incrementing the counter value
				++counter;
				// change the value of ch to next card symbol
				ch = (char)(++flag);
			}
		}
		// if all the unique card symbol are now present in the set then display all the card values
		if(counter == 4)
			display(n);
	}
	
	public void display(int n) {
		System.out.println("Four symbols gathered in " + n+ " cards.");
		System.out.println("Cards in Set are: ");
		Iterator<String> i = card.iterator();
		Iterator<Integer> j = al.iterator();
		while(i.hasNext() ) {
			System.out.print(i.next() + "\t");
			System.out.println(j.next());
		}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Cards obj = new Cards();
		Scanner sc = new Scanner(System.in);
		// n to count number of cards
		int n =0;
		while(true) {
			++n;
			System.out.println("Enter a card: ");
			symbol = sc.nextLine();
			number = sc.nextInt();
			sc.nextLine();
			obj.add(symbol, number, n);
		}
		
	}
}
