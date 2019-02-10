/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg8.act;

import java.util.Date;

/**
 *
 * @author 1896052
 */
public class Order {
    Date date;
    String status;
    public void calcSubTotal(){
        System.out.println("SubTotal");
    }
    public void calcTax(){
        System.out.println("Tax");
    }
    public void calcTotal(){
        System.out.println("Total");
    }
    public void calcTotalWeight(){
        System.out.println("Total Weight");
    }
}
