/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decimaltobinaryrecursive;

/**
 *
 * @author pepe
 */
public class DecimalToBinaryRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dec2bin(8);
        
    }
    
    
    static void dec2bin(int n)
    {
        if (n==0){ return;}
        int res = n%2;
        int div = n/2;
        dec2bin(div);
        
        System.out.printf("%d",res);
    }
    
}
