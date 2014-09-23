public class Persona implements ExpertoEnNatacion, ExpertoEnArtesMarciales{
	private String nombre;

	public void nadarEstiloLibre() {
		System.out.println("Nadando estilo libre");
	}

	public void nadarEstiloEspalda() {
		System.out.println("Nadando estilo espalda");
	}

	public void nadarEstiloBuceo() {
		System.out.println("Nadando estilo buceo");
	}

	public void nadarEstiloMariposa() {
		System.out.println("Nadando estilo mariposa");
	}

	public void darGolpeDePatada() {
		System.out.println("Dando golpe de patada");
	}

	public void darGolpeDeMano() {
		System.out.println("Dando golpe de mano");
	}

	public void darSaltoConPatada() {
		System.out.println("Dando salto con patada");
	}

	public void caminar() {
		System.out.println("Caminando");
	}

	public void comer() {
		System.out.println("Comiendo");
	}

	public void dormir() {
		System.out.println("Durmiendo");
	}
}
