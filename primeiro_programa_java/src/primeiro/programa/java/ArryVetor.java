package primeiro.programa.java;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArryVetor {

	/* Usado Para Executar código */
	public static void main(String[] args) {
		
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogicas = {7.8, 7.7, 8.4, 9.5};
		
		Aluno aluno = new Aluno(null);
		aluno.setNome("Rafael da Silva Cruz");
		aluno.setNomeEscola("Treinamentos JAVA");
		
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina ("Curso de Java");
		disciplina.setNota(notas);
		
		
		aluno.getDisciplinas().add(disciplina);
		
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina ("Curso de HTML");
		disciplina2.setNota(notasLogicas);
		
		aluno.getDisciplinas().add(disciplina2);
		

		//----------------------------------------------------
		
		
		
		
			
		
		
	
			
		}
		
	}


