package logica;

import java.util.Locale; /* p */

public class ExemploSaidaDeDados {

	public static void main(String[] args) {
		
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double computerPrice = 2100.0; 
		double deskPrice = 2100.0; 
		double measure = 52.234567;
		

		System.out.printf("Products:%n" + "%s, which price is $ %.2f", product1, computerPrice);
		System.out.printf("%n%s, which price is $ %.2f", product2, deskPrice);
		System.out.printf("%n%nRecord: %d years old, code %d and gender : %c", age, code, gender);
		System.out.printf("%n%nMesure with eight decimal places: %.8f", measure); 
		System.out.printf("%nRounded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f", measure);
		
		
	}

}
