package garageServices;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface IGarageRemote {

	List<Voiture> getAllVoiture();
	List<Voiture> getVoituresByPrix(int x);
	void addVoiture(Voiture v ); 
}
