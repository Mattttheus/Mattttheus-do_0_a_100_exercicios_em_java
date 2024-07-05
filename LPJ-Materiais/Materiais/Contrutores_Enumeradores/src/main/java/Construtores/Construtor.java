package Construtores;

import Construtores.aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		// passando os dados atrav�s do construtor com sobrecarga
		aluno alu = new aluno();
		// calculando a m�dia
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		// definindo situa��o do aluno
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoaluno = STATUS.REPROVADO;
		} else {
			alu.situacaoaluno = STATUS.APROVADO;
		}
		
		// imprimindo situa��o do aluno
		System.out.println("A media do aluno � : " + alu.calcularMediaAluno() + " e o aluno est� " + alu.situacaoaluno);
	}
}
