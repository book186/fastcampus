package chapter12;

import java.util.ArrayList;

public class TravelTest2 {
	
	public static void main(String[] args) {
		
		TravelCustomer2 customerLee = new TravelCustomer2("ÀÌ¼ø½Å", 40, 100);
		TravelCustomer2 customerKim = new TravelCustomer2("±èÀ¯½Å", 20, 100);
		TravelCustomer2 customerHong = new TravelCustomer2("È«±æµ¿", 15, 50);
		
		ArrayList<TravelCustomer2> customList = new ArrayList<TravelCustomer2>();
		customList.add(customerLee);
		customList.add(customerKim);
		customList.add(customerHong);
		
		System.out.println(customList);
		
		customList.stream().map(s -> s.getName()).forEach(s -> System.out.println(s));
		
		int priceTotal = customList.stream().mapToInt(s -> s.getPrice()).sum();
		System.out.println(priceTotal);
		
		customList.stream().filter(s -> s.getAge() >= 20).map(s -> s.getName()).sorted().forEach(s -> System.out.println(s));
		
	}
}
