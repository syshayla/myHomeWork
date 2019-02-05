
package homework_01.category_01;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Sumaiya
 */
public class HelloRunner implements Runnable {
int i;
    @Override
    public void run() {
        i=0;
        while (true){
            System.out.println("Hello " + i++);
            if(i==0){
                break;
            }
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            Logger.getLogger(HelloRunner.class.getName()).log(Level.SEVERE, null, ex);
                        
                
            
            }
        }
                    
           
        }
        
        }

