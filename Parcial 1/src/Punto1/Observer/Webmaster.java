package src.Punto1.Observer;

import src.Punto1.Interfaces.Observer;

public class Webmaster implements Observer {
    @Override
    public void update(Object state) {
        System.out.println("\n[Webmaster] Recibido: " + state);
        System.out.println("   => TAREA: Debo ingresar al sistema para **actualizar el sitio web**.");
    }
}
