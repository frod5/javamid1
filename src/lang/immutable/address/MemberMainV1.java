package lang.immutable.address;

public class MemberMainV1 {
	public static void main(String[] args) {
		Address address = new Address("서울");

		MemberV1 member1 = new MemberV1("member1", address);
		MemberV1 member2 = new MemberV1("member2", address);

		//회원1,2 모두 주소는 서울
		System.out.println(member1);
		System.out.println(member2);

		//회원2 주소를 부산으로 변경해야한다. address를 공유하여 둘다 변경된다.
		member2.getAddress().setValue("부산");
		System.out.println(member1);
		System.out.println(member2);
	}
}
