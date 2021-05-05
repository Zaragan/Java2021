package ejerciciosPOO;

public class Fraccion {
	private int num;
	private int den;
	
	public Fraccion(int num, int den) {
		setNum(num);
		setDen(den);
	}
	public Fraccion(int num) {
		this(num,1);
	}
	public Fraccion() {
		this(0,1);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}
	
	private simplificar() {
		
	}
	private int mcd(){
	     int u = Math.abs(num);                                                                                       
	     int v = Math.abs(den);
	     if(v == 0){
	          return u;
	     }
	     int r;
	     while(v != 0){
	          r = u % v;
	          u = v;
	          v = r;
	     }
	     return u;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
