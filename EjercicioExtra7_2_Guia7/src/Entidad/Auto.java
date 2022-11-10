/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.Date;



/**
 *
 * @author pittu
 */

public class Auto {
    
    private String nombreD;
    private Date fechaVC;
    private String colorV;
    private String modeloV;
    private int kmM;

    public Auto() {
        kmM=7500;
    }

    public Auto(String nombreD, Date fechaVC, String colorV, String modeloV, int kmM) {
        this.nombreD = nombreD;
        this.fechaVC = fechaVC;
        this.colorV = colorV;
        this.modeloV = modeloV;
        this.kmM = kmM;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public Date getFechaVC() {
        return fechaVC;
    }

    public void setFechaVC(Date fechaVC) {
        this.fechaVC = fechaVC;
    }

    public String getColorV() {
        return colorV;
    }

    public void setColorV(String colorV) {
        this.colorV = colorV;
    }

    public String getModeloV() {
        return modeloV;
    }

    public void setModeloV(String modeloV) {
        this.modeloV = modeloV;
    }

    public int getKmM() {
        return kmM;
    }

    public void setKmM(int kmM) {
        this.kmM = kmM;
    }
    

}
