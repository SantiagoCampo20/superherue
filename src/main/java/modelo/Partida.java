/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SANTIAGO
 */
public class Partida {
    private int val_resultado;
    private superheroe Atacante;
    private superheroe victima;
    private escudo Escudo;
    private arma Arma;
    public Partida(int val_resultado, superheroe Atacante, superheroe victima, escudo Escudo, arma Arma){
        this.val_resultado=val_resultado;
        this.Atacante=Atacante;
        this.victima=victima;
        this.Escudo=Escudo;
        this.Arma=Arma;
    }
    public int getval_resultado(){
        return val_resultado;
    }
    public superheroe gatAtacante(){
        return Atacante;
    }
    public superheroe getvictima(){
        return victima;
    }
    public escudo getEscudo(){
        return Escudo;
    }
    public arma getArma(){
        return Arma;
    }
}
