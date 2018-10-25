package entitites.calculo;

import entitites.Aluno;
import entitites.Pessoa;

public class Calculo {
	
	Aluno aluno = new Aluno();
	Pessoa pessoa = new Pessoa();
	
	public double DC7() {
		return ((aluno.getSubscapular() + aluno.getTricipital()
		+ aluno.getToraxica() + aluno.getAxmedia()
		+ aluno.getSuiliaca() + aluno.getAbdomen()
		+ ((aluno.getCoxdireita() + aluno.getCoxesquerda())/2)) * 0.001);
	}
	
	public double densidadeCorporalMulher() {
		return 1.097 - (0.00046971 * DC7()) + (0.00000056 * Math.sqrt(DC7())) - (0.00012828 * pessoa.getIdade());
	}
	
	public double densidadeCorporalHomem() {
		return 1.1120 - (0.00043499 * DC7()) + (0.00000055 * Math.sqrt(DC7())) - (0.00028826 * pessoa.getIdade());
	}
	
	public double porcentagemGorduraMulher() {
		return (495 - densidadeCorporalMulher()) - 495;
	}
}
