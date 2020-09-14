package test;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsultorio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("José", "Pérez", 1.80f, 85);
		Paciente paciente2 = new Paciente("Jorge", "Fernández", 1.60f, 90);
		Medico medico = new Medico("Daniel", "Lopez", "Dentista" );
		
		

		System.out.println("Visita 1:\n");
		System.out.println("Medico: " + medico.traerNombreCompleto());
		System.out.println("Paciente " + paciente1.traerNombreCompleto() + ": IMC " + medico.calcularImc(paciente1));
		System.out.println("Paciente " + paciente2.traerNombreCompleto() + ": IMC " + medico.calcularImc(paciente2));
		
	}
}
