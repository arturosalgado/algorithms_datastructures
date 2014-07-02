/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

/**
 *
 * @author pepe
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val = 5;
        
        int res = fact(val);
        System.out.println("Resut for rec  "+val+" is res "+res );
     
        
        
        int loop = cFact(val);
        
        
        System.out.println("Resut for loop "+val+" is res "+loop );
        
        
    }
    
    
    public  static int fact(int n)
    {
        if (n==0) return 1;
        else
            return n*fact(n-1);
    }
    
    
    public static int cFact(int n)
    {
        int total = 1; 
        for(int i=n; i>1;i--)
        {
            total *= i;
        }
        
        return total; 
    }
}
