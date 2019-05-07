package string;

public class StringBuild {
	public String implicit(String[] fields){
		String result = "";
		for(int i = 0;i<fields.length;i++){
			result += fields[i];
		}
		return result;
	}

	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
	public static void main(String[] args){
		String mango = "mango";
		String s = "abc"+mango+"def"+47;
		System.out.println(s);
	}
}
