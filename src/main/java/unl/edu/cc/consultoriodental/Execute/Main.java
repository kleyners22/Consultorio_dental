package unl.edu.cc.consultoriodental.Execute;

import unl.edu.cc.consultoriodental.administrador.Cita;
import unl.edu.cc.consultoriodental.gestion.Paciente;
import unl.edu.cc.consultoriodental.gestion.Dentista;
import unl.edu.cc.consultoriodental.gestion.AgendaCita;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Cita cita1 = new Cita(
                new Date(),   // fecha actual
                10,           // hora
                15,           // dia
                "Pendiente",
                1             // id cita
        );

        // CREAR PACIENTE CON CITA
        Paciente paciente1 = new Paciente(
                "0102030405",
                "Juan",
                "Perez",
                30,
                "Masculino",
                1001,
                cita1
        );

        // CREAR DENTISTA
        Dentista dentista1 = new Dentista(
                "12345-ABC",
                "Ortodoncia",
                "1",
                "Maria",
                "Lopez",
                "maria@correo.com",
                "0999999999"
        );

        // CREAR AGENDA Y ASIGNAR CITA
        AgendaCita agenda = new AgendaCita();
        agenda.asignarCita(cita1);

        // IMPRIMIR TODO
        System.out.println("Información de la CITA:");
        System.out.println(cita1);

        System.out.println("\nInformación del PACIENTE:");
        System.out.println(paciente1);

        System.out.println("\nInformación del DENTISTA:");
        System.out.println(dentista1);

        System.out.println("\nCitas en la agenda del consultorio:");
        for (Cita c : agenda.getCitas()) {
            System.out.println(c);
        }
    }
}
