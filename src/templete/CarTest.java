package templete;

public class CarTest {
	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("==========");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
		System.out.println("==========");
		
		System.out.println(Car.GOOD_MORNING);
	}
}
