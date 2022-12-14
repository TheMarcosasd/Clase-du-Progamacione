/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.paqueteA;
import com.marcos.paqueteB.*;
/**
 *
 * @author dam1
 */
public class ClaseA {
    private void amosarClaseA(){
    System.out.println("Amosamos clase A");
    }
    public void amosar(){
    ClaseB obj = new ClaseB();
    obj.amosarClaseB();
    }
    public void amosar2(){
    ClaseD obj2 = new ClaseD();
    obj2.amosarClaseD();
    }
}
