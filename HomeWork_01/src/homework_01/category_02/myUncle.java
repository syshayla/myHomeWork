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
public class myUncle implements Runnable {
    int i;

    @Override
    public void run() {
        i=0;
        while(true){
        System.out.println("Uncle: " + i++);
        if(i==50){
            break;
        }
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
        }
    }
    
    }
}
