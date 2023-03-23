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
public class TypeEngin {
    private int TypeCode;
    private String typeLibelle;
    private ArrayList<Engin>Engins;
    public TypeEngin() {
    }

    public TypeEngin(int TypeCode, String typeLibelle) {
        this.TypeCode = TypeCode;
        this.typeLibelle = typeLibelle;
    }

    public int getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(int TypeCode) {
        this.TypeCode = TypeCode;
    }

    public String getTypeLibelle() {
        return typeLibelle;
    }

    public void setTypeLibelle(String typeLibelle) {
        this.typeLibelle = typeLibelle;
    }

    public ArrayList<Engin> getEngins() {
        return Engins;
    }

    public void setEngins(ArrayList<Engin> Engins) {
        this.Engins = Engins;
    }
    
    
        public void addUnEngin (Engin pUnEngin){
            if (Engins == null){
                Engins = new ArrayList<Engin>();
            }
            Engins.add(pUnEngin);
             }
}
