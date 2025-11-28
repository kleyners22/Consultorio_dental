/*
author Eduardo Moreno
 */
package unl.edu.cc.consultoriodental.gestion;

import unl.edu.cc.consultoriodental.administrador.Cita;
import unl.edu.cc.consultoriodental.administrador.Persona;

public class Paciente extends Persona {


    private int numPaciente;
    private Cita cita;

    public Paciente() {
        super();
    }

    public Paciente(String cedula, String nombre, String apellido, int edad, String genero,
                    int numPaciente, Cita cita) {

        super(cedula, nombre, apellido, edad, genero);  // atributos heredados
        this.numPaciente = numPaciente;
        this.cita = cita;
    }

    public int getNumPaciente() {
        return numPaciente;
    }

    public void setNumPaciente(int numPaciente) {
        this.numPaciente = numPaciente;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "numPaciente=" + numPaciente +
                ", cita=" + (cita != null ? cita.toString() : "sin cita") +
                ", cedula='" + getCedula() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", genero='" + getGenero() + '\'' +
                '}';
    }
}

