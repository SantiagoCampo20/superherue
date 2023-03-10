/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SANTIAGO
 */
public class escudo {
    private String nom_esc;
    private int prot_esc;
    public  escudo (String nom_esc, int prot_esc){
        this.nom_esc=nom_esc;
        this.prot_esc=prot_esc;
    }
    public String getnom_esc(){
        return nom_esc;
    }
    public int getprot_esc(){
        return prot_esc;
    }
    public void setnom_esc(String nom_esc){
        this.nom_esc=nom_esc;
    }
    public void setprot_esc(int prot_esc){
        this.prot_esc=prot_esc;
    }
}
