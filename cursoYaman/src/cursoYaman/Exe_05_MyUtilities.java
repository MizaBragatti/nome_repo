package cursoYaman;

public class Exe_05_MyUtilities {

	public static void main(String[] args) {
		System.out.println(isDigit("3"));
		System.out.println(isDigit(" 3 "));
		System.out.println(isDigit("-3.23"));
		
		System.out.println(isDigit("3-4"));
	}

	public static boolean isDigit(String s) {
		
		try {
			Double.parseDouble(s);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
			
		
	}
}
