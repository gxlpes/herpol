package herpol.visitante;

import java.time.LocalDateTime;
import herpol.pessoa.Pessoa;

public class Visitante extends Pessoa {

	public LocalDateTime dataVisita;

	public boolean liberar() {
		
		if(this.dataVisita.equals(LocalDateTime.now())) {
			return true;
		} else {
			return false;
		}
		
	}

}
