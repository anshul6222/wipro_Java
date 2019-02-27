package myPackage;

/* Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results. */

public class Patient {
	String patientName;
	double height;
	double weight;
	
	Patient(String patientName, double height, double width){
		this.patientName = patientName;
		this.height = height;
		this.weight = width;
	}
	
	public double computeBMI() {
		return weight / height;
	}
	
	public static void main(String[] args) {
		Patient obj1 = new Patient("Abc", 1.2, 65);
		System.out.println("The BMI of the patient is " + obj1.computeBMI());
	}

}
