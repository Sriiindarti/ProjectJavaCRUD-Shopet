/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopet;

/**
 *
 * @author Indri
 */
public class SHOPET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Awalan masuk ke Page Login
        
          Login log =  new Login();
          log.setVisible(true);
          log.pack();
          log.setLocationRelativeTo(null);
          log.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
    
}
