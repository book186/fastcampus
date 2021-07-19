package collection.hashmap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member mamberLee = new Member(100, "Lee");
		Member mamberKim = new Member(200, "Kim");
		Member mamberPark = new Member(300, "Park");
		Member mamberPark2 = new Member(300, "Park2");
		
		manager.addMember(mamberLee);
		manager.addMember(mamberKim);
		manager.addMember(mamberPark);
		manager.addMember(mamberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}
}
