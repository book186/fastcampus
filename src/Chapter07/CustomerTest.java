package Chapter07;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(100010, "�̼���");
		//customerLee.setCustomerID(100010);
		//customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VipCustomer(10020, "������");
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
