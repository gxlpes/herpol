package herpol;

import java.time.LocalDateTime;

import herpol.aluno.Aluno;
import herpol.professor.Professor;
import herpol.visitante.Visitante;

public class App {
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.cpf = "11408247910";
		a.nome = "Dinísio";
		a.testando = "a";
		a.matricula = "123";
		a.salvar();
		
		Professor p = new Professor();
		p.cpf = "114082400";
		p.nome = "Ronaldo";
		p.testando = "b";
		p.matricula = "345";
		p.tipoContrato = "MEI";
		p.salvar();
		
		Visitante v = new Visitante();
		System.out.println(LocalDateTime.now());
	}
}