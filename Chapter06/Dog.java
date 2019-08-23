/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;

/**
 *
 * @author mac
 */
public class Dog {
    public String name;
    public int age;
    
    public void bark() {
        System.out.println("bark");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.age = 20;
        System.out.println(dog.age);
    }
    
    
    
}
