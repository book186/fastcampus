package hello;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student(101, "Lee");
		Student kim = new Student(102, "Kim");
		Student choi = new Student(103, "Choi");
		
		lee.addBook("�¹���1", "A");
		lee.addBook("�¹���2", "A");
		
		kim.addBook("����1", "B");
		kim.addBook("����2", "B");
		kim.addBook("����3", "B");
		
		choi.addBook("�ظ�����1", "C");
		choi.addBook("�ظ�����2", "C");
		choi.addBook("�ظ�����3", "C");
		choi.addBook("�ظ�����4", "C");
		choi.addBook("�ظ�����5", "C");
		choi.addBook("�ظ�����6", "C");
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		choi.showStudentInfo();
	}
}
