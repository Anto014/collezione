package operaArte;

public class Scultura extends OperaArte {
	
	public Scultura(String titolo, String artista, double alt, double larg, double prof) {
		super(titolo, artista);
		this.altezza = alt;
		this.larghezza = larg;
		this.profondita = prof;
		// TODO Auto-generated constructor stub
	}
	private double altezza;
	private double larghezza;
	private double profondita;
	
	@Override
	public double ingombro() {
		// TODO Auto-generated method stub
		return altezza*larghezza*profondita/1000000;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o == this) {
			System.out.println("Altezza: " + altezza + "Larghezza: " +larghezza);
			return true;
		}
		
		else {
			System.out.println("Scultura non trovata");
			return false;
		}
	}
	
	@Override
	public void printingombro() {
		System.out.println("Ingombro di scultura: "+ ingombro());
		// TODO Auto-generated method stub
		
	}

}
