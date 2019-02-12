/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Category_03;

/**
 *
 * @author User
 */
public class TestThreadYield implements Runnable{
    Thread t;
    
    TestThreadYield(String str){
        t = new Thread(this, str);
        
        t.start();
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            
            if((i%5)==0){
                System.out.println(Thread.currentThread().getName() + " yielding control....");
            }
            
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
 
    }
    
}
