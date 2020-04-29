package cursoYaman;

public class Exe_14_FuelCalculator {

	public static void main(String[] args) {
		System.out.println(fuelPrice(5, 1.23));
		System.out.println(fuelPrice(8, 2.5));
		System.out.println(fuelPrice(5, 5.6));
	}

	public static double fuelPrice(int litres, double pricePerLiter) {
		double discount = 0.00;

		for (int i = 1; i <= litres; i++) {
			if (i % 2 == 0)
				discount += 0.05;
		}

		if (discount > 0.25)
			discount = 0.25;

		return (litres * pricePerLiter) - (litres * discount);
	}

}
