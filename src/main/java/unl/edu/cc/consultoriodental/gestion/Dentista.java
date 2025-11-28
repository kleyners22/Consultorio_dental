/*
@author Eduardo Moreno
 */
package unl.edu.cc.consultoriodental.gestion;

import unl.edu.cc.consultoriodental.administrador.Persona;

public class Dentista extends Persona {

    private String cedulaProfesional ;
    private String especialidad;

    public Dentista(String cedula, String odontologíaGeneral, String number, String maría, String gómez, String mail, String id) {
        super();
    }

    public Dentista(String cedula, String nombre, String apellido, int edad, String genero,
                    String cedulaProfesional, String especialidad) {

        super(cedula, nombre, apellido, edad, genero); // datos heredados
        this.cedulaProfesional = cedulaProfesional;
        this.especialidad = especialidad;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Métodos del UML
    public void asignarCita() {
        System.out.println("Asignando cita...");
    }

    public void registrarCita() {
        System.out.println("Registrando cita...");
    }

    public void cancelarCita() {
        System.out.println("Cancelando cita...");
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "cedulaProfesional='" + cedulaProfesional + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}