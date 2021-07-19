package Chapter07;

public class OverridengTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VipCustomer customerKim = new VipCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		
		Customer customerNo = new VipCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "원 입니다.");
	}
}
