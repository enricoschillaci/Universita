public class Studenti {
	//Attributi
	private String nome;
	private String cognome;
	private String matricola;
	private int voto;
	private int i=0;
	private Corsi vCorsiIscritto[];
	
	//Costruttori
	public Studenti() {
		this.nome="Sconosciuto";
		this.cognome="Sconosciuto";
		this.matricola="Sconosciuto";
	}
	public Studenti(String n, String c, String m) {
		this.nome=n;
		this.cognome=c;
		this.matricola=m;
	}

	//Get/Set
	public String getMatricola() {
		return matricola;
	}
	public void setVoto(int voto) {
		this.voto=voto;
	}
	
	//Metodi
	public void addCorsoAStud(Corsi c) {
		this.vCorsiIscritto[i]=c;
		i++;
	}
}
