package herpol.pessoa;

public abstract class Pessoa  {

	public String matricula;
	public String cpf;
	public String nome;
	public String email;
	
	public String testando;

	public boolean findOne() {
		System.out.println("find one da super class");
		return false;
	}

	public boolean salvar() {
		System.out.println("salvar da super class " + this.cpf);
		return false;
	}

	public boolean delete() {
		System.out.println("delete da super classe");
		return false;
	}
}
