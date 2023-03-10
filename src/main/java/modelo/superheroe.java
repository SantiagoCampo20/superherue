/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SANTIAGO
 */

public class superheroe {
        private String nom_heroe;
        private int salud;
        public superheroe(String nom_heroe, int salud){
            this.nom_heroe= nom_heroe;
            this.salud=salud;
        }
        public superheroe(){}
    public String getnom_heroe(){
        return nom_heroe;
    }
    public int getsalud(){
        return salud;
    }
    public void setnom_heroe(String nom_heroe){
        this.nom_heroe=nom_heroe;
    }
    public void setsalud(int salud){
        this.salud=salud;
    }
}
