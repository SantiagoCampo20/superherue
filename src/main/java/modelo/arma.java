/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SANTIAGO
 */
public class arma {
    private String nom_arm;
    private int daño_arm;
    public arma (String nom_arma, int daño){
        this.nom_arm=nom_arm;
        this.daño_arm=daño_arm;
    }
    public String getnom_arm(){
        return nom_arm;
    }
    public int getdaño_arm(){
        return daño_arm;
    }
    public void setnom_arm(String nom_arm){
        this.nom_arm=nom_arm;
    }
    public void setdaño_arm(int daño_arm){
        this.daño_arm=daño_arm;
    }
}
