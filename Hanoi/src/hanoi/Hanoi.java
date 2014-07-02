/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hanoi;

/**
 *
 * @author pepe
 */
public class Hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hanoi(2,'A','B','T');
    }
    
    static void hanoi(int n, char start, char end, char temp)
    {
        if (n>0)
        {
            hanoi(n-1,start,temp,end);
            System.out.printf("move disk from %c to %c",start,end);
            System.out.println("");
            hanoi(n-1,temp,end,start);
        }
    }
}
