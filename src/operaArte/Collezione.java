package operaArte;
import java.util.*;

public class Collezione {

	private String nome;
	private String luogo;
	private ArrayList <OperaArte> opere= new ArrayList <OperaArte>();
	
	public void inserisciOpera(boolean quadro, String titolo, String nome, double alt, double larg, double prof) {
		
		OperaArte op;
		//try {
			if (quadro) {
				op = new Quadro(titolo, nome, alt, larg);
				System.out.println("Quadro inserito correttamente");
				opere.add(op);
			}
			
			else {
				op = new Scultura(titolo, nome, alt, larg, prof);
				System.out.println("Scultura inserita correttamente");
				opere.add(op);
			}
//		}
//		catch (Exception e){
//			System.out.println("Errore nell'inserimento dell'opera");
//		}
	}
	
	public void infoOpera(String titolo, String nome) {
		//una singola opera (equals)
		//for (int i=0; i<opere.size(); i++) {}
		
		for (OperaArte opera : opere) {
			if(opera.titolo == titolo && opera.artista == nome) {
				System.out.println("Trovato");
			}
			//if(opera.equals(opere)) {}
		}
	}
	
	public String toString() { //tutta la collezione
		
		return " ";
	}
	
}
