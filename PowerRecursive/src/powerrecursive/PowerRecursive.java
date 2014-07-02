/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package powerrecursive;

/**
 *
 * @author pepe
 */
public class PowerRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(""+power(2,5));
    
    }
    
    public static int power(int base, int n)
    {
        if (n==0) return 1;
        if (isEven(n))
            return power(base,n/2)*power(base,n/2);
        else 
            return base*power(base,n/2)*power(base,n/2);
    }
    
    
    public static boolean isEven(int n)
    {
        return  (n%2) == 0;
        
    }
}
