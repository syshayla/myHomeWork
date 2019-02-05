/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_02.Pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author Sumaiya
 */
public class testThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(15);
        for (int i = 0; i < 30; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
            
            
        }
        executor.shutdown();
        while (!executor.isTerminated()) {            
            
        }
        System.out.println("Finished all threads");
    }
}
