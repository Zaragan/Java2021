package sintaxisPOO;

import java.util.ArrayList;

public class Oficina {
	private String nombre;
	//private Persona[] personas = new Persona[5];	//	Así sería una oficina con sitios fijos (5)
	private ArrayList<Persona> personas = new ArrayList<>();	// De este modo la oficina tiene sitios infinitos
	
	public Oficina(String nombre) {
		this.nombre = nombre;
	}
	
	public void meter (Persona persona) {
		if(persona == null) {
			throw new RuntimeException("No se admiten null");
		}
		personas.add(persona);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Persona> getPersonas() {
		return (ArrayList<Persona>) personas.clone();
	}
	
	public String aTexto() {
		return nombre;
	}
}
