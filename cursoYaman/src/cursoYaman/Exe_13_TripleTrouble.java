package cursoYaman;

public class Exe_13_TripleTrouble {
	public static void main(String[] args) {
		System.out.println(tripleTrouble("aa", "bb", "cc"));
	}

	public static String tripleTrouble(String one, String two, String three) {
		String res = "";
		for (int i = 0; i < one.length(); i++) {
			res += ""+one.charAt(i) + two.charAt(i) + three.charAt(i);
		}
		
		return res;
	}
}
