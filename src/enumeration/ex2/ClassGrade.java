package enumeration.ex2;

public class ClassGrade {
	public static final ClassGrade BASIC = new ClassGrade();
	public static final ClassGrade GOLD = new ClassGrade();
	public static final ClassGrade DIAMOND = new ClassGrade();

	// 생성 못하도록
	private ClassGrade() {}
}
