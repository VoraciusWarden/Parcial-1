package Estrategias;

import Interfaces.MetodoNotificacion;

public class NotificacionEmail implements MetodoNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.printf("[EMAIL] Enviando correo a %s: '%s'\n", usuario, mensaje);
        System.out.println("       > Retraso típico: Minutos (Ideal para promociones y resúmenes).");
    }
}