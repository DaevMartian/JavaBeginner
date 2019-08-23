/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author mac
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;
//      

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;
//        
//        // Test quantity and modify message if quantity > 1.  
        if (quantity>1)
//            System.out.println(message = message + "s");    
//        
//        // Test outOfStock and notify user in either case.  
        if (outOfStock = false){
        message = "unavailable";
        System.out.println(message);}
        else 
        System.out.println(message +" " + total);
    }}

        
         
        // TODO code application logic here
   
    

