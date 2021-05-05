package ejerciciosPOO;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	
	public boolean prestamo() {
		if(getEjemplares() <= 0) {
			System.out.println("No quedan ejemplares");
			return false;
		} else {
			setPrestados(getPrestados()+1);
			setEjemplares(getEjemplares()-1);
			return true;
		}
	}
	
	public boolean devolucion() {
		if(getPrestados() == 0) {
			System.out.println("No puedes devolver lo que no has prestado");
			return false;
		} else {			
		setEjemplares(getEjemplares()+1);
		setPrestados(getPrestados()-1);
		return true;
		}
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
}
