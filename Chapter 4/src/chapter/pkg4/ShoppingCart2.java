/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg4;

/**
 *
 * @author mac
 */
public class ShoppingCart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custName = "Daev";
        String itemDesc = "shirt";
        
        String message;
        message = custName+" wants to buy a "+itemDesc;
        
        double price = 15.50;
        int quantity = 2;
        double tax = 0.15*100;
        double total;
       
        System.out.println(message);
        
        total = quantity * price + tax;
        
        System.out.println(total);        
        // TODO code application logic here
    }
    
}
