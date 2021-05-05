package ejerciciosPOO;

public class Contador {
	private int cont;
	
	public Contador() {
		
	}
	public Contador(int n) {
		if(n < 0) {
			setCont(0);
		}
		setCont(n);
	}
	public Contador(Contador contador) {
		this(contador.cont);
	}
		
	//			GETTER Y SETTER
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	//			METODOS
	public void incrementar() {
		setCont(getCont()+1);
	}
	public void decrementar() {
		setCont(getCont() - 1);			
		if (getCont() < 0) {
			setCont(0);
		}
	}
}
