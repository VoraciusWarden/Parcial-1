package Estrategias;

import Interfaces.MetodoNotificacion;

public class NotificacionInstantanea implements MetodoNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.printf("[INSTANTANEA] Enviando notificación a %s: '%s'\\n", usuario, mensaje);
        System.out.println("       > Retraso típico: Inmediato (Ideal para mensajes urgentes).");
    }
}
