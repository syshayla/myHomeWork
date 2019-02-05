/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_02.Pool;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sumaiya
 */
public class WorkerThread implements Runnable {
    private String Message;
    
    public WorkerThread(String str){
        this.Message = str;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "(Start) message = " + Message);
        processmessage();
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
