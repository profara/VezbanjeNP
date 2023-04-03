package biblioteka;

import java.util.Objects;

public class Autor {
	
	private String JMBG;
	private String ime;
	private String prezime;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(String jMBG, String ime, String prezime) {
		super();
		JMBG = jMBG;
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(JMBG);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(JMBG, other.JMBG);
	}

	@Override
	public String toString() {
		return "Autor [JMBG=" + JMBG + ", ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	
	
	


}
