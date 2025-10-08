package src.Punto1.Curso;

public class Curso {
    private String nombre;
    private String tema;
    private String codigo;
    public Curso(String nombre, String tema, String codigo) {
        this.nombre = nombre;
        this.tema = tema;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getTema() {
        return tema;
    }
    
    public String getCodigo() {
        return codigo;
    }
    @Override
    public String toString() {
        return "Curso [código=" + codigo + ", nombre='" + nombre + "', tema='" + tema + "']";
    }
}