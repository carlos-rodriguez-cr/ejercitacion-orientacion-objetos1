package modelo;

import java.time.LocalDate;

public class Empleado extends Persona implements ICocinero, ISocio{
	private long legajo;
	private float sueldoMensual;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual){
		super(nombre, apellido, dni, fechaNacimiento);
		this.legajo=legajo;
		this.sueldoMensual=sueldoMensual;
	}
	
	

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

	public String cocinar(){
		return "Estoy cocinando";
	}
	public String pagarCuota(){
		return "Estoy Pagando la cuota";
	}
	public String hablar(){
		return "Soy un Empleado";
	}

	@Override
	public String toString() {
		return  super.toString() + "Empleado [legajo=" + legajo + ", sueldoMensual=" + sueldoMensual + "]";
	}

	
}