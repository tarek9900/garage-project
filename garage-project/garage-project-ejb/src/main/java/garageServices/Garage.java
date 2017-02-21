package garageServices;

import java.util.ArrayList;
import java.util.List;

public class Garage implements IGarageLocal,IGarageRemote{

	List<Voiture>list=new ArrayList<Voiture>();
	
	

	@Override
	public List<Voiture> getAllVoiture() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public List<Voiture> getVoituresByPrix(int x) {
		List<Voiture> cars = new ArrayList<Voiture>();
		for(Voiture d:cars){
		    if(d.getPrix()== x){
		        cars.add(d);
		    }
		}
		return cars;
	
	}

	@Override
	public void addVoiture(Voiture v) {
		// TODO Auto-generated method stub
		list.add(v) ; 
	}


}

