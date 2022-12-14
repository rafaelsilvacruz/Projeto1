package primeiro.programa.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.PermitirAcesso;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAtenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.exececao.ExecaoProcessarNota;

public class Primeiro {

	private static final Aluno Aluno = null;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {

			String login = JOptionPane.showInputDialog("Informe o Login");
			String senha = JOptionPane.showInputDialog("Informe a Senha");

			if (new FuncaoAtenticacao(new Diretor(login, senha)).autenticar()) { /* */

				List<Aluno> alunos = new ArrayList<Aluno>();
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual seu Nome " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual sua Idade ?");

					Aluno aluno1 = new Aluno(null);

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
					//	disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina ? ");
					
						if (escolha ==0) {
							int continuarRemover = 0;
							int posicao = 1;
							
							
							while (continuarRemover ==0) {
								String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4?");
								System.out.println(aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao));
							}
							
						}
					

					System.out.println("Erro Aqui");
					alunos.add(aluno1);

					maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
					maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
					maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

					for (Aluno aluno : alunos) {

						if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
							maps.get(StatusAluno.APROVADO).add(aluno);
						} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
							maps.get(StatusAluno.RECUPERACAO).add(aluno);
						} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
							maps.get(StatusAluno.REPROVADO).add(aluno);
						}

					}

					System.out.println("-----------------Lista dos Aprovados ---------------------");
					for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
						System.out.println(
								" Resultado " + aluno.getAlunoAprovado2() + "com média de " + aluno.getMediaNota());
					}

					System.out.println("-----------------Lista dos Reprovados ---------------------");
					for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
						System.out.println(
								" Resultado " + aluno.getAlunoAprovado2() + "com média de " + aluno.getMediaNota());
					}

					System.out.println("-----------------Lista dos Recuperação---------------------");
					for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
						System.out.println(
								" Resultado " + aluno.getAlunoAprovado2() + "com média de " + aluno.getMediaNota());
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não Permitido");

			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace();

			System.out.println("Mesagem " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de Erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de Erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Classe de Erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro Conversão de Número " + saida.toString());

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa Null pointr" + e.getClass());

		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por Aprender Java");
		}

	}

}
