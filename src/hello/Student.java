package hello;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	ArrayList<Book> bookList;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author) {
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(" 학생이 읽은 책은 ");
		
		/*
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		*/
		for(int i = 0; i < bookList.size(); i++) {
			Book test = bookList.get(i);
			System.out.print(test.getTitle() + " ");
		}
		
		System.out.println(" 입니다.");
	}

}
