/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccirecursive;

/**
 *
 * @author pepe
 */
public class FibonacciRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 6;
        
        for(int i = 0 ; i<=n;i++){
        int f = fibo(i);
        System.out.printf("fibo de %d is %d \n",i,f);
        }
        
    }
    
    
    public static int fibo(int n)
    {
        if (n==0) return 0;
        if (n==1) return 1;
        
        return fibo(n-2)+fibo(n-1);
    }
}
