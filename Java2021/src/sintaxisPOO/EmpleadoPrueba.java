package sintaxisPOO;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.setNombre("Javier");
		System.out.println(e);
		e.setFechaNacimiento(2011,02,04);
		System.out.println(e);
		Oficina o = new Oficina("Bilbao");
		o.meter(e);
		
		for (Persona p: o.getPersonas()) {
			System.out.println(p);
		}
	}

}
