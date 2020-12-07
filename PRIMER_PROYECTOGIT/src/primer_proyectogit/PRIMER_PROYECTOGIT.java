/*
PRIMER POYECTO PRUEBA SUBIDO A GIT
 */
package primer_proyectogit;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PRIMER_PROYECTOGIT {

    public static void main(String[] args) {

        System.out.println("Prueba de subir un proyecto a Github");

        for (int i = 5;i<=5 && i>=0; i--){
            System.out.println(i);
            try {
                Thread.sleep(350);
            } catch (InterruptedException ex) {
                Logger.getLogger(PRIMER_PROYECTOGIT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
