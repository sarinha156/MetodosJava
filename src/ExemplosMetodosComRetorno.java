
public class ExemplosMetodosComRetorno {

	public static int cubo(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
		int resultado = cubo(3);
		System.out.println(resultado);

		String resultado2 = concatenar("sarah", "cristina");
		System.out.println(resultado2);

		int resultado3 = sinal(1);
		System.out.println(resultado3);
		
		boolean resultado4 = ehDiaSemana("Sabado");
		System.out.println(resultado4);
		
		boolean resultado5 = horaBanco(17);
		System.out.println(resultado5);
		
		boolean resultado6 = possoIrBanco("segunda" , 16);
		System.out.println(resultado6);

	}

	public static String concatenar(String v1, String v2) {
		return v1 + " " + v2;
	}

	public static int sinal(int num) {
		if (num > 0) {
			return 1;
		} else if (num < 0) {
			return 2;
		} else {
			return 0;
		}
	}

	public static boolean ehDiaSemana(String diasemana) {
		if (diasemana.equalsIgnoreCase("sabado") || diasemana.equalsIgnoreCase("domingo")) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean horaBanco(int hora) {
		if (hora == 10 || hora == 16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*public static boolean ehDiaSemanaHora(String diasemanahora , int hora) {
		if (diasemanahora.equalsIgnoreCase("sabado") && hora == 10 || hora == 16 || diasemanahora.equalsIgnoreCase("domingo") && hora == 10 || hora == 16) {
			return false;
		}
		if else (diasemanahora == false) {
			return true;
		}
	}*/
	
	public static boolean possoIrBanco(String dia , int hora) {
		boolean diaSemana = ehDiaSemana(dia);
		if(diaSemana == false) {
			return false;
		}
		else if(hora >=10 && hora <=16) {
			return true;
		}
		else {
			return false;
		}
		
	}


}
