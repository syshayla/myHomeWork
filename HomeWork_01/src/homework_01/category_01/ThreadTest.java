/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_01.category_01;

/**
 *
 * @author Sumaiya
 */
public class ThreadTest {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        
        Thread t1 = new Thread(r);
        t1.setPriority(1);
        t1.start();
        
        
        Thread t2 = new Thread(r);
        t2.start();
        
        System.out.println("t1 priority " + t1.getPriority());
        System.out.println("t2 priority " + t2.getPriority());
        System.out.println("t1 Name " + t1.getName());
        System.out.println("t2 Name " + t1.getName());
    }
    
}
