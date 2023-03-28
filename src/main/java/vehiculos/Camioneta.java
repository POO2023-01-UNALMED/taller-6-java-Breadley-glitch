package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;
	private static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4x4",fabricante);
		this.volco =volco;
		cantidadCamionetas++;
	}
	public static int getcantidadCamionetas() {
		return cantidadCamionetas;
	}
}
