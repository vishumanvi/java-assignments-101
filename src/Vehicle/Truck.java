package Vehicle;

public class Truck extends Vehicle {
	private double towingCapacity;
	
	Truck() {
		super();
		towingCapacity = 0;
	}
	
	public double getTowingCapacity() {
		return towingCapacity;
	}
	
	public void setTowingCapacity(double truckTowingCapacity) {
		towingCapacity = truckTowingCapacity;
	}
	
	public double calculateMPG() {
		milesPerGallon = 5000/(towingCapacity*horsePower);
		return milesPerGallon;
	}
	public void displayAttributes() {
		System.out.println("Attributes of Bus are : " + "1. Make is " + getMake() + "2. Year is " + getYear() + "3. HP is " + getHorsePower() + "4. Towing Capacity " + getTowingCapacity());
	}

}
