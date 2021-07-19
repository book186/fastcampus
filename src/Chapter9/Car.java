package Chapter9;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public abstract void showCarScep();
	
	protected String carName;
	
	public Car (String carName) {
		this.carName = carName;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		showCarScep();
	}
}
