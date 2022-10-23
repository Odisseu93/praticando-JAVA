package logica;
import java.util.Locale;

public class OperacoesAritmeticas {

	public static void main(String[] args) {

		/* operações básicas */
		int x = 10, y = 5;
		
		System.out.println("Dadas as variáveis: int x = 10, y = 5");
		System.out.printf("x + y = %d", x + y ); // 15
		System.out.printf("%nx - y = %d", x - y); // 5
		System.out.printf("%ny - x = %d", y-x); // 5
		System.out.printf("%nx.y = %d", x * y); // 5
		System.out.printf("%nx / y = %d", x / y); // 5
		System.out.println();
		System.out.println();
		
		double b = 6.0,
			   B = 8.0,
			   h = 5.0,
			   area;
		
		System.out.println("calculando a área de um triangulo, utulizando a formula: area = (b + B) / 2.0 * h.");
		System.out.println("Dadas as variáveis: double b = 6.0, B = 8.0, h = 5.0, area.");
		area = (b + B) / 2.0 * h;
		Locale.setDefault(Locale.US);
		System.out.printf("area = %.1f", area ); // 35.0
		
	}

}
