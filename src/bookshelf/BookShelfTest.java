package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("�¹ڻ��1");
		bookQueue.enQueue("�¹ڻ��2");
		bookQueue.enQueue("�¹ڻ��3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
}
