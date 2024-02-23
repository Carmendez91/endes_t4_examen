package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestor personal representa representa a un gestor de empleados estandar, con una lista de empleados
 * y unos metodos para trabajar sobre ellos.
 * @author Carmen
 * @version 1.0
 * @since 23-02-2024
 */
public class GestorPersonal {

    /**
     * Atributo privado de ArrayList de tipo Empleado
     */
    private List<Empleado> empleados;

    /**
     * Instancia del gestor personal y del arraylist.
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Metodo para contratar empleados, añadiendolos a la lista
     * @param empleado :empleado a contratar
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Metodo para despedir empleados, chequeando si la Id que se le pasa como parametro existe
     * @param id :la id del empleado a despedir
     * @return :se despide al empleado con la id concreta
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     * Metodo para modificar el sueldo al empleado, comprobando tambien su id y mediante un bucle for each
     * @param id :la id del empleado al que se le modificara el sueldo
     * @param nuevoSueldo :nuevo sueldo del empleado
     * @return devuelve: true si se actualizo correctamente, false en el caso contrario
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para obtener la lista de los empleados contratados
     * @return devuelve: nueva lista con los empleados en nomina
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
