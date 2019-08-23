/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mac
 */
public class ShoppingCart {
    public static void main(String[] args){
        
            String[] days = {"monday","saturday","tuesday","sunday","friday"};            
            
            // Convert the days array into an ArrayList
            
             List<String> dayList = Arrays.asList(days);           
            // Loop through the ArrayList, printing out "sunday" elements in 
            for (String s : dayList){
               if (s.equals("sunday")){
                   System.out.println(s.toUpperCase());
               }
               else System.out.println(s);
            }
            //   upper case (use toUpperCase() method of String class) 
            // Print all other days in lower case 
            // Print out the ArrayList 
            
            
            
            System.out.println(dayList);            
    }
}
