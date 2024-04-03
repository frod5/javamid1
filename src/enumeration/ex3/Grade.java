package enumeration.ex3;

/**
 * 타입 안전 열거형 패턴을 자바에서 열거형 타입으로 제공해준다.
 * 열거형도 클래스
 * enum은 java.lang.Enum을 자동으로 상속받고있다.
 * 외부에서 임의로 생성할 수 없다.
 *
 * 앞서 만든 타입 안전 열거형 패턴과 같은 구조다.
 */
public enum Grade {
	BASIC, GOLD, DIAMOND
}
