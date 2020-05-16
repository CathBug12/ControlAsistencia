package Model;

import java.sql.Time;
import java.util.Date;

public class model_sesion {
    int cod;
    String estado;
    Date fecha;
    Time hinicio;
    Time hfin;




    public model_sesion(String estado, Date fecha, Time hinicio, Time hfin) {
        this.estado = estado;
        this.fecha = fecha;
        this.hinicio = hinicio;
        this.hfin = hfin;
    }

    public model_sesion(int cod, String estado, Date fecha, Time hinicio, Time hfin) {
        this.cod = cod;
        this.estado = estado;
        this.fecha = fecha;
        this.hinicio = hinicio;
        this.hfin = hfin;
    }


    public model_sesion() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHinicio() {
        return hinicio;
    }

    public void setHinicio(Time hinicio) {
        this.hinicio = hinicio;
    }

    public Time getHfin() {
        return hfin;
    }

    public void setHfin(Time hfin) {
        this.hfin = hfin;
    }
}
