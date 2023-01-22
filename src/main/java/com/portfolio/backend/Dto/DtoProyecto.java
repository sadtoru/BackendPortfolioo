package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;

public class DtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    private String link;

    private String imgP;
    private String gitLink;

    public DtoProyecto() {
    }

    public DtoProyecto(String nombre, String descripcion, String link, String imgP, String gitLink) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
        this.imgP = imgP;
        this.gitLink = gitLink;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImg(String imgP) {
        this.imgP = imgP;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }
}
