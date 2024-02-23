package refactor.ref2;

/*
Tarea: Reemplazar el número mágico 86400 con una constante descriptiva.
 */
public class Timer {
    void startTimer() {
        static final int TIEMPO_ESPERA = 86400;
        // Espera 86400 segundos (24 horas)
        Thread.sleep(TIEMPO_ESPERA);
    }
}