package pricipio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta Banciara do Rafael");

		System.out.println(bancaria);
		
		bancaria.dimui100Reais();
		bancaria.dimui100Reais(); 
		
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(500);
		System.out.println(bancaria);

		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		

	}

}
