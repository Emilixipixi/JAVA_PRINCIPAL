package krakedev.entidades;

/**
 * Clase que representa una nota (calificación) de una materia
 * Relaciona una materia con su calificación
 */
public class Nota {
    // Atributos
    private Materia materia;      // La materia a la que pertenece esta nota
    private double calificacion;  // La calificación (número entre 0 y 10)
    
    // Constructor: crea una nueva nota
    // Ejemplo: new Nota(matematicas, 9.5)
    public Nota(Materia materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }
    
    // Métodos getter y setter
    public Materia getMateria() {
        return materia;
    }
    
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    /**
     * Método mostrar: imprime la información de la nota
     * Formato: Nota[materia=nombre, calificación=valor]
     */
    public void mostrar() {
        // Imprimimos en el formato solicitado
        System.out.println("Nota[materia=" + materia.getNombre() + 
                         ", calificacion=" + calificacion + "]");
    }
}