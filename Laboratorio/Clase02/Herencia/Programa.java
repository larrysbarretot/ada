public class Programa {
	public static void main(String[] args) {

		/* Creamos un alumno y un profesor */
	/*	Alumno alumno = new Alumno("Juan Luis");
		Profesor profesor = new Profesor("Marco Aurelio"); */

		/* Los mostramos en pantalla */
	/*	System.out.println("Alumno: " + alumno.getNombres());
		System.out.println("Profesor: " + profesor.getNombres()); */

		/* Tambien es posible crear un objeto de la clase padre */
	/*	Persona unaPersona = new Persona();
		unaPersona.setNombres("Mark Twain");
		System.out.println("Una persona: " + unaPersona.getNombres()); */

		Persona persona = new Alumno();
		persona.setNombres("Juan Pablo");

		if(persona instanceof Alumno) {
			System.out.println("Se instancio como Alumno");
		}else {
			if(persona instanceof Profesor) {
				System.out.println("Se instancio como Profesor");
			}
		}
		Alumno alumno = (Alumno) persona;
		alumno.setGrado(3);

		System.out.println("Nombre (desde persona): " + persona.getNombres());
		System.out.println("Nombre (desde alumno): " + alumno.getNombres());
		System.out.println("Grado: " + alumno.getGrado());
	}
}
