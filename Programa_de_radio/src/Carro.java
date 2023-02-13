
import java.util.ArrayList;


public class Carro implements Interfaz_R {
	
	private boolean ON;
	private boolean Frequency;
	//True == AM 
	//False == FM
	
	private float _Volume;
	
	private  ArrayList<Number> SavedAM;
	private ArrayList<Number> SavedFM;
	
	private float Station;
	
	public Carro() {
		ON = false;
		Frequency = false;
		Station = (float) 87.9;
		
		_Volume = 0;
		
		SavedAM = new ArrayList<Number>();
		SavedFM = new ArrayList<Number>();
		
	}

	@Override
	public boolean On_off(boolean status) {
		if (ON == true) { 
			ON = false;
		}
		else {
			ON = true;			
		}	
		return ON;		

	}

	@Override
	public boolean FM_AM(boolean statusF) {
		if (Frequency == true) {
			Frequency = false;
			Station = (float) 87.9;
		}
		else {
			Frequency =  true;
			Station = 530;
		}
		return Frequency;
	}

	@Override
	public float setVolume(float volume) {
		_Volume = _Volume + volume;		
		return _Volume;
	}

	@Override
	public float getVolume(float volume) {
	
		return _Volume;
	}

	@Override
	public float Stat_ChangeB(float current_station) {
		Station = current_station;
		if (Frequency == false) {
			if (Station >= 87.7) {
				Station = Station -= 0.2;
				
			}
			else {
				Station = (float) 107.7;
			}
		}
		if (Frequency == true) {
			if (Station > 530) {
				Station = Station -= 10;
				
			}
			else {
				Station = (float) 1610;
			}
		}
		
		return Station;
	}

	@Override
	public float Stat_ChangeF(float current_station) {
		Station = current_station;
		if (Frequency == false) {
			if (Station < 107.7) {
				Station = Station += 0.2;
				
			}
			else {
				Station = (float) 87.9;
			}
		}
		if (Frequency == true){
			if (Station < 1610) {
				Station = Station += 10;
				
			}
			else {
				Station = (float) 530;
			}
		}
		
		return Station;
	}

	@Override
	public void setStation(int current_station) throws Exception {
	  if (Frequency == true) {
		  
	        if (current_station >= 0 && current_station < SavedAM.size()) {
	            Station = SavedAM.get(current_station).floatValue();
	        } else {
	            throw new Exception("Index out of range for SavedAM");
	        }
	    } else {
	        if (current_station >= 0 && current_station < SavedFM.size()) {
	            Station = SavedFM.get(current_station).floatValue();
	        } else {
	            throw new Exception("Index out of range for SavedFM");
	        }
	    }
		
	}
	
	@Override
	public void setSaved(int indexB) {
	    if (Frequency == true) {
	        SavedAM.set(indexB, Station);
	    } else {
	        SavedFM.set(indexB, Station);
	    }
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getStation(float _station) {
		return Station;
		// TODO Auto-generated method stub
		
	}
	
	

}
