package modelo;

public class Punto {

//atributos	
	private double x;
	private double y;

//constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

//métodos getter y setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

//re-definición de métodos de la clase Object
// sobrecarga
	public boolean equals(Punto p) {
		return ((x == p.getX()) && (y == p.getY()));
	}

// re-definición
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public double calcularDistancia(Punto p) { //calcular distancia entre 2 puntos
		return Math.sqrt(Math.pow((this.x-p.getX()), 2) + Math.pow((this.y-p.getY()), 2));
	}

	
}
