package Chapter9;

public class Genesis extends Car {
	
	public Genesis(String carName) {
		super(carName);
		this.carName = carName;
	}

	@Override
	public void start() {
		System.out.println(carName + " �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(carName + " �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(carName + " ����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println(carName + " �õ��� ���ϴ�.");
	} 

	public void showCarScep() {
		System.out.println("*************�� ���� ���׽ý��Դϴ�.*************");
	}
}
