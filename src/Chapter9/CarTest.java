package Chapter9;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata("�ҳ�Ÿ"));
		carList.add(new Grandeur("�׷���"));
		carList.add(new Avante("�ƹݶ�"));
		carList.add(new Genesis("���׽ý�"));
		
		/*
		for(Car car : carList) {
			car.run();
		}
		*/
		
		for(int i = 0 ; i < carList.size(); i++) {
			Car c = carList.get(i);
			c.run();
		}
	}
}