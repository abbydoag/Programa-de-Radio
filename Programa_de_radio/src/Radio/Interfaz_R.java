package Radio;

public interface Interfaz_R {
	public boolean On_off (boolean status);
	public static void Radio(String[] args) {
		System.out.println("BIENVENID@");
		System.out.println("Encender radio?  (SI/NO)");
	}
	public float setVolume (float volume);
	public float getVolume(float volume);
	
	
	public float Stat_ChangeB (float current_station);
	public float Stat_ChangeF (float current_station);
	/**
	 * Cambia las estaciones de forma manual
	 * @param current_station
	 * @throws Exception
	 */
	public void setStation(int current_station) throws Exception;
	/**
	 * Guarda la estación en la lista de estaciones guardadas
	 * @param _station
	 * @throws Exception
	 */
	public void getStation(GUI _station) throws Exception;
	/**
	 * Devuelve la estación que se pida de la lista de estaciones guardadas
	 */
}
