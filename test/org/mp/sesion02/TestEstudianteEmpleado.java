package org.mp.sesion02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
public class TestEstudianteEmpleado {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Estudiante estudiante1 = new Estudiante("Francisco Rojas Alba",
				"Avd. Estaci�n 5", "950224567", "frojas@gmail.com", 1);
		Estudiante estudiante2 = new Estudiante("Carmen Fernandez Martin",
				"C. Per� 9", "9504134157", "cfermar@ual.es", 2);
		Estudiante estudiante3 = new Estudiante("Maria Gonzalez Segura",
				"Avd. Cabo de Gata 26 4� 1", "950234788", "mariags@gmail.com",
				3);
		Profesor profesor1 = new Profesor("Antonio Lopez Gimenez",
				"C. Tirso de Molina 6", "950014678", "alopez@ual.es",
				"CITE II 224", 1500, new GregorianCalendar(2001, 0, 15),
				"Lunes y jueves de 10 a 12", 1);
		Profesor profesor2 = new Profesor("Angeles Abad Martinez",
				"C. Cervantes 32", "950018987", "abad@ual.es", "CITE III 127",
				1800, new GregorianCalendar(1998, 3, 25), "Lunes 10 a 15", 2);
		Profesor profesor3 = new Profesor("Jose Garcia Perales",
				"C. Jacinto 12", "950019060", "jgarcia@ual.es", "CITE I 221",
				2100, new GregorianCalendar(1995, 9, 1), "Viernes 10 a 15", 3);
		Administrativo administrativo = new Administrativo(
				"Sergio Morales Parra", "Avd. Pablo Iglesias 78", "950017080",
				"smorales@ual.es", "Edificio Central 123", 1700,
				new GregorianCalendar(1990, 7, 23), "Becas");
		String cadenaEstudiante1 = "Estudiante de Grado\n"
				+ "Nombre = Francisco Rojas Alba, Direccion = Avd. Estaci�n 5, Tel�fono = 950224567, email = frojas@gmail.com";
		String cadenaEstudiante2 = "Estudiante de Master\n"
				+ "Nombre = Carmen Fernandez Martin, Direccion = C. Per� 9, Tel�fono = 9504134157, email = cfermar@ual.es";
		String cadenaEstudiante3 = "Estudiante de Doctorado\n"
				+ "Nombre = Maria Gonzalez Segura, Direccion = Avd. Cabo de Gata 26 4� 1, Tel�fono = 950234788, email = mariags@gmail.com";
		String cadenaProfesor1 = "Profesor Ayudante\n"
				+ "Nombre = Antonio Lopez Gimenez, Direccion = C. Tirso de Molina 6, Tel�fono = 950014678, email = alopez@ual.es\n"
				+ "Despacho = CITE II 224, salario = 1500, Fecha de contrataci�n = 15/1/2001\n"
				+ "Horario = Lunes y jueves de 10 a 12";
		String cadenaProfesor2 = "Profesor Titular de Universidad\n"
				+ "Nombre = Angeles Abad Martinez, Direccion = C. Cervantes 32, Tel�fono = 950018987, email = abad@ual.es\n"
				+ "Despacho = CITE III 127, salario = 1800, Fecha de contrataci�n = 25/4/1998\n"
				+ "Horario = Lunes 10 a 15";
		String cadenaProfesor3 = "Profesor Catedr�tico de Universidad\n"
				+ "Nombre = Jose Garcia Perales, Direccion = C. Jacinto 12, Tel�fono = 950019060, email = jgarcia@ual.es\n"
				+ "Despacho = CITE I 221, salario = 2100, Fecha de contrataci�n = 1/10/1995\n"
				+ "Horario = Viernes 10 a 15";
		String cadenaAdministrativo = "Administrativo\n"
				+ "Nombre = Sergio Morales Parra, Direccion = Avd. Pablo Iglesias 78, Tel�fono = 950017080, email = smorales@ual.es\n"
				+ "Despacho = Edificio Central 123, salario = 1700, Fecha de contrataci�n = 23/8/1990\n"
				+ "Destinado en la unidad Becas";
		
			
		
		assertEquals(estudiante1.toString(), cadenaEstudiante1);
		assertEquals(estudiante2.toString(), cadenaEstudiante2);
		assertEquals(estudiante3.toString(), cadenaEstudiante3);
		assertEquals(profesor1.toString(), cadenaProfesor1);
		assertEquals(profesor2.toString(), cadenaProfesor2);
		assertEquals(profesor3.toString(), cadenaProfesor3);
		assertEquals(administrativo.toString(), cadenaAdministrativo);
		
		
		

	}

}
