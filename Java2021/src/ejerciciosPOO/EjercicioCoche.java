package ejerciciosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCoche {
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static ArrayList<Coche> coches = new ArrayList();
	public static void main(String[] args) {
		leerCoches();
		System.out.println("\nCoches introcucidos:");
		mostrarCoches();
		mostrarPorMarca();
		mostrarPorKm();
		System.out.println("\nCoche con mayor numero de km "+mostrarMayorKm());
		System.out.println("\nCoches ordenados por km");
		mostrarOrdenadosPorKm();
	}
	private static void leerCoches() {
		String matricula, marca, modelo;
		int km;
		Coche aux;
		int i, n;
		
		do {
			System.out.println("Numero de coches? ");
			n = sc.nextInt();
		} while (n<0);
		
		for (i = 0; i < n; i++) {
			System.out.println("Coche "+i);
			System.out.print("Matricula ");
			matricula = sc.nextLine();
			System.out.println("Marca ");
			marca = sc.nextLine();
			System.out.println("Modelo ");
			modelo = sc.nextLine();
			System.out.println("Kilometros: ");
			km = sc.nextInt();
			
			aux = new Coche();
			
			aux.setMatricula(matricula);
			aux.setMarca(marca);
			aux.setModelo(modelo);
			aux.setKm(km);
			coches.add(aux);
		}
	}
    public static void mostrarCoches(){      
        for(int i = 0; i< coches.size(); i++)
            System.out.println(coches.get(i));  //se invoca el método toString de la clase Coche                  
    }
    public static void mostrarPorMarca(){
        String marca;
        System.out.print("Introduce marca: ");
        marca = sc.nextLine();
        System.out.println("Coches de la marca " + marca);
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i).getMarca().equalsIgnoreCase(marca))
                System.out.println(coches.get(i));
        }
    }
    public static void mostrarPorKm(){
        int Km;
        System.out.print("Introduce número de kilómetros: ");
        Km = sc.nextInt();
        System.out.println("Coches con menos de " + Km + " Km");
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i).getKm() < Km)
                System.out.println(coches.get(i));
        }
    }
    public static Coche mostrarMayorKm(){
        Coche mayor = coches.get(0);
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i).getKm() > mayor.getKm())
                mayor = coches.get(i);
        }
        return mayor;
    }
    public static void mostrarOrdenadosPorKm(){
        int i, j;
        Coche aux;
        for(i = 0; i < coches.size()-1; i++)
            for(j=0; j < coches.size()-i-1; j++)
                if(coches.get(j+1).getKm() < coches.get(j).getKm()){
                    aux = coches.get(j+1);
                    coches.set(j+1, coches.get(j));
                    coches.set(j, aux);                
                }
        mostrarCoches();
    }

}
