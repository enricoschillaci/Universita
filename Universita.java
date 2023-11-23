public class Universita {
	//Attributi
	private int DIM=100;
	private int i=0, k=0;
	private Studenti vStudentiIscritti[];
	private Corsi vCorsi[];
	
	//Costruttori
	public Universita() {
		this.vStudentiIscritti=new Studenti[DIM];
		this.vCorsi=new Corsi[DIM];
	}

	//Get/Set
	public Studenti[] getvStudentiIscritti() {
		return vStudentiIscritti;
	}
	public Corsi[] getvCorsi() {
		return vCorsi;
	}
	public void setvStudentiIscritti(Studenti[] vStudentiIscritti) {
		this.vStudentiIscritti=vStudentiIscritti;
	}

	//toString
	/*@Override
	public String toString() {
		return super.toString();
	}*/

	//Metodi
	public Studenti trovaStudenti(String m) {
		for(int j=0; j<i; j++) {
			if(vStudentiIscritti[j].getMatricola()==m) {
				return vStudentiIscritti[j];
			}
		}
		return null;
	}
	public Corsi trovaCors(String n) {
		for(int j=0; j<i; j++) {
			if(vCorsi[j].getNomeCorso()==n) {
				return vCorsi[j];
			}
		}
		return null;
	}
	public void addStud(Studenti s) {
		this.vStudentiIscritti[i]=s;
		i++;
	}
	public void addCorso(Corsi c) {
		this.vCorsi[i]=c;
		k++;
	}
	
}
