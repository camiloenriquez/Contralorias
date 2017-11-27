package com.example.camil.navgooglemap.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ingcamilo on 20/11/17.
 */

public class Contralorias {


    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("e_mail")
    @Expose
    private String eMail;
    @SerializedName("fax_1")
    @Expose
    private String fax1;
    @SerializedName("horario_de_atencion")
    @Expose
    private String horarioDeAtencion;
    @SerializedName("latitud")
    @Expose
    private Double latitud;
    @SerializedName("longitud")
    @Expose
    private Double longitud;
    @SerializedName("telefono_1")
    @Expose
    private String telefono1;
    @SerializedName("telefono_2")
    @Expose
    private String telefono2;
    @SerializedName("telefono_3")
    @Expose
    private String telefono3;
    @SerializedName("fax_2")
    @Expose
    private String fax2;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getFax1() {
        return fax1;
    }

    public void setFax1(String fax1) {
        this.fax1 = fax1;
    }

    public String getHorarioDeAtencion() {
        return horarioDeAtencion;
    }

    public void setHorarioDeAtencion(String horarioDeAtencion) {
        this.horarioDeAtencion = horarioDeAtencion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }


}
