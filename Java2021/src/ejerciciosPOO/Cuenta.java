package ejerciciosPOO;

public class Cuenta {
	
	private static final String NOMBRE_POR_DEFECTO = "DESCONOCIDO";
	private static final double TIPO_POR_DEFECTO = 5;
	private static final double SALDO_POR_DEFECTO = 0;
	
	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	//	constructor con todo
	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		setNombre(nombreCliente);
		setNumeroCuenta(numeroCuenta);
		setTipoInteres(tipoInteres);
		setSaldo(saldo);
	}
	//	cunstructor por defecto
	public Cuenta() {
		setNombre(NOMBRE_POR_DEFECTO);
		setSaldo(SALDO_POR_DEFECTO);
		setTipoInteres(TIPO_POR_DEFECTO);
	}
	//	constructor copia
	public Cuenta(Cuenta cuenta) {
		this(cuenta.nombreCliente, cuenta.numeroCuenta, cuenta.saldo, cuenta.tipoInteres);
	}
	
	//		NOMBRE CLIENTE
	public String getNombre() {
		return nombreCliente;
	}
	public void setNombre(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	//		NUMERO DE CUENTA
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	//		TIPO DE INTERES
	public double getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	//		SALDO
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean ingreso(double cantidad) {
		if(cantidad < 0) {
			System.out.println("No se pueden introducir saldos negativos");
			return false;
		} else {
			double ing = getSaldo();
			double total = ing+cantidad;
			setSaldo(total);
			return true;
		}
	}
	public boolean reintegro(double cantidad) {
		if(getSaldo()<=0) {
			System.out.println("No hy saldo suficiente");
			return false;
		} else if(cantidad < 0) {
			System.out.println("No se pueden sacar cantidades negativas");
			return false;
		} else {
			double rei = getSaldo();
			double total = rei-cantidad;
			setSaldo(total);
			return true;
		}
	}
	public void transferencia(Cuenta cuenta, double cantidad) {
		if(this.getSaldo() <= 0) {
			System.out.println("no hay suficiente dinero en la cuenta origen");
		} else {
			this.setSaldo(this.getSaldo()-cantidad);
			cuenta.setSaldo(cuenta.getSaldo()+cantidad);
		}
	}
	
	
	
	
	
	
	
	
}
