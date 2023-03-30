import edu.tecjerez.topicos.figuras.dosDimensiones.*;

public class PruebaPaquetes {

	public static void main(String[] args) {
		
		Rombo rmb = new Rombo(5, 6);
		System.out.println(rmb.obtenerArea());
		System.out.println(rmb.obtenerPerimetro());

		Circulo crc = new Circulo(1);
		System.out.println(crc.obtenerArea());
		System.out.println(crc.obtenerPerimetro());

	}

}
