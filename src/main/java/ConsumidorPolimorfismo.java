import herpol.aluno.Aluno;
import herpol.professor.Professor;

public class ConsumidorPolimorfismo {

	public static void main(String[] args) {

		Testadora t = new Testadora();

		Aluno a = new Aluno();
		a.cpf = "123";

		t.processar(a);

		Professor p = new Professor();
		p.cpf = "333";
		t.processar(p);

	}
}
