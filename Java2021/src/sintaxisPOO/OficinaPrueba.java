package sintaxisPOO;

public class OficinaPrueba {

	public static void main(String[] args) {
		Oficina o = new Oficina("Bilbao");
		
		Persona p = new Persona();
		o.meter(p);
		o.meter(new Persona());
		o.getPersonas().add(new Persona("IMPOSTOR")); // Este no entra porque el clonador lo filtra
		o.getPersonas().get(0).setNombre("Cambiado por el impostor");	// 
		o.meter(new Persona("Javier", 1970, 5, 6));
		System.out.println(o.aTexto());
		for(Persona persona: o.getPersonas()) {
			System.out.println(persona.aTexto());
		}
	}

}
