/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariabelTipedataOperator;

/**
 *
 * @author Asus
 */
public class Bilangan {
    static int pecahan=0;
    int nilai;

    public Bilangan(int nilai){
        this.nilai=nilai;
        pecahan++;
    }

    public void info(){
        System.out.println("Nilai:"+nilai);
        System.out.println("Pecahan:"+pecahan);
        System.out.println("");
    }
}
