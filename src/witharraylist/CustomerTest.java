package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "이순신");
		Customer Shin = new Customer(10010, "신사임당");
		Customer Hong = new GoldCustomer(10010, "홍길동");
		Customer Park = new GoldCustomer(10010, "박태영");
		Customer Kim = new VIPCustomer(10010, "김유신", 12345);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Park);
		customerList.add(Kim);
		
		System.out.println(" ===== 고객 정보 출력 ===== ");
		
		for(int i = 0 ; i < customerList.size(); i++) {
			Customer cst = customerList.get(i);
			System.out.println(cst.showCustomerInfo());
		}
		
		System.out.println(" ===== 할인율과 보너스 포인트 계산 ===== ");
		
		int price = 10000;
		
		for(int i = 0; i < customerList.size(); i++) {
			Customer cst = customerList.get(i);
			int cost = cst.calcPrice(price);
			System.out.println(cst.getCustomerName() + " 님이 " + cost + " 원 지불하셨습니다.");
			System.out.println(cst.getCustomerName() + " 님의 현재 보너스 포인트는 " + cst.bonusPoint + " 점 입니다.");
		}
	}
}
