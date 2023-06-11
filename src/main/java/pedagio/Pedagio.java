package pedagio;

public class Pedagio {

	public double cobrar(Veiculo v) {
		double tarifa = 1.50;
		int eixos = v.getEixos();
		
		return eixos*tarifa;
		
	}
}
