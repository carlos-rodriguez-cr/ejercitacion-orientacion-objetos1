package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	// Agregar Getters y Setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public long getDni() {
		return dni;
	}



	public void setDni(long dni) {
		this.dni = dni;
	}



	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}



	public long calcularEdad(LocalDate fecha){
		LocalDate hoy = LocalDate.now();
		fechaNacimiento.getYear();
		long edad = ChronoUnit.YEARS.between(fechaNacimiento, hoy);
		
		
		return edad;
	}
	
	



}
