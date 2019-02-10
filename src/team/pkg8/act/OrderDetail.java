/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg8.act;

/**
 *
 * @author temp
 */
public class OrderDetail {
    int quantity;
    String taxStatus;
    
    public void calcSubTotal(){
        System.out.println("SubTotal");
    }
    
    public void calcWeight(){
        System.out.println("Weight");
    }
    
    public void calcTax(){
        System.out.println("calculation of Tax");
    }
}
