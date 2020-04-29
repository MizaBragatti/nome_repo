package cursoYaman;

/**
 * Link que me basiei:
 * https://brasilescola.uol.com.br/matematica/formula-bhaskara.htm <br>
 * <br>
 * delta = b2 � 4ac<br>
 * delta < 0, ent�o a equa��o n�o possui resultados reais;<br>
 * delta = 0, ent�o a equa��o possui apenas um resultado real ou<br>
 * possui dois resultados iguais (essas duas afirma��es s�o equivalentes);<br>
 * delta > 0, ent�o a equa��o possui dois resultados distintos reais.<br>
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
	 * Quais s�o as ra�zes reais da equa��o x2 � x = 6?<br>
	 * a) Apenas 3<br>
	 * b) 25 e 3<br>
	 * c) 25 e � 2<br>
	 * d) 3 e � 2<br>
	 * e) Apenas � 2<br>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void bhaskara(int a, int b, int c) {

		double delta = 0.0, x1 = 0.0, x2 = 0.0;

		delta = (b * b) - (4 * a * c);

		if (delta < 0)
			System.out.println("N�o possui valores reais!");
		else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("As ra�zes de " + a + "x� + " + b + "x " + c + " = 0 s�o: " + x1 + " e " + x2);
		}

	}

	public int temperaturaTempo(int tempo) {
		// T(t) = � t2 / 4 + 400

		return (tempo * 4) - 1600;
	}

}
