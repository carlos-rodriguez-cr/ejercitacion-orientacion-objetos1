package test;

import java.time.LocalDate;

import modelo.Empleado;
import modelo.Persona;
import modelo.Cliente;

public class TestHerenciaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Empleado("Carlos", "Rodriguez", 39460914, LocalDate.of(1995, 12, 6), 1, 35000);
		Empleado empleado = (Empleado)persona1; // Casteo pero llamar a la funcion calcularSueldo de la clase Empleado
		Persona persona2 = new Cliente("Matias", "Lezcano", 39823456, LocalDate.of(1996, 11, 13), "20-39823456-6", 10000);
		
		
		
		
		System.out.println(persona1.toString());
		System.out.println("Su edad es: " + persona1.calcularEdad(LocalDate.of(1995, 12, 6)));
		System.out.println("Sueldo neto: " + empleado.calcularSueldo(3));
		
		System.out.println("\n");
		System.out.println(persona2.toString());
		System.out.println("Su edad es: " + persona2.calcularEdad(LocalDate.of(1995, 12, 6)));
		
		

	}

}
