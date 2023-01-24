/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    private String iconSkill;

    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje, String iconSkill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.iconSkill = iconSkill;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getIconSkill() {
        return iconSkill;
    }

    public void setIconSkill(String iconSkill) {
        this.iconSkill = iconSkill;
    }
}
