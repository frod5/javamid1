package lang.immutable.address;

public class MemberMainV2 {
	public static void main(String[] args) {
		ImmutableAddress address = new ImmutableAddress("서울");

		MemberV2 member1 = new MemberV2("member1", address);
		MemberV2 member2 = new MemberV2("member2", address);

		//회원1,2 모두 주소는 서울
		System.out.println(member1);
		System.out.println(member2);

		//회원2 주소를 부산으로 변경해야한다.
		// member2.getAddress().setValue("부산"); 불변객체라 setter가 제공되지 않음.
		member2.setAddress(new ImmutableAddress("부산"));
		System.out.println(member1);
		System.out.println(member2);
	}
}
