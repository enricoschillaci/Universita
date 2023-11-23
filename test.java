
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException{
		Universita u=new Universita();
		Studenti sAppoggio;
		Corsi cAppoggio, c1;
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int scelta=0, voto=0, cfu=0;
		String nome="", cognome="", matricola="", nomeCorso="", docente="";
		boolean verifica=true;
		
		try {			
			do {
				System.out.println("Cosa si desidera fare?");
				System.out.println("1. Inserisci studente.");	//ok
				System.out.println("2. Inserisci corso universitario.");	//ok
				System.out.println("3. Iscrivi uno studente ad un corso.");	//ok
				System.out.println("4. Registra voti di uno studente ad un corso.");	//ok
				System.out.println("5. Stampa media voti di uno studente.");
				System.out.println("6. Stampa media voti di un corso.");
				System.out.println("7. Stampa carriera di uno studente (corsi + voto).");
				System.out.println("8. Stampa iscritti ad uno corso con relativo numero.");
				System.out.println("9. Carica/Salva studenti.");
				System.out.println("10. Carica/Salva corsi.");
				System.out.println("11. Esci.");
				System.out.println("Scelta: ");
				scelta=Integer.parseInt(inp.readLine());
				
				switch(scelta) {
				
					case 1:
						//Inserimento di uno studente
						System.out.println("Inserimento nuovo Studente: ");
						System.out.print("Nome studente: ");
						nome=inp.readLine();
						
						System.out.print("Cognome studente: ");
						cognome=inp.readLine();
						
						System.out.print("Matricola studente: ");
						do {
							matricola=inp.readLine();
							
							if(matricola.length()<5) {
								verifica=false;
							}
							
						}while(verifica==false);

						//Inserimento studente nel vett studenti iscritti
						Studenti s1=new Studenti(nome, cognome, matricola);
						u.addStud(s1);
						break;
						
					case 2:
						//Creazione nuovo corso
						System.out.println("Inserimento nuovo corso: ");
						
						//Inserimento dati
						System.out.print("Nome corso: ");
						nomeCorso=inp.readLine();
						
						System.out.print("Il titolare di cattedra del corso e': ");
						docente=inp.readLine();
						
						System.out.print("Il CFU del corso e' pari a: ");
						cfu=Integer.parseInt(inp.readLine());
						
						//Inizializzazione corso
						c1=new Corsi(nomeCorso, docente, cfu);
						u.addCorso(c1);
						break;
						
					case 3:
						//Iscrizione di uno studente ad un corso
						System.out.println("Inserisci la matricola dello studete da iscrivere: ");
						System.out.print("Matricola: ");
						matricola=inp.readLine();
						
						System.out.println();

						System.out.println("Inserisci il nome del corso a cui si desidera iscrivere lo studente: ");
						nomeCorso=inp.readLine();

						//Ricerca dello studente e del corso
						sAppoggio=u.trovaStudenti(matricola);
						cAppoggio=u.trovaCors(nomeCorso);
						
						cAppoggio.addStudCorso(sAppoggio);
						sAppoggio.addCorsoAStud(cAppoggio);
						break;
						
					case 4:
						//Registrazione voti studente ad un corso
						//Inserimento matricola (per capire a chi mettere il voto)
						System.out.println("Inserire matricola dello studente da valutare: ");
						matricola=inp.readLine();
						sAppoggio=u.trovaStudenti(matricola);

						//Inserimento nome corso (per capire dove mettere il voto)
						System.out.println("In quale corso si vuole aggiungere una valutazione:");
						nomeCorso=inp.readLine();
						cAppoggio=u.trovaCors(nomeCorso);

						//Inserimento voto
						System.out.println("Inserisci il voto dello studente:");
						voto=Integer.parseInt(inp.readLine());

						//Dato il voto, il 
						cAppoggio.addVoto(sAppoggio, voto);
						break;
						
					case 5:
						
						break;
						
					case 6:
						
						break;
						
					case 7:
						
						break;
						
					case 8:
						
						break;
						
					case 9:
						
						break;
						
					case 10:
						
						break;
						
					default:
						System.out.println("Scelta errata, riprova.");
						break;
						
				}
			}while(scelta!=11);
			
			if(scelta==11) {
				System.out.println("Uscita...");
				System.exit(0);
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
