package test;
import modelo.Punto;
import modelo.Circulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p = new Punto(5,10);
		Punto p2 = new Punto(10, 20);
		Circulo c = new Circulo(new Punto(2,4), 10.5);
		
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p.equals(p));
		System.out.println(p.equals(p2));
		System.out.println(p.calcularDistancia(p2)); 
		System.out.println(c.calcularArea());
		
	}

}
