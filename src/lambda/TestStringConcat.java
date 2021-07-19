package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("Helle", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString("ABC", "DEF");
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {

				System.out.println(s1 + "," + s2);
			}
		};
		concat2.makeString("123", "456");
	}
}
