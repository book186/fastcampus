package Chapter10;

class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.year == date.year && this.month == date.month && this.day == date.day) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return year * 1001 + month * 101 + day * 11; 
	}
}

public class MyDateTest {
	
	public static void main(String[] args) {
		MyDate date1 = new MyDate(2021, 04, 14);
		MyDate date2 = new MyDate(2021, 04, 14);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}
}