package modelo;

public class Circulo {
	private Punto origen;
	private double radio;
	
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(Punto radio) {
		this.radio = origen.calcularDistancia(radio);
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double calcularArea() {
		return Math.PI * (radio * radio);
	}
	
	public double calcularDistancia(Circulo c) {
		double calculo = (((c.origen.getX() - origen.getX()) * (c.origen.getX() - origen.getX()))
				+ ((c.origen.getY() - origen.getY()) * (c.origen.getY() - origen.getY())));
		return Math.sqrt(calculo);
	}
	
	public boolean equals(Circulo c) {
		return ((origen.getX() == c.origen.getX()) && (origen.getY() == c.origen.getY()));
	}
	
	
	
	
	
	
}
