
public class ExemplosMetodosVoid {
	public static void main(String[] args) {
		soma(54,55);
	}

	public static void saudacao(int periodo) {
		if (periodo == 1) {
			System.out.println("Bom dia");
		} else if (periodo == 2) {
			System.out.println("Boa tarde");
		} else if (periodo == 3) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Olá");
		}
		System.out.println("");
	}

	public static void dobro(int valor) {
		int resultado = valor * 2;
		System.out.println("Resultado: " + resultado);
	}

	public static void metade(int metadinha) {
		int result = metadinha / 2;
		System.out.println("result: " + result);
	}

	public static void soma(int valor, int valor2) {
		int resultado = valor + valor2;
		System.out.println("Resultado: " + resultado);
	}

	public static void tamanho(String nome ) {
		System.out.println(nome.length());
	}

}
