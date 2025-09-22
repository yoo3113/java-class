package lambda.func_interface;

public class StringConcatTest {

	public static void main(String[] args) {
		//StringConcat 인터페이스의 인스턴스 생성
		StringConcat concat;
		String str1 = "Demon";
		String str2 = "Hunters";
		
		concat = (s1, s2) -> System.out.println(s1 + ", " + s2);
		
		concat.makeString(str1, str2);

	}

}
