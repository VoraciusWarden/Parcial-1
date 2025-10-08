import Gestor.GestorNotificaciones;
import Estrategias.NotificacionEmail;
import Estrategias.NotificacionInstantanea;
import Estrategias.SMS;
import Interfaces.MetodoNotificacion;

public class Punto2 {
    public static void main(String[] args) {
        System.out.println("--- DEMOSTRACIÓN DEL PATRÓN STRATEGY EN BANCA DIGITAL ---");

        // 1. Crear las estrategias disponibles
        MetodoNotificacion instantanea = new NotificacionInstantanea();
        MetodoNotificacion email = new NotificacionEmail();
        MetodoNotificacion sms = new SMS();

        // 2. Simulación de Usuarios con distintas preferencias

        // --- Usuario A: Prefiere inmediatez para transacciones ---
        GestorNotificaciones usuarioA = new GestorNotificaciones("AndreaMahecha@mail.com");
        usuarioA.setEstrategia(instantanea);
        usuarioA.notificar("Transacción de $500.000 completada.");

        // --- Usuario B: Prefiere SMS para alertas de seguridad ---
        GestorNotificaciones usuarioB = new GestorNotificaciones("nicolashvega@gmail.com");
        usuarioB.setEstrategia(sms);
        usuarioB.notificar("¡ALERTA! Inicio de sesión desde un nuevo dispositivo.");

        // --- CAMBIO DE ESTRATEGIA EN TIEMPO DE EJECUCIÓN ---
        
        System.out.println("\n=======================================================");
        System.out.println("APLICANDO ESTRATEGIA DE CAMPAÑA DE MARKETING (EMAIL)");
        System.out.println("=======================================================");
        
        // El mismo Usuario A ahora recibe una notificación de promoción por Email
        usuarioA.setEstrategia(email);
        usuarioA.notificar("¡Aprovecha nuestra nueva oferta de CDT con 10% de interés!");
        
        // El Usuario B cambia su preferencia de notificación a EMAIL para el resumen semanal
        usuarioB.setEstrategia(email);
        usuarioB.notificar("Resumen de movimientos semanales: Saldo actual $1.250.000");
    }
}