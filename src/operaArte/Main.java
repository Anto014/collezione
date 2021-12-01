package operaArte;
import java.util.Scanner;

//prima modifica GIT

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int scelta;
		boolean continua = true;
		String titolo, artista;
		int alt, larg, prof;
		
		Collezione coll = new Collezione();
		
		do {
			//ciao
		
			System.out.println("Premi 1 per inserire un'opera, 2 per accedere all'opera, 3 per stampare la collezione: ");
			scelta = input.nextInt();
			
				switch(scelta) {
					
					case 1:
						//inserimento
						System.out.println("Cosa vuoi inserire? 1 - QUADRO, 2 - SCULTURA");
						scelta=input.nextInt();
						switch(scelta) {
						
							case 1:
								System.out.println("Inserisci il titolo: ");
								titolo = input.next();
								System.out.println("Inserisci l'artista");
								artista = input.next();
								System.out.println("Inserisci l'altezza");
								alt = input.nextInt();
								System.out.println("Inserisci la larghezza");
								larg = input.nextInt();
								coll.inserisciOpera(true, titolo, artista, alt, larg, 0);
							break;
							
							case 2: 
								System.out.println("Inserisci il titolo: ");
								titolo = input.next();
								System.out.println("Inserisci l'artista");
								artista = input.next();
								System.out.println("Inserisci l'altezza");
								alt = input.nextInt();
								System.out.println("Inserisci la larghezza");
								larg = input.nextInt();
								System.out.println("Inserisci la profondita'");
								prof = input.nextInt();
								coll.inserisciOpera(false, titolo, artista, alt, larg, prof);
							break;
							
							default:
								System.out.println("ERRORE");
							break;
						}
					break;
					
					case 2:
						System.out.println("Inserisci il titolo: ");
						titolo = input.next();
						System.out.println("Inserisci l'artista");
						artista = input.next();
						coll.infoOpera(titolo, artista);
					break;
					
					case 3:
					break;
					
					default:
						System.out.println("Inserisci un valore corretto");
						
					break;
				}
			
			System.out.println("Continuare? [s/altro]");
			String risposta = input.next();
			
			if(risposta.equals("s")) {
				continua = true;
			} 
				
			else { 
				continua = false;
			}	
		
		} while(continua);
		
		System.out.println("Fine");
		input.close();
		
	}

}