/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author mac
 */
public class Employees {
   public String name1 = "FreD Smith";
   public String name2 = "Fred Smith";
   
   public void areNamesEqual(){
       if (name1.equals(name2)){
       System.out.println("Same name.");
   }   else {
           System.out.println("Deiff name.");
       }
   }
   
      public void areNamesEqual2(){
       if (name1.equalsIgnoreCase(name2)){
       System.out.println("Same name.");
   }   else {
           System.out.println("Diff name.");
       }
   }
            public void areNamesEqual3(){
       if (name1.equalsIgnoreCase(name2)){
       System.out.println("Same name.");
   }   else {
           System.out.println("Diff name.");
       }
   }
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.areNamesEqual3();
    }}


