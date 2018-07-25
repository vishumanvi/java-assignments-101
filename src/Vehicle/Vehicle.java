package Vehicle;

public class Vehicle {
	protected String make;
	protected String year;
	protected int horsePower;
	protected double milesPerGallon;
	
Vehicle() {
	make = "Not set";
	year = "Not set";
	horsePower = 0;
	milesPerGallon = 0;
}

public String getMake() {
	return make;
}

public String getYear() {
	return year;
}

public int getHorsePower() {
	return horsePower;
}

public void setMake(String carMake) {
	make = new String (carMake);
}

public void setYear(String carYear) {
	year = new String (carYear);
}

public void setHorsePower(int carHorsePower) {
	horsePower = carHorsePower;
}

public double getMilesPerGallon() {
	return milesPerGallon;
}

public void setMilesPerGallon(int CarMilesPerGallon) {
	milesPerGallon = CarMilesPerGallon;
}

}

