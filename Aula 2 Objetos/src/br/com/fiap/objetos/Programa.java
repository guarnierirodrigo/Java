package br.com.fiap.objetos;

public class Programa {
	
	//digitar main e dar control espaço
	public static void main(String[] args) {
		
		Veiculo objetinhoMoto1 = new Moto();
		Veiculo objetinhoCarro1 = new Carro();
		objetinhoCarro1.iniciar();
		objetinhoCarro1.frear();
		objetinhoCarro1.ligarParabrisa();
		System.out.println();
		objetinhoMoto1.iniciar();
		objetinhoMoto1.frear();
		objetinhoMoto1.cor = "azul";
		objetinhoMoto1.modelo = "Fiesta";
	}

}