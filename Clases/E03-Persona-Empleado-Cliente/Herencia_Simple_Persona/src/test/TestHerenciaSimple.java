package test;

import java.time.LocalDate;

import modelo.Empleado;
import modelo.Persona;
import modelo.Cliente;

public class TestHerenciaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando Objetos
		Persona persona1 = new Empleado("Carlos", "Rodriguez", 39460914, LocalDate.of(1995, 12, 6), 1, 35000);
		Empleado empleado = (Empleado)persona1; // Casteo pero llamar a la funcion calcularSueldo de la clase Empleado
		Persona persona2 = new Cliente(); //Usando constructor vacio
		
		//Encapsulamiento - Validacion
		persona2.setNombre("Matias");
		persona2.setApellido("Lezcano");
		persona2.setDni(39460914);
		persona2.setFechaNacimiento(LocalDate.of(1996, 11, 13));
		
		Cliente cliente = (Cliente)persona2;
		cliente.setCuit("20-39678123-4");
		cliente.setLimiteCredito(10000);
		
		
		
		
		System.out.println(persona1);
		System.out.println("Su edad es: " + persona1.calcularEdad(LocalDate.of(1995, 12, 6)));
		System.out.println("Sueldo neto: " + empleado.calcularSueldo(3));
		
		System.out.println("\n");
		System.out.println(persona2.toString());
		System.out.println("Su edad es: " + persona2.calcularEdad(LocalDate.of(1996, 11, 13)));
		
		

	}

}
