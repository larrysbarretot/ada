import javax.swing.JOptionPane;

public class CalendarioCampeonato {

	public void formarTabla(int tabla[][], int inferior, int superior) {
		int medio;
		if(inferior == superior -1) {
			tabla[inferior][1] = superior;
			tabla[superior][1] = inferior;
		}else {
			medio = (inferior + superior) / 2;
			formarTabla(tabla, inferior, medio);
			formarTabla(tabla, medio + 1, superior);
			/*
				Las lineas de codigo comentadas estan deacuerdo a la separata,
				se las comento porque tienen un error en los argumentos numero 4 y 5.
				Si se quisiera ver el error hay que descomentarlas y comentar las siguientes dos lineas
				que corrigen el error
			 */
		//	completarTabla(tabla, inferior, medio, medio, superior - 1, medio + 1);
		//	completarTabla(tabla, medio + 1, superior, medio, superior - 1, inferior);
			completarTabla(tabla, inferior, medio, (superior - inferior + 1)/2, superior - inferior, medio + 1);
			completarTabla(tabla, medio + 1, superior, (superior - inferior +1)/2, superior - inferior, inferior);
		}
	}

	public void completarTabla(int tabla[][], int eqInferior, int eqSuperior, int diaInferior, int diaSuperior, int eqInicio) {
		for(int j = diaInferior; j <= diaSuperior; j++) {
			tabla[eqInferior][j] = eqInicio + j - diaInferior;
		}

		for(int i = eqInferior + 1; i <= eqSuperior; i++) {
			tabla[i][diaInferior] = tabla[i - 1][diaSuperior];
			for(int j = diaInferior + 1; j <= diaSuperior; j++) {
				tabla[i][j] = tabla[i - 1][j - 1];
			}
		}
	}

	public void mostrarCalendario(int tabla[][], int cantidadDeEquipos) {
		int i, j;
		System.out.println( "p: participantes" );
		System.out.println( "d: dias" );

		// dias
		System.out.print( "p\\d" );
		for(i = 1; i < cantidadDeEquipos; i++) {
			System.out.printf( "%3d ", i );
		}
		System.out.println();
		for(i = 1; i < cantidadDeEquipos + 1; i++) {
			System.out.printf( "%2d ", i );
			for(j = 1; j < cantidadDeEquipos; j++) {
				System.out.printf( "%3d ", tabla[i][j] );
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Resuelto para n = 2^k
		CalendarioCampeonato calendario = new CalendarioCampeonato();
		String cantidadDeEquipos = JOptionPane.showInputDialog( "Introduzca la cantidad de equipos a organizar (n = 2^k)" );
		int n = Integer.parseInt( cantidadDeEquipos );
		int miTabla[][] = new int[n + 1][n];
		calendario.formarTabla(miTabla, 1, n);
		System.out.println("Calendario de un campeonato");
		calendario.mostrarCalendario(miTabla, n);
	}
}
