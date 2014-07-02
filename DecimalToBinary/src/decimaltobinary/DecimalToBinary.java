/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decimaltobinary;

import java.util.Stack;

/**
 *
 * @author pepe
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 10;
        Stack<Integer> stack = new Stack<Integer>();
        while(n>0) 
        {
            int res = n%2;
            System.out.println("residuo is "+res);
            stack.push(res);
            n = n/2;
            System.out.println("new N is "+n);
        }
        System.out.println("Your number is : ");
       
        
        while(!stack.empty())
        {
            System.out.print(stack.pop());
        }
        
        System.out.println("");
        
        
    }
    
}
