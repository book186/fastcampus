package Chapter07;

public class OverridengTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VipCustomer customerKim = new VipCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "���ұݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + priceKim + "�� �Դϴ�.");
		
		Customer customerNo = new VipCustomer(10030, "������");
		customerNo.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + customerNo.calcPrice(10000) + "�� �Դϴ�.");
	}
}
