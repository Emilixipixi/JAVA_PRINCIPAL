package krakedev.entidades;

/**
 * Clase que representa una materia del curso
 * Es la clase más simple, solo guarda información básica
 */
public class Materia {
    // Atributos (características de la materia)
    private String codigo;  // Ejemplo: "COD1", "COD2"
    private String nombre;  // Ejemplo: "Matemáticas", "Lenguaje"
    
    // Constructor: se ejecuta cuando creamos una nueva materia
    // Ejemplo: new Materia("COD1", "Sociales")
    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    // Métodos getter: permiten obtener los valores de los atributos
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    // Métodos setter: permiten modificar los valores de los atributos
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}