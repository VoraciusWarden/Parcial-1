package Estrategias;

import Interfaces.MetodoNotificacion;

public class SMS implements MetodoNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.printf("[SMS] Enviando mensaje de texto a %s: '%s'\n", usuario, mensaje);
        System.out.println("       > Retraso típico: Segundos (Ideal para alertas de seguridad o saldo).");
    }
}