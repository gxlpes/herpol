package pedagio;

public class App {

	public static void main(String[] args) {
		
		Pedagio p = new Pedagio();
		
		Carro c = new Carro();
		c.setEixos(2);
		
		Caminhao ca = new Caminhao();
		ca.setEixos(6);
		
		Moto m = new Moto();
		m.setEixos(1);
		
		System.out.println(p.cobrar(c));
	}
}
