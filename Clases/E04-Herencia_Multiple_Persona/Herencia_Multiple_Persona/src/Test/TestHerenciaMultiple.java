package Test;

import modelo.Persona;

import java.time.LocalDate;

import modelo.Empleado;



public class TestHerenciaMultiple {

	public static void main(String[] args) {
		
		Persona persona1 = new Empleado();
		
		persona1.setNombre("Carlos");
		persona1.setApellido("Rodriguez");
		persona1.setDni(39460914);
		persona1.setFechaNacimiento(LocalDate.of(1995, 12, 06));
		Empleado empleado = (Empleado)persona1;
		empleado.setLegajo(2003);
		empleado.setSueldoMensual(30000);
		
		
		
		System.out.println(persona1);
		System.out.println(empleado.cocinar());
		
		

	}

}
