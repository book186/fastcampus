package Chapter9;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata("소나타"));
		carList.add(new Grandeur("그렌져"));
		carList.add(new Avante("아반떼"));
		carList.add(new Genesis("제네시스"));
		
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