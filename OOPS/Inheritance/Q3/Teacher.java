public class Teacher extends Person {
  double salary;
  String subject;
  
  Teacher(String name, int age, double salary, String subject){
	  super(name, age);
	  this.salary = salary;
	  this.subject = subject;
	 	  
  }
  
  public void show() {
	  System.out.println("Teacher name is: " + name);
	  System.out.println("Teacher age is: " +age);
	  System.out.println("Salary is: " + salary);
	  System.out.println("Subject is " + subject);
  }
}
