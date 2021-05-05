package sintaxisPOO;

public class PoligonoPrueba {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Poligono p = new Poligono();
		p.agregarPunto(new Punto());
		p.agregarPunto(new Punto(5,6));

		for(Punto punto: p.getPuntos()) {
			System.out.println(3);
		}
	}

}
