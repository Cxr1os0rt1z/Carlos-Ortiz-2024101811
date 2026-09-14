package com.unida.stalingrado43;

/**
 *
 * @author ortiz
 */
public class stalingrado {
    private String Armas;
    private String Nombre;
    private String Modelo;
    private String Balas;
    
    public stalingrado() {
        this.Armas = "nose";
        this.Nombre = "nose";
        this.Modelo = "casi se";
        this.Balas = "pimpum";
        
    }

    public stalingrado(String Armas, String Nombre, String Modelo, String Balas) {
        this.Armas = Armas;
        this.Nombre = Nombre;
        this.Modelo = Modelo;
        this.Balas = Balas;
    }

    public String getArmas() {
        return Armas;
    }

    public void setArmas(String Armas) {
        this.Armas = Armas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getBalas() {
        return Balas;
    }

    public void setBalas(String Balas) {
        this.Balas = Balas;
    }
    
    public void ArmasStaling(){
        System.out.println(" \narmas:" + Armas + " \nnombre:" + Nombre + " \nmodelo:" + Modelo + " \nbalas:" + Balas);
        
    }
    
    
}
