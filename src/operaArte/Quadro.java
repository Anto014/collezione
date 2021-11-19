package operaArte;

public class Quadro extends OperaArte {
	
	private double altezza;
	private double larghezza;

	public Quadro(String titolo, String artista, double alt, double larg) {
		super(titolo, artista);
		this.altezza = alt;
		this.larghezza = larg;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double ingombro() {
		// TODO Auto-generated method stub
		return altezza*larghezza/10000;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o == this) {
			System.out.println("Altezza: " + altezza + "Larghezza: " +larghezza);
			return true;
		}
		
		else {
			System.out.println("Quadro non trovato");
			return false;
		}
	}

	@Override
	public void printingombro() {
		// TODO Auto-generated method stub
		System.out.println("Ingombro di quadro: "+ ingombro());
		
	}

}
