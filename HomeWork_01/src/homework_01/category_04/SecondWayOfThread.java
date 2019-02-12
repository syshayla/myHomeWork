/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package category_04;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SecondWayOfThread extends Thread{
    int i = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SecondWayOfThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("thread started running..");
        while(true){
            System.out.println("Result of i : " + i++);
            if(i==10){
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new SecondWayOfThread();
        t.start();
        Thread tt = new SecondWayOfThread();
        tt.start();
        System.out.println("tt: " + tt.getName());
        
    }
    
    
}
