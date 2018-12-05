package com.carshopwebapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //map this class to the database
public class Owner {

    @Id
    private int id;
    //@Column  if the private name was different from the ones of our db
    private String afm;
    private String onoma;
    private String epitheto;
    private String dieuthinsi;
    private String email;
    private String kwdikoXristi;
    private String markaOximatos;
    private String pinakidaOximatos;
    private String tipoXristi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public String getDieuthinsi() {
        return dieuthinsi;
    }

    public void setDieuthinsi(String dieuthinsi) {
        this.dieuthinsi = dieuthinsi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKwdikoXristi() {
        return kwdikoXristi;
    }

    public void setKwdikoXristi(String kwdikoXristi) {
        this.kwdikoXristi = kwdikoXristi;
    }

    public String getMarkaOximatos() {
        return markaOximatos;
    }

    public void setMarkaOximatos(String markaOximatos) {
        this.markaOximatos = markaOximatos;
    }

    public String getPinakidaOximatos() {
        return pinakidaOximatos;
    }

    public void setPinakidaOximatos(String pinakidaOximatos) {
        this.pinakidaOximatos = pinakidaOximatos;
    }

    public String getTipoXristi() {
        return tipoXristi;
    }

    public void setTipoXristi(String tipXristi) {
        this.tipoXristi = tipXristi;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", afm='" + afm + '\'' +
                ", onoma='" + onoma + '\'' +
                ", epitheto='" + epitheto + '\'' +
                ", dieuthinsi='" + dieuthinsi + '\'' +
                ", email='" + email + '\'' +
                ", kwdikoXristi='" + kwdikoXristi + '\'' +
                ", markaOximatos='" + markaOximatos + '\'' +
                ", pinakidaOximatos='" + pinakidaOximatos + '\'' +
                ", tipXristi='" + tipoXristi + '\'' +
                '}';
    }
}