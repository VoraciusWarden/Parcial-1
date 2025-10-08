package src.Punto1.Observer;
import src.Punto1.Interfaces.Observer;

public class CommunityManager implements Observer {
    
    @Override
    public void update(Object state) {
        System.out.println("\n[Community Manager] Recibido: " + state);
        System.out.println("   => TAREA: Debo crear publicaciones en redes sociales sobre el nuevo curso.");
    }
}