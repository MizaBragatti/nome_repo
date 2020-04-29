package cursoYaman;

public class Exe_07_Sum {
	public static void main(String[] args) {
		System.out.println(arrayPlusArray(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
	}

	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		/*
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i] + arr2[i];
		}
		return sum;
		*/
		int cont = 0, sum = 0;
		while(cont < arr1.length) {
			sum += arr1[cont] + arr2[cont];
			cont++;
		}
		return sum;
	}

}
