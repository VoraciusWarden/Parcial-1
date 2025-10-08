package src.Punto1;

import src.Punto1.Sujeto.OfertaCursos; 
import src.Punto1.Curso.Curso;         
import src.Punto1.Observer.Webmaster;  
import src.Punto1.Observer.Periodista;
import src.Punto1.Observer.CommunityManager; 

public class Main {
    public static void main(String[] args) {
        System.out.println("Simulación de código.");
        OfertaCursos edco = new OfertaCursos();

        Webmaster webmaster = new Webmaster(); 
        Periodista periodista = new Periodista();
        CommunityManager cm = new CommunityManager();
        
        System.out.println("\n*** Suscripción ***");
        edco.attach(webmaster);
        edco.attach(periodista);
        edco.attach(cm);
        
        System.out.println("\n===========================================");
        System.out.println("Se agrega un nuevo curso (Cálculo Integral)");
        System.out.println("=============================================");
        
        Curso cursoCalculo = new Curso("Cálculo Integral", "Matemáticas Avanzadas", "MAT205");
        edco.agregarCurso(cursoCalculo); 

        System.out.println("\n====================================");
        System.out.println("Se retira un curso (ya no es relevante)");
        System.out.println("======================================");
        edco.retirarCurso("AI001"); 
    }
}