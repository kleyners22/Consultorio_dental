/*
@author kleyner
 */
package unl.edu.cc.consultoriodental.gestion;
import unl.edu.cc.consultoriodental.administrador.Cita;


public class AgendaCita {

    private Cita[] citas;
    private int contador;

    public AgendaCita() {
        this.citas = new Cita[100]; // tamaño fijo, sin colecciones
        this.contador = 0;
    }

    public void asignarCita(Cita cita) {
        if (cita != null && contador < citas.length) {
            citas[contador] = cita;
            contador++;
        }
    }

    public Cita[] getCitas() {
        return citas;
    }

    public Cita buscarCitaPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (citas[i].getIdcita() == id) {
                return citas[i];
            }
        }
        return null;
    }
}
