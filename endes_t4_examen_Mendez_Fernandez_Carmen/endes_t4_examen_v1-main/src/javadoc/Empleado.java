package javadoc;

/**
 * Clase empleado con unas propiedades comunes y unos metodos para modificarlas y utilizarlas.
 * @author Carmen
 * @version 1.0
 * @since 23-02-2024
 */
public class Empleado {
    /**
     * Atributos de la clase empleado, todos privados, nombre e id de tipo String y sueldo double
     */
    private String nombre;
    private String id;
    private double sueldo;


    /**
     * Constructor para la clase empleado, con las propiedades especificadas.
     * @param nombre :nombre del empleado
     * @param id :id del empleado
     * @param sueldo :sueldo del empleado
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }


    /**
     * Metodo para obtener el nombre del empleado
     * @return devuelve: el nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Metodo para establecer el nombre del empleado
     * @param nombre :nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Metodo para obtener la id del empleado
     * @return devuelve: la id del empleado
     */
    public String getId() {
        return id;
    }


    /**
     * Metodo para obtener el sueldo del empleado
     * @return devuelve: el sueldo del empleado
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     * Metodo para establecer el sueldo del empleado
     * @param sueldo :el sueldo del empleado
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    /**
     * Metodo para aumentar el sueldo del empleado
     * @param incremento :se actualiza el sueldo del empleado sumandole el incremento que se le pasa por parametro
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Metodo toString, para devolver una cadena de texto de tipo javadoc, que contiene los datos del empleado:
     * nombre, id y sueldo
     * @return devuelve: la cadena de texto de tipo javadoc
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
