package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com = new DeskTop();
		com.display();
		com.turnOff();
		
		NoteBook myn = new MyNoteBook();
		myn.display();
	}
}
 