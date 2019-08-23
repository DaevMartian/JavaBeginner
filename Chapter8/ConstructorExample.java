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
public class ConstructorExample {
    String name;
    String surname;
    int age;
    
    public ConstructorExample(){
        name="Daev";
        surname= "Moyo";
        age= 26;
    }
        
        public void display () {
            System.out.println("The name is "+ name);
            System.out.println("The surname is "+ surname);
            System.out.println("The age is "+ age);
        }
            
            
    public static void main (String[]args){
        ConstructorExample example = new ConstructorExample();
        example.display();
    }        
        }
    
  

