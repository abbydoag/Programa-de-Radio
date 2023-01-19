package Radio;

public interface Interfaz_R {
	public boolean On_off (boolean status);
	public static void Radio(String[] args) {
		System.out.println("BIENVENID@");
		System.out.println("Encender radio?  (SI/NO)");
	}
	public float getVolume(float volume);
	
	public float Stat_ChangeB (float current_station);
	public float Stat_ChangeF (float current_station);
	
	public void setStation() throws Exception;
}
