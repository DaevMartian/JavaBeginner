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
public class ArgumentsExample {
    public int calc (int x, int y) {
        
        return x + y;
        
    }
    public static void main(String[] args) {
        ArgumentsExample example = new ArgumentsExample();
        System.out.println(example.calc(8, 9));
    }
}
