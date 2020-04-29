package cursoYaman;

public class Exe_08_YesOrNo {

	public static void main(String[] args) {
		System.out.println(boolToWord(true));
	}

	public static String boolToWord(boolean b) {
		switch (""+b) {
		case ""+true:
			return "Yes";
		case ""+false:
			return "No";
		default:
			return "Invalid";
		}

	}

}
