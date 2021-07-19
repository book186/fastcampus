package Chapter07;

public class VipCustomer extends Customer {
	double salesRatio;
	private int agendID;
	
	/*
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VipCustomer() ������ ȣ��");
	}
	*/
	public VipCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VipCustomer() ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
