public class Auto {
	private String modelo;
	private Llanta[] llantas;

	public Auto() {
		llantas = new Llanta[4];

		for(int i = 0; i < 4; i++) {
			llantas[i] = new Llanta();
		}
	}

	public void addLlanta(int i, Llanta llanta) {
		if(i < 4) {
			llantas[i] = llanta;
		}else { 
			System.out.println("Las cuatro llantas estan puestas");
		}
	}

	public Llanta getLlanta(int i) {
		Llanta llanta = null;

		if(i < 4) {
			llanta = llantas[i];
		}else {
			System.out.println("No existe la llanta en la posicion " + i );
		}
		return llanta;
	}

	public void removeLlanta(int i) {
		if(i < 4) {
			if(i < llantas.length) {
				Llanta[] llantasAux = new Llanta[4];
				int k = 0;

				for(int j = 0; j < llantas.length; j++) {
					if(j != i) {
						llantasAux[k] = llantas[j];
						k++;
					}
				}
				llantas = llantasAux;
			}else {
				System.out.println("No existe la llanta en la posicion " + i);
			}
		}else {
			System.out.println("No existe la llanta en la posicion " + i);
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Llanta[] getLlantas() {
		return llantas;
	}

	public void setLlantas(Llanta[] llantas) {
		this.llantas = llantas;
	}
}
