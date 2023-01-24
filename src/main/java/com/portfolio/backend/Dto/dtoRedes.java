package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;

public class dtoRedes {

    private String nombre;

    @NotBlank
    private String url;

    private String iconRed;

    public dtoRedes() {
    }

    public dtoRedes(String nombre, String url, String iconRed) {
        this.nombre = nombre;
        this.url = url;
        this.iconRed = iconRed;
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
