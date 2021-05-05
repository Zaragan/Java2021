package Formacion;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Recursividad {

	public static void main(String[] args) {
		System.out.println(factorial(new BigInteger("2323")));

	}
	
	private static BigInteger factorial(BigInteger numero) {
		if(numero.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return numero.multiply(factorial(numero.subtract(BigInteger.ONE)));
	}
	public static void mainDecimal(String[] args) {
		
		
		//	No es de fiar!!
		double total = 0;
		total += 5.6;
		total += 5.8;
		System.out.println(total);
		
		
		//	Usar BigDecimal para solucionar la precision
		BigDecimal db = BigDecimal.ZERO;
		db = db.add(new BigDecimal("5.6"));
		db = db.add(new BigDecimal("5.8"));
		System.out.println(db);
		
	}
}