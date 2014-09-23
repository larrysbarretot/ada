public class Escritor {
	private String nombre;
	private Libro libro;

	public Escritor(String nombre) {
		this.nombre = nombre;

		/* Por defecto escribimos este libro */
		this.libro = new Libro("El cuervo", "Senor -dije- o senora, en verdad vuestro perdon imploro");
	}

	public Escritor(String nombre, Libro libro) {
		this.nombre = nombre;
		/* Recibimos este libro como parametro */
		this.libro = libro;
	}

	public void escribirEnLibro(String contenidoNuevo) {
		/* Obtenemos el texto escrito hasta ahora en el libro */
		String contenidoActual = this.libro.getContenido();

		/* Colocamos el contenido actual concatenado con el nuevo */
		this.libro.setContenido(contenidoActual + contenidoNuevo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
}
