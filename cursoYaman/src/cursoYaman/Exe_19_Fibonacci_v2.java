package cursoYaman;

public class Exe_19_Fibonacci_v2 {
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	public static long fib(int n) {

		long ant = 0, prox = 1, atual = 0;

		if (n < 2)
			return n;
		else {

			for (int i = 1; i < n; i++) {
				atual = ant + prox;
				ant = prox;
				prox = atual;

			}
			return atual;
		}
	}
}
