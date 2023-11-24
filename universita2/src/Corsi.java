public class Corsi {
	//Attributi
	private int DIM=20, i=0;
	private Studenti vStudentiCorso[];
	private String nomeCorso;
	private String docente;
	private int cfu;			//Difficolta
	
	//Costruttori
	public Corsi() {
		this.vStudentiCorso=new Studenti[DIM];
		this.nomeCorso="Sconosciuto";
		this.docente="Sconosciuto";
		this.cfu=0;
	}
	public Corsi(String n, String d, int x) {
		this.vStudentiCorso=new Studenti[DIM];
		this.nomeCorso=n;
		this.docente=d;
		this.cfu=x;
	}

	//Get/Set
	public String getNomeCorso() {
		return nomeCorso;
	}

	//Metodi
	public void addStudCorso(Studenti s) {
		this.vStudentiCorso[i]=s;
		i++;
	}
	public void addVoto(Studenti s, int v) {
		String mat=s.getMatricola();
		for(int k=0; k<i; k++) {
			if(mat==vStudentiCorso[k].getMatricola()) {
				vStudentiCorso[k].setVoto(v);
			}
		}
	}
	public void StampaIscCorsi(Corsi cAppoggio) {
		System.out.println("studenti presenti nel corso: "+cAppoggio);
		for(int j=0;vStudentiCorso[j]!=null;j++) {
			System.out.println("studente "+(j+1)+" : "+vStudentiCorso[j]);
		}
		System.out.println("per un totale di "+i+" iscritti presenti");
	}
}
