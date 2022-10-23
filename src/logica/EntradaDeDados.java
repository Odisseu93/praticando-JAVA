package logica;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.printf("Dados Digitados:%n- 1º string: %s%n- 2ª string: %s%n- 3ª string: %s%n", s1, s2 ,s3);
		
		sc.close();
	}
	

}
