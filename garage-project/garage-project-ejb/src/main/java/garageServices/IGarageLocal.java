package garageServices;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IGarageLocal {

	List<Voiture> getAllVoiture();
	List<Voiture> getVoituresByPrix(int c);
	void addVoiture(Voiture v ); 
}
