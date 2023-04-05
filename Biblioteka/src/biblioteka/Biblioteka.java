package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {

	private List<Knjiga> knjige;

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);

	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		if (autor==null && ISBN<=0 && naslov==null && izdavac==null)
			return knjige;

		List<Knjiga> rezultati = new ArrayList<>();

		for (Knjiga k : knjige) {
			if (k.getNaslov().toLowerCase().contains(naslov.toLowerCase().trim())) {
				rezultati.add(k);
			}
		}

		return rezultati;
	}

}
