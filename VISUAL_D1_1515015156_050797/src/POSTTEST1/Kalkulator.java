/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST1;

import POSTTEST1.kalkulatorSederhana;

/**
 *
 * @author REZA
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulatorSederhana().setVisible(true);
            }
        });
    }
    
}
