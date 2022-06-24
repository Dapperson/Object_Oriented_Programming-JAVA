/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author Asus
 */
interface InterfaceBeraksi {
    public static final int hidup = 1;
    public static final int mati = 0;
    public static final int panas = 1;
    public static final int dingin = 0;

    public abstract void Hidupkan();

    public abstract void Matikan();

    public abstract void Panaskan();

    public abstract void Dinginkan();
}
