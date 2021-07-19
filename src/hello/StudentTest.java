package hello;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student(101, "Lee");
		Student kim = new Student(102, "Kim");
		Student choi = new Student(103, "Choi");
		
		lee.addBook("태백산맥1", "A");
		lee.addBook("태백산맥2", "A");
		
		kim.addBook("토지1", "B");
		kim.addBook("토지2", "B");
		kim.addBook("토지3", "B");
		
		choi.addBook("해리포터1", "C");
		choi.addBook("해리포터2", "C");
		choi.addBook("해리포터3", "C");
		choi.addBook("해리포터4", "C");
		choi.addBook("해리포터5", "C");
		choi.addBook("해리포터6", "C");
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		choi.showStudentInfo();
	}
}
