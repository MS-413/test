package constructor;

public class Car {

	int gear = 0;
	String color = "";
	double discount = 0.0;
	boolean remote = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car(10);
		Car c3 = new Car(100, "Black");
		c1.getValue();
		c2.getValue();
		c3.getValue();
				
	}
	public Car() {
		this.gear = 5;
		this.color = "whihe";
		this.discount = 0.1;
		this.remote = false;
		
	}
	public Car(int gear) {
		this();
		this.gear = gear;
	}
	public Car(int gear, String color) {
		this(gear);
		this.color = color;
	}
	public Car(int gear, String color, double discount) {
		this(gear,color);
		this.discount = discount;
	}
	public Car(int gear, String color, double discount, boolean remote) {
		this(gear,color,discount);
		this.remote = remote;
	}
	
	public void getValue() {
		System.out.println(gear + color + discount + remote);
	}
	
}
