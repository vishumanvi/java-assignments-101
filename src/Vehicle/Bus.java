package Vehicle;

public class Bus extends Vehicle {
	private int noOfPassengers;
	
	Bus() {
		super();
		noOfPassengers = 0;
	}
	
	int getNoOfPassenger() {
		return noOfPassengers;
	}
	
	public void setNoOfPassengers(int busNoOfPassengers) {
		noOfPassengers = busNoOfPassengers;
	}
	
	public double calculateMPG() {
		milesPerGallon = 10000.0/(noOfPassengers* horsePower);
		return milesPerGallon;
	}
	
	public void displayAttributes() {
		System.out.println("Attributes of Bus are : " + "1. Make is " + getMake() + "2. Year is " + getYear() + "3. HP is " + getHorsePower() + "4. No of passengers is " + getNoOfPassenger());
	}

}
