/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hcf;

/**
 *
 * @author pepe
 */
public class HCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f = hcf(12,8);
        System.out.println("f = "+f);
        
        
    }
    
    
    static int hcf(int n, int m)
    {
        if (m==0) return n;
        return hcf(m, n%m);
    }
}
