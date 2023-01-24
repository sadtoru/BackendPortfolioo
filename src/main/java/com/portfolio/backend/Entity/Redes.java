package com.portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Redes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @NotNull
    private String url;

    private String iconRed;

    public Redes() {
    }

    public Redes(String nombre, String url, String iconRed) {
        this.nombre = nombre;
        this.url = url;
        this.iconRed = iconRed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconRed() {
        return iconRed;
    }

    public void setIconRed(String iconRed) {
        this.iconRed = iconRed;
    }
}
