public interface Interfaz_R {
	public boolean On_off (boolean status);

	
	/**
	 * Cambia de frecuencia FM a AM y viceversa
	 * @param statusF
	 * @return Diferente frecuencia
	 */
	public boolean FM_AM (boolean statusF); 
	/**
	 * Obtiene el volumen actual y establece uno nuevo
	 * @param volume
	 * @returncambio de volumen
	 */
	public float setVolume (float volume);
	public float getVolume(float volume);
	
	/**
	 * Cambia emisoras hacia "atras" o "adelante" de forma manual
	 * @param current_station
	 * @return 
	 */
	public float Stat_ChangeB (float current_station);
	public float Stat_ChangeF (float current_station);
	
	/**
	 * Guarda la estación en la lista de estaciones guardadas
	 * @param current_station
	 * @throws Exception
	 */
	public void setStation(int current_station) throws Exception;
	
	/**
	 *Devuelve la estación que se pida de la lista de estaciones guardadas
	 * @param _station
	 * @throws Exception
	 */
	public float getStation(float _station) throws Exception;
	
	public void setSaved(int indexB);
	
}
