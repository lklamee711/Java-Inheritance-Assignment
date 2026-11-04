//Linda LaMee
//CIS208

package inheritance;

public class Vehicle {
	String brand;
	int year;
	
	public Vehicle (String brand, int year) {
		this.brand=brand;
		this.year=year;
	}
	
	void startEngine() {
		System.out.println("The vehicle engine is starting.");
	}
	void displayInfo(){
		System.out.println("Vehicle Brand: " + brand);
		System.out.println("Vehicle Year: " + year);
	}
}
