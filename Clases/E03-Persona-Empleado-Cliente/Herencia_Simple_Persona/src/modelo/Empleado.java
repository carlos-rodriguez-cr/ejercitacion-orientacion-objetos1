package modelo;

import java.time.LocalDate;

public class Empleado extends Persona{
	
	private long legajo;
	private float sueldoMensual;
	
	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual){
		super(nombre, apellido, dni, fechaNacimiento);
		this.legajo=legajo;
		this.sueldoMensual=sueldoMensual;
	}
	
	// Agregar Getters y Setters
	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	

	public float calcularSueldo(int diasAusente){
		
		float sueldo =  sueldoMensual - (sueldoMensual * diasAusente) / 30;
			
		return sueldo;
		
	}
	
	
	public String hablar(){
		return "Soy un Empleado";
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [legajo=" + legajo + ", sueldoMensual=" + sueldoMensual + "]";
	}
	
	


}