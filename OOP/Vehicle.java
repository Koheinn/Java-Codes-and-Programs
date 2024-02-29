package OOP;

public class Vehicle {
private String brand="Ford";
public void honk() {
	System.out.println("Tuu Tuu......");
}
public void drive() {
	System.out.println("Driving the car...");
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}

}
