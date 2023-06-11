package herpol.aluno;

import herpol.pessoa.Pessoa;

public class Aluno extends Pessoa {

	public String situacaoMatricula;
	
	@Override
	public boolean salvar() {
		super.salvar();
		System.out.println("salvar aluno na base");
		return true;
	}
}
     