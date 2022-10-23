package logica;

public class AlgumasFuncoesParaStrings {

	public static void main(String[] args) {

		String nome = "Ulisses Silvério";
		
		System.out.println(nome);
		System.out.println("toUpperCase: "+ nome.toUpperCase());
		System.out.println("toLowerCase: "+ nome.toLowerCase());
		System.out.println("trim: "+ nome.trim());
		System.out.println("substring(2): "+ nome.substring(2));
		System.out.println("substring(2,5): "+ nome.substring(2,5));
		System.out.println("replace('s','x'): "+ nome.replace('s','x'));
		
	}

}
