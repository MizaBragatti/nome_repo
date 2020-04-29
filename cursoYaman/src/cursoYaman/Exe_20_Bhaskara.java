package cursoYaman;

/**
 * Link que me basiei:
 * https://brasilescola.uol.com.br/matematica/formula-bhaskara.htm <br>
 * <br>
 * delta = b2 – 4ac<br>
 * delta < 0, então a equação não possui resultados reais;<br>
 * delta = 0, então a equação possui apenas um resultado real ou<br>
 * possui dois resultados iguais (essas duas afirmações são equivalentes);<br>
 * delta > 0, então a equação possui dois resultados distintos reais.<br>
 * 
 */
public class Exe_20_Bhaskara {

	/**/
	public static void main(String[] args) {
		Exe_20_Bhaskara b = new Exe_20_Bhaskara();
		b.bhaskara(1, 12, -13);
		b.bhaskara(2, -16, -18);
		b.bhaskara(1, -1, -6);
		b.bhaskara(1, 0, b.temperaturaTempo(39));
	}

	/**
	 * Quais são as raízes reais da equação x2 – x = 6?<br>
	 * a) Apenas 3<br>
	 * b) 25 e 3<br>
	 * c) 25 e – 2<br>
	 * d) 3 e – 2<br>
	 * e) Apenas – 2<br>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void bhaskara(int a, int b, int c) {

		double delta = 0.0, x1 = 0.0, x2 = 0.0;

		delta = (b * b) - (4 * a * c);

		if (delta < 0)
			System.out.println("Não possui valores reais!");
		else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("As raízes de " + a + "x² + " + b + "x " + c + " = 0 são: " + x1 + " e " + x2);
		}

	}

	public int temperaturaTempo(int tempo) {
		// T(t) = – t2 / 4 + 400

		return (tempo * 4) - 1600;
	}

}
