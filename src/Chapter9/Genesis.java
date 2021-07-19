package Chapter9;

public class Genesis extends Car {
	
	public Genesis(String carName) {
		super(carName);
		this.carName = carName;
	}

	@Override
	public void start() {
		System.out.println(carName + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(carName + " 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(carName + " 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(carName + " 시동을 끕니다.");
	} 

	public void showCarScep() {
		System.out.println("*************이 차는 제네시스입니다.*************");
	}
}
