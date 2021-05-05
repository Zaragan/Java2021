package sintaxisPOO;

import java.util.ArrayList;

public class Poligono {
	private ArrayList<Punto> puntos = new ArrayList<>();
	
	public void agregarPunto(Punto punto) {
		puntos.add(punto);
	}
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}
	public ArrayList<Punto> aTexto() {
		return puntos;
	}
}
