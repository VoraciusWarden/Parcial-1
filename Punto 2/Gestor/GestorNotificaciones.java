package Gestor;
import Interfaces.MetodoNotificacion;

public class GestorNotificaciones {
    private MetodoNotificacion estrategia;
    private String usuario;

    public GestorNotificaciones(String usuario) {
        this.usuario = usuario;
        System.out.printf("\n--- Gestor creado para el usuario: %s ---\n", this.usuario);
    }

    // Setter para cambiar la estrategia (Permite modificar el comportamiento)
    public void setEstrategia(MetodoNotificacion estrategia) {
        this.estrategia = estrategia;
        System.out.println("Cambiando método de notificación a: " + estrategia.getClass().getSimpleName());
    }

    // Método que utiliza la estrategia
    public void notificar(String mensaje) {
        if (estrategia == null) {
            System.out.println("ERROR: No se ha configurado ninguna estrategia de notificación para este usuario.");
            return;
        }
        System.out.println("\n[Procesando Notificación] -> Mensaje: " + mensaje);
        this.estrategia.enviar(this.usuario, mensaje);
    }
}
    
