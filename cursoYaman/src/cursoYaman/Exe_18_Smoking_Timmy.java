package cursoYaman;

public class Exe_18_Smoking_Timmy {
	public static void main(String[] args) {
		System.out.println(startSmoking(0, 1));
		System.out.println(startSmoking(1, 0));
		System.out.println(startSmoking(1, 1));
		System.out.println(startSmoking(10, 2));
		System.out.println(startSmoking(0, 0));
	}

	public static int startSmoking(int bars, int boxes) {
		int inteiros = 0;

		if (bars > 0 && boxes > 0) {
			inteiros = ((boxes += (bars * 10)) * 18);
		} else if (bars > 0 && boxes == 0) {
			inteiros = (bars * 10) * 18;
		} else if (bars == 0 && boxes > 0) {
			inteiros = boxes * 18;
		}
		else
			inteiros = 0;

		return fumados(inteiros);
	}

	public static int fumados(int inteiros) {
		int fumados = 0, bitucas = 0;

		fumados = inteiros;
		bitucas = inteiros;

		while (inteiros != 0) {

			// 1º
			inteiros = bitucas / 5;
			bitucas = bitucas % 5;

			// 2º
			fumados += inteiros;

			// 3º
			bitucas += inteiros;

		}
		return fumados;

	}
}
