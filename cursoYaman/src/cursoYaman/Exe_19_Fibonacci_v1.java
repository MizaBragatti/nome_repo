package cursoYaman;

public class Exe_19_Fibonacci_v1 {
	public static void main(String[] args) {
		fib(10);
	}

	public static void fib(int num) {
		int ant = 0, prox = 0, atual = 0;
		for (int i = 0; i <= num; i++) {

			if (i < 2) {
				if (i == 0)
					ant = i;
				if (i == 1)
					prox = i;
				System.out.print(i + ", ");
			} else {
				atual = ant + prox;
				System.out.print(atual + ", ");
				ant = prox;
				prox = atual;
			}

		}
	}
}
