package files_github.src.ejerciciospoo;

public class ejercicio6tiempo {
/**
 * Ejercicio 6
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
 *
 * Tiempo t = new Tiempo(1, 20, 30)
 *
 * Donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el método toString para ver los intervalos de tiempo de la forma 10h 35m 5s.
 *
 * Si se suman por ejemplo 30m 40s y 35m 20s, el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar que la clase funciona correctamente.
 */
    private int hora;
    private int minuto;
    private int segundo;
    public void tiempo(int horas, int minutos, int segundos) {
        this.hora = horas;
        this.minuto = minutos;
        this.segundo = segundos;

    }
    public int getHora() {
        return hora;
    }
    public void setHora(int horas) {
        this.hora = horas;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minutos) {
        this.minuto = minutos;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundos) {
        this.segundo = segundos;
    }
    public void formateartiempo(int horas, int minutos, int segundos) {
        if (segundo >= 60){
        }
    }
}
