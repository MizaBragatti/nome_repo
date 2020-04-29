package cursoYaman;

import cursoYaman.Exe_20_Bhaskara;

public class Aula02 {
	public static void main(String[] args) {
		
		Exe_20_Bhaskara b = new Exe_20_Bhaskara();
		
		b.bhaskara(1, -1, -6);
		b.bhaskara(1, 0, -144);
		b.bhaskara(1, 0, -1444);
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "Esferográfica";
		c1.cor = "Azul";
		c1.carga = 80;
		// c1.ponta = 0.5f;

		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Gel";
		c2.cor = "Preta";
		
		
		
	}

}
