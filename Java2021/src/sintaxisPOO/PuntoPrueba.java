package sintaxisPOO;

public class PuntoPrueba {
	public static void main(String[] args) {
		Punto P = new Punto();
		P.setX(2);
		P.setY(1);
		
		Punto p2 = new Punto(1,2);
		System.out.println(p2.getX());
	}
}
