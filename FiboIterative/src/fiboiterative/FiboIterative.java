/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fiboiterative;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pepe
 */
public class FiboIterative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int n = 6;
        int r ;
        
        r = fibo(n);
        System.out.printf("fibo de %d is %d \n",n,r);
     
    }
    
    public static int fibo(int n) throws IOException
    {
        int sum = 0;
        int Zero = 0;
        int One = 1;
        System.out.printf("sum %d zero %d one %d \n ",sum,Zero,One);
        for(int i=0; i<=n; i++)
        {
            if (i==0) sum += Zero;
            if (i==1) sum += One;
            if (i>1)
            {    
                sum  = One + Zero;
                Zero = One;
                One  = sum;
                         
            }
            System.out.printf("i =  %d  \n ",i);
            System.out.printf("sum =%d ;  one = %d ;  zero = %d \n ",sum,One,Zero);
            System.in.read();
        }
      
        return sum;
    }
    
}
