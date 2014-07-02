/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsort;

/**
 *
 * @author pepe
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] a =new int[7];
        a[0]=57;
        a[1]=48;
        a[2]=79;
        a[3]=65;
        a[4]=15;
        a[5]=33;
        a[6]=52;
        
        
        print(a);
        
        a= sort(a);
        
        print(a);
        
    }
    
    public static void print(int[] a)
    {
        System.out.println("printing...");
        for (int i= 0; i<a.length; i++)
        {
        
            System.out.print(" "+a[i]);
        
        }
        System.out.println("");
        System.out.println("printing...]");
    }
    public static int[] sort(int []a)
    {
     
        int p = 1;
        int small = 0;
        while(true)
        {
            
        }
        
        return a;
    }
    
    public static void exchange(int a[],int p, int q)
    {
        int temp = a[q];
        a[q]= a[p];
        a[p]= temp;
    }
    
}
