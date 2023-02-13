
import java.util.ArrayList;
import java.util.Arrays;


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
		
		SavedAM = new ArrayList<Number>(Arrays.asList(null, null, null, null, null));
		SavedFM = new ArrayList<Number>(Arrays.asList(null, null, null, null, null));
		
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
	public void setStation(int index) throws Exception {
		//System.out.println("current station " + Station);
		//System.out.println("current frequency" + Frequency);
	    index = index - 1;
	    if (index >= 0 && index <= 5) {
	        if (SavedAM.get(index) != null) {
	            if (Frequency == true) {
	                Station = SavedAM.get(index).floatValue();
	            } else {
	                Station = SavedFM.get(index).floatValue();
	            }
	        } else {
	            System.out.println("\nNo hay estación guardada");
	        }
	    } else {
	        throw new Exception("\nEl índice está fuera de rango. Ingrese un valor del 1 al 6");
	    }
	}
	
	@Override
	public void setSaved(int indexB) {
		//System.out.println("current station " + Station);
		//System.out.println("current frequency" + Frequency);
		
		indexB = indexB -1;
	    if (Frequency == true) {
	        SavedAM.set(indexB, Station);
        	System.out.println(SavedAM.get(indexB)  + "saved to SavedAM button " + (indexB + 1));

	        
	    } else {
	        SavedFM.set(indexB, Station);
        	System.out.println(SavedFM.get(indexB) + "saved to SavedAM button " + (indexB + 1));

	    }
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getStation(float _station) {
		return Station;
		// TODO Auto-generated method stub
		
	}
	
	

}
