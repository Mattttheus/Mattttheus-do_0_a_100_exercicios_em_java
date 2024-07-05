/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtores;

public class aluno {

private double nota01='5';
private double nota02 ='5';
private double nota03= '5';
private double nota04='5';
STATUS situacaoaluno;

    public aluno(double nota1, double nota2, double nota3 ,double nota04){
		super();
		this.nota01 = nota01;
		this.nota02= nota02;
		this.nota03 = nota03;
                this.nota04 = nota04;
	}

    aluno() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

	
	public enum STATUS {
		 APROVADO,
	     REPROVADO
	}


	public double calcularMediaAluno() {
		double mediaAluno = 0;
		// c�lculo da media
		mediaAluno = (this.nota01 + this.nota02 + this.nota03 +this.nota04)/4;
		return mediaAluno;
	}
}
