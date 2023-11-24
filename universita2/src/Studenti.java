public class Studenti {
	//Attributi
	private int DIM=20;
	private String nome;
	private String cognome;
	private String matricola;
	private int voto;
	private int i=0, k=0;
	private Corsi vCorsiIscritto[];
	private int vVoti[];
	
	//Costruttori
	public Studenti() {
		this.nome="Sconosciuto";
		this.cognome="Sconosciuto";
		this.matricola="Sconosciuto";
		this.voto=0;
		this.vCorsiIscritto=new Corsi[DIM];
		this.vVoti=new int[DIM];
	}
	public Studenti(String n, String c, String m) {
		this.nome=n;
		this.cognome=c;
		this.matricola=m;
		this.voto=0;
		this.vCorsiIscritto=new Corsi[DIM];
		this.vVoti=new int[DIM];
	}

	//Get/Set
	public String getMatricola() {
		return matricola;
	}
	public void setVoto(int voto) {
		//this.voto=voto;
		this.vVoti[k]=voto;
		k++;
	}
	public int[] getvVoti() {
		return vVoti;
	}
	
	//Metodi
	public void addCorsoAStud(Corsi c) {
		this.vCorsiIscritto[i]=c;
		i++;
	}
	public void StampaVoticorsi(Studenti s) {
		for(int j=0;vCorsiIscritto[j]!=null;j++) {
			System.out.println("Corso "+(j+1)+": "+this.vCorsiIscritto[j]+" voto: "+this.vVoti[j]);
		}
	}
}
