package operaArte;

public abstract class OperaArte {
	
	protected String titolo;
	protected String artista;

	
	
	public OperaArte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}

	public abstract double ingombro();
	
	public abstract boolean equals(Object o);
	
	public abstract void printingombro();
}
