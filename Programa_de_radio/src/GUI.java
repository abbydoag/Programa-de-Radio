import java.util.*;

public class GUI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro c = new Carro();
		boolean terminar = false, encendido = false, frequency = false;
		float current_station = (float) 87.90;
		while(!terminar){
			System.out.println("\n Radio Status ");
			System.out.println("   Radio encendida " + encendido);
			System.out.println("   Estacion actual " + current_station);
			System.out.println("   Frqcuencia " + frequency);
			System.out.println(" ");
			
            if (encendido){
                //float current_station = c.getStation(current_station);
				int opcion = 0;
				System.out.println("RADIO");
				System.out.println();
			 	System.out.println();
				System.out.println("1. Cambiar Frecuencia (AM/FM)");
				System.out.println("2. Emisora anterior");
				System.out.println("3. Siguiente emisora");
				System.out.println("4. Guardar emisora");
				System.out.println("5. Ver emisora guardada");
				System.out.println("6. Apagar Radio");
				System.out.println();
				System.out.println(" Ingrese su opción: ");
				opcion = scan.nextInt();
                
				switch(opcion){
                    case 1:
                        //cambiar frecuencia (AM o FM)
                    	frequency = c.FM_AM(frequency);
						current_station = c.getStation(current_station);

                        break;

                    case 2:
                        // Subir emisora
                    	current_station = c.Stat_ChangeB(current_station);
                        break;

                    case 3:
                        // bajar emisora 
                    	current_station = c.Stat_ChangeF(current_station);
                        break;

                    case 4:
                    	System.out.println("¿En qué espacio desea guardarlo? (1-6): ");
                    	int opcion1 = 0;
                    	opcion1 = scan.nextInt();
                    	
                        c.setSaved(opcion1);
                        System.out.println("\nSe guardó correctamente");
                        break;

                    case 5:
                    	System.out.println("¿Qué espacio desea ver? (1-6): ");
                    	int opcion2 = 0;
                    	opcion2 = scan.nextInt();
					try {
						c.setStation(opcion2);
						current_station = c.getStation(current_station);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        break;

                    default:
                        encendido=false;
                        break;
                }
            }
            else{
                int decision=0;
				System.out.println("Quiere encender el radio?");
				System.out.println("1. Si");
				System.out.println("2. No");
				System.out.println("Ingrese su decisión: ");
        		decision = scan.nextInt();
                if(decision==1){
                    encendido=true;
                    System.out.println("Se encendió el radio.");
                }
            }

        }
    }
}