package Vehicle;

public class TestVehicle {
public static void main(String args[]) {
	double busMPG,truckMPG; 
	Bus bus = new Bus();
	bus.setMake("Volvo");
	bus.setYear("2010");
	bus.setHorsePower(800);
	bus.setNoOfPassengers(40);
	bus.displayAttributes();
	System.out.println("Bus MPG = " + bus.calculateMPG());
	Truck truck = new Truck();
	truck.setMake("Tata");
	truck.setHorsePower(800);
	truck.setYear("2000");
	truck.setTowingCapacity(5.5);
	truck.displayAttributes();
	System.out.println("Truck MPG = " + truck.calculateMPG());

	
	
}
}
