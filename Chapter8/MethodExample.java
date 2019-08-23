/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author mac
 */
public class MethodExample {
    public void print (){
        System.out.println("This is from a worker method");
    }
    
    public static void main (String []args){
        MethodExample example = new MethodExample();
        example.print();
        System.out.println("this fromthe caller method"); 
    }
 }
    
