package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "�̼���");
		Customer Shin = new Customer(10010, "�Ż��Ӵ�");
		Customer Hong = new GoldCustomer(10010, "ȫ�浿");
		Customer Park = new GoldCustomer(10010, "���¿�");
		Customer Kim = new VIPCustomer(10010, "������", 12345);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Park);
		customerList.add(Kim);
		
		System.out.println(" ===== �� ���� ��� ===== ");
		
		for(int i = 0 ; i < customerList.size(); i++) {
			Customer cst = customerList.get(i);
			System.out.println(cst.showCustomerInfo());
		}
		
		System.out.println(" ===== �������� ���ʽ� ����Ʈ ��� ===== ");
		
		int price = 10000;
		
		for(int i = 0; i < customerList.size(); i++) {
			Customer cst = customerList.get(i);
			int cost = cst.calcPrice(price);
			System.out.println(cst.getCustomerName() + " ���� " + cost + " �� �����ϼ̽��ϴ�.");
			System.out.println(cst.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + cst.bonusPoint + " �� �Դϴ�.");
		}
	}
}
