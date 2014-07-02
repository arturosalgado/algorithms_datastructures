/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prime1;

/**
 *
 * @author pepe
 */
public class Prime1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        int max = 10000;
        int i = 0;
        while( i<max)
        {
            if (isPrime(i))
            System.out.printf("::::::::::::::::::::::::::::::%d is prime  \n ",i);
            i++;
        }    
            
            
        
        
        
    }
    
    
    private static boolean isPrime(int n)
    {  
    
         if (n%2 == 0) return false;
         System.out.println("---------------------------------------------------"+n);
         for (int i = 2; i <= Math.sqrt(n); i++)
         {
            System.out.printf("i %d \n",i); 
            int remainder = (n%i);
            System.out.printf("n %d mod  i %d  = %d \n",n,i,remainder); 
            if (n % i == 0)
            return false;
         }
         return true;
    }
     private static boolean isPrime2(int n)
    {
         System.out.println("---------------------------------------------------");
         for (int i = 2; i < n; i++)
         {
            System.out.printf("i %d \n",i); 
            int remainder = (n%i);
            System.out.printf("n %d mod  i %d  = %d \n",n,i,remainder); 
            if (n % i == 0)
            return false;
         }
         return true;
    }
}
