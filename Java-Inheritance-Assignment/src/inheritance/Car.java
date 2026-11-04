//Linda LaMee
//CIS208

package inheritance;

public class Car extends Vehicle{
	int numberOfDoors;
	
	public Car(String brand, int year, int numberOfDoors) {
		super (brand, year);
		this.numberOfDoors = numberOfDoors;
	}
	void displayCarInfo() {
		displayInfo();
		System.out.println("Number of Doors: "+ numberOfDoors);
	}

	void honk() {
		System.out.println("Beep! Beep!");
	}
	
	
}
