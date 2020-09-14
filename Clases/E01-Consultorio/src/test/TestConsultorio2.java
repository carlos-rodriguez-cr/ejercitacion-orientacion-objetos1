package test;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsultorio2 {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("José", "Pérez", 1.80f, 85);
		Paciente paciente2 = new Paciente("Jorge", "Fernández", 1.60f, 90);
		Medico medico = new Medico("Daniel", "Lopez", "Dentista" );
		
		paciente1.setPeso(95);
		paciente2.setPeso(105);
		
		System.out.println("Visita 2:\n");
		System.out.println("Medico: " + medico.traerNombreCompleto());
		System.out.println("Paciente " + paciente1.traerNombreCompleto() + ": IMC " + medico.calcularImc(paciente1));
		System.out.println("Paciente " + paciente2.traerNombreCompleto() + ": IMC " + medico.calcularImc(paciente2));

	}

}
