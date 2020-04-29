package cursoYaman;

public class Exe_02_Binary {
	public static void main(String[] args) {
		toBinary(10);
	}

	public static int toBinary(int n) {

		StringBuffer bin= new StringBuffer();
		while (n > 0) {
			if (n % 2 == 0) 
				bin.append("0");
			else
				bin.append("1");

			System.out.println(bin);
			n = n / 2;

		}
		
		System.out.println(bin.reverse());
		return Integer.parseInt(bin.reverse().toString());
	}
}
