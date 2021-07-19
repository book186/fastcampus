package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member mamberPark = new Member(300, "Park");
		Member mamberLee = new Member(100, "Lee");
		Member mamberKim = new Member(200, "Kim");
		Member mamberPark2 = new Member(400, "Park2");
		
		manager.addMember(mamberLee);
		manager.addMember(mamberKim);
		manager.addMember(mamberPark);
		manager.addMember(mamberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}
}
