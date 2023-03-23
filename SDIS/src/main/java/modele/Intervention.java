/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author paul.cuquemelle
 */
public class Intervention {
    private int interId;
    private String interDate;
    private String interLieu;
    private String interHeureAppel;
    private String interHeureArrive;
    private String interDuree;
    private Situation Situation;
    public Intervention() {
    }
    
    public Intervention(int interId, String interDate, String interLieu, String interHeureAppel, String interHeureArrive, String interDuree) {
        this.interId = interId;
        this.interDate = interDate;
        this.interLieu = interLieu;
        this.interHeureAppel = interHeureAppel;
        this.interHeureArrive = interHeureArrive;
        this.interDuree = interDuree;
    }

    public Situation getSituation() {
        return Situation;
    }

    public void setSituation(Situation Situation) {
        this.Situation = Situation;
    }


    
    
    public int getInterId() {
        return interId;
    }

    public void setInterId(int interId) {
        this.interId = interId;
    }

    public String getInterDate() {
        return interDate;
    }

    public void setInterDate(String interDate) {
        this.interDate = interDate;
    }

    public String getInterLieu() {
        return interLieu;
    }

    public void setInterLieu(String interLieu) {
        this.interLieu = interLieu;
    }

    public String getInterHeureAppel() {
        return interHeureAppel;
    }

    public void setInterHeureAppel(String interHeureAppel) {
        this.interHeureAppel = interHeureAppel;
    }

    public String getInterHeureArrive() {
        return interHeureArrive;
    }

    public void setInterHeureArrive(String interHeureArrive) {
        this.interHeureArrive = interHeureArrive;
    }

    public String getInterDuree() {
        return interDuree;
    }

    public void setInterDuree(String interDuree) {
        this.interDuree = interDuree;
    }

}
