public class TestCompartment {

	public static void main(String[] args) {
		int[] compartment = new int[10];
		
		Compartment obj1 = new FirstClass();
		Compartment obj2 = new  Ladies();
		Compartment obj3 = new General();
		Compartment obj4 = new Luggage();
		
		int range = 4; // range for the random number
		int min = 1; // minimum value for random number
		
		for(int i=0; i < compartment.length; ++i) {   // 1: FirstClass, 2: Ladies, 3: General, 4: Luggage
			compartment[i] = (int)(Math.random() * range) + min; 
		}
		
		for(int i = 0; i < compartment.length; ++i) {
			
			if(compartment[i] == 1)
				System.out.println(obj1.notice());
			
			else if (compartment[i] == 2) 
				System.out.println(obj2.notice());
			
			else if(compartment[i] == 3)
				System.out.println(obj3.notice());
			
			else
				System.out.println(obj4.notice());
		}
		
	}
}
