/*
@author Kleyner Buri
 */

package unl.edu.cc.consultoriodental.administrador;

import java.util.Date;

public class Cita {

    private Date fecha;
    private int hora;
    private int dia;
    private String estado;
    private int idcita;

    public Cita(){

    }

    public Cita(Date fecha, int hora, int dia, String estado, int idcita) {
        this.fecha = fecha;
        this.hora = hora;
        this.dia = dia;
        this.estado = estado;
        this.idcita = idcita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", dia=" + dia +
                ", estado='" + estado + '\'' +
                ", idcita=" + idcita +
                '}';
    }
}
