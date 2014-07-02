/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibo;

/**
 *
 * @author pepe
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int f =  fibo(5);
       System.out.println("fibo is "+f);
    }
    
    public static int fibo(int n)
    {
        int res = 1;
        if (n==0||n==1)
        {
            System.out.println("res is "+res);
            return res;
        }
            
        else{
            System.out.println("");
            res = fibo(n-1) + fibo(n-2);
            System.out.println("res is "+res);
            return res;
        }
        
    }
    
}
