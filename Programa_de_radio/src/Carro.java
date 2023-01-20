
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
		
	}

	@Override
	public boolean On_off(boolean status) {
		if (ON = true) { 
			ON = false;
			return ON;		
		}
		else {
			ON = true;			
			return ON;
		}		
	}

	@Override
	public boolean FM_AM(boolean statusF) {
		if (Frequency = true) {
			Frequency = false;
			Station = (float) 87.9;
		}
		else {
			Frequency =  false;
			Station = 530;
		}
		return Frequency;
	}

	@Override
	public float setVolume(float volume) {
		_Volume = _Volume + volume;		
		return 0;
	}

	@Override
	public float getVolume(float volume) {
	
		return _Volume;
	}

	@Override
	public float Stat_ChangeB(float current_station) {
		if (Frequency == false) {
			if (Station >= 87.7) {
				Station = Station -= 0.2;
				
			}
			else {
				Station = (float) 107.7;
			}
		}
		else {
			if (Station <= 1610) {
				Station = Station += 10;
				
			}
			else {
				Station = (float) 530;
			}
		}
		
		return 0;
	}

	@Override
	public float Stat_ChangeF(float current_station) {
		if (Frequency == false) {
			if (Station <= 107.7) {
				Station = Station += 0.2;
				
			}
			else {
				Station = (float) 107.7;
			}
		}
		else {
			if (Station <= 1610) {
				Station = Station += 10;
				
			}
			else {
				Station = (float) 530;
			}
		}
		
		return 0;
	}

	@Override
	public void setStation(int current_station) throws Exception {
		Station = (float) SavedAM.get(current_station);
		return;
		
	}
	
	@Override
	public void setSaved(int indexB) {
		
		if (Frequency = true) {
			SavedAM.set(indexB, Station);
		}
		else {
			SavedFM.set(indexB, Station);

		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getStation(float _station) throws Exception {
		return Station;
		// TODO Auto-generated method stub
		
	}
	
	

}
