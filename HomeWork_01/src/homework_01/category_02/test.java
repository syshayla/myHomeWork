/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_01.category_02;

/**
 *
 * @author Sumaiya
 */
public class test {
    public static void main(String[] args) {
         myUncle uncle = new myUncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("Mr. Jamil");
        uncleThread.setPriority(1);
        uncleThread.start();
        
        Shayla u = new Shayla();
        Thread myThread = new Thread(u);
        myThread.setName("Shayla");
        myThread.setPriority(10);
        myThread.start();
        
        
         System.out.println("uncleThread Name " + uncleThread.getName());
        System.out.println("urmiThread name " + myThread.getName());
        System.out.println("uncleThread Priority " + uncleThread.getPriority());
        System.out.println("urmiThread Priority " + myThread.getPriority());
    

    }
}
