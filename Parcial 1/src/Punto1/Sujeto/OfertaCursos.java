package src.Punto1.Sujeto;

import src.Punto1.Interfaces.Observer;
import src.Punto1.Interfaces.Subject;
import src.Punto1.Curso.Curso;
import java.util.ArrayList;
import java.util.List;

public class OfertaCursos implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private String ultimoCambio; 

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("-> " + observer.getClass().getSimpleName() + " se ha suscrito a las actualizaciones.");
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("-> " + observer.getClass().getSimpleName() + " se ha desuscrito.");
    }

    @Override
    public void notifyObservers() {
        System.out.println("\n*** NOTIFICANDO CAMBIO a todos los suscritos... ***");
        for (Observer observer : observers) {
            observer.update(this.ultimoCambio); 
        }
        System.out.println("*** Notificación finalizada. ***");
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
        this.ultimoCambio = "NUEVO CURSO AGREGADO: " + curso.toString();
        System.out.println("\n[OFERTA] Se agregó un nuevo curso: " + curso.getNombre());
        notifyObservers();
    }

    public void retirarCurso(String codigo) {
        this.cursos.removeIf(c -> c.getCodigo().equals(codigo));
        this.ultimoCambio = "CURSO RETIRADO: Código " + codigo;
        System.out.println("\n[OFERTA] Se retiró el curso con código: " + codigo);
        notifyObservers();
    }
}