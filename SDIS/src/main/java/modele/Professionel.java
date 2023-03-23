/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author louna.constantinescu
 */
public class Professionel extends Pompier {
    
    private String IndiceTraitement;
    private String DateObtentionIndice; 

    public Professionel() {
        super();
    }

    public Professionel(String IndiceTraitement, String DateObtentionIndice) {
        super();
        this.IndiceTraitement = IndiceTraitement;
        this.DateObtentionIndice = DateObtentionIndice;
    }

    public String getIndiceTraitement() {
        return IndiceTraitement;
    }

    public void setIndiceTraitement(String IndiceTraitement) {
        this.IndiceTraitement = IndiceTraitement;
    }

    public String getDateObtentionIndice() {
        return DateObtentionIndice;
    }

    public void setDateObtentionIndice(String DateObtentionIndice) {
        this.DateObtentionIndice = DateObtentionIndice;
    }
    
    
}
