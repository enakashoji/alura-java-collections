
public class Aula implements Comparable<Aula>{

	private String aula;
	private int tempo;
	
	public Aula(String aula, int tempo) {
		super();
		this.aula = aula;
		this.tempo = tempo;
	}
	
	public String getAula() {
		return aula;
	}
	
	public int getTempo() {
		return tempo;
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.getAula().compareTo(outraAula.getAula());
	}

	@Override
	public String toString() {
		return "[ -----> Aula= " + aula + ", tempo= " + tempo + " <----- ]";
	}
}
