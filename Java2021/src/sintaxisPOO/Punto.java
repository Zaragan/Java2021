package sintaxisPOO;

public class Punto {
	private int x, y;

	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Punto() {
		this(0,0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Punto sumar(Punto p) {
		return new Punto(x + p.x, y + p.y);
	}
	
}
