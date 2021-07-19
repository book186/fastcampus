package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("È«±æµ¿");
		treeSet.add("ÀÌ¼ø½Å");
		treeSet.add("±èÀ¯½Å");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
