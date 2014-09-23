import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
		Persona persona = new Persona("Pepito", "12345678");
		Auto auto = new Auto("AB12CD");

		FichaDeAlquiler alquiler = new FichaDeAlquiler(persona, auto);
		alquiler.setFechaDeAlquiler(new Date());
		alquiler.setFechaDeRetorno(new Date());
		alquiler.setCosto(21.50);

		System.out.println("Ficha de Alquiler");
		System.out.println(alquiler.getPersona().getNombre());
		System.out.println(alquiler.getAuto().getPlaca());
		System.out.println(alquiler.getFechaDeAlquiler());
		System.out.println(alquiler.getFechaDeRetorno());
		System.out.println(alquiler.getCosto());

	}
}
