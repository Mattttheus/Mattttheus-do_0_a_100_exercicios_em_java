package Construtores;

import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {

		Aluno alu = new Aluno( 8,  8,  8);
		
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situa��o do aluno
		System.out.println("A m�dia do aluno � : " + alu.calcularMediaAluno() + " e o aluno est� " + alu.situacaoAluno);
	}
}