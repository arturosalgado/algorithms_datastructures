/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication27;

/**
 *
 * @author pepe
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dollars = 0;
        int pesos   = 0;
        int mil = 1000;
        int diez_mil = 10*mil;
        int cien_mil = 10*diez_mil;
        int un_millon = 10*cien_mil;
        int un_billon    = 10*un_millon;
        for(int i=0; i<=cien_mil; i++)
        {
            System.out.printf(" %d pesos \n",i);
           
            System.out.printf(" %d dollars \n",dollars);
            if (i%13==0) dollars++;
        }
        
        
    }
    
    
    
    
}
