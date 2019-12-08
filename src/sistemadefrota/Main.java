/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemadefrota;

/**
 *
 * @author Jeferson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mdiFrota Meleca = new mdiFrota();
        Meleca.setExtendedState(6);
        Meleca.setVisible(true);
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Splash SPL = new Splash();
                SPL.setVisible(true);
            }
        });*/
    }

}
