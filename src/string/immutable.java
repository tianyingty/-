package string;

public class immutable {

	public static String upcase(String s){
		//String类中每个看起来会修改String值的方法，实际上都是创建一个全新的String对象，以包含修改后的字符串内容
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = "howdy";
		System.out.println(q);
		String qq = upcase(q);
		System.out.println(qq);
		System.out.println(q);
	}
}
