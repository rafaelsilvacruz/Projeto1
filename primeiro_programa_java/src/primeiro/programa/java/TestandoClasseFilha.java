package primeiro.programa.java;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClasseFilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno(null);
		aluno.setNome(" Rafael - JAVA ");
		aluno.setNomeEscola("JDEV - Treinamento");
		aluno.setIdade(36);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("4545454dsdsd545");
		diretor.setNome("Gabriel");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adminisração");
		secretario.setNumeroCpf("012.832.613-16");
		secretario.setIdade(18);
		secretario.setNome ("teste");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + "--" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salário Aluno é - " + aluno.salario());
		System.out.println("Salário Diretor é - " + diretor.salario());
		System.out.println("Salário Secretaria é - " + secretario.salario());

		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + "e o salário é de = " + pessoa.salario());
	}

}
