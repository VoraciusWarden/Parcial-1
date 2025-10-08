package src.Punto1.Observer;
import src.Punto1.Interfaces.Observer;

public class Periodista implements Observer {

    @Override
    public void update(Object state) {
        System.out.println("\n[Periodista] Recibido: " + state);
        System.out.println("   => TAREA: Debo redactar una **nota de prensa** sobre el nuevo curso.");
    }
    
}
