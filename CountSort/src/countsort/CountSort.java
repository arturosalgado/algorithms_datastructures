/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countsort;

/**
 *
 * @author pepe
 */
public class CountSort {

    
    final boolean debug = true;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[] = {5,4,3,9,2,5,2,2};
        countSort(a);
        
    }
    
    static void countSort(int []a)
    {
        System.out.println("Original array");
        print(a);
        int maxNumber = 10;
        int occurrences[] =  new int[maxNumber+1];
        for(int t = 0; t<maxNumber; t++)
        {
            occurrences[t]=0;
        }
        print(occurrences);
        for(int t = 0; t<a.length; t++)
        {
            int number = a[t];
            occurrences[number]++;
        }
        print(occurrences);
        
        int index = 0;
        for(int i=0; i<maxNumber; i++)
        {
            System.out.printf("i = [%d] \n",i);
            System.out.printf("Occurrences of i occurrences[i] %d \n",occurrences[i]);
            for(int j=0; j<occurrences[i];j++)
            {
                System.out.printf("j = [%d] \n",j);
                a[index]= i;
                index++;
            }
        }
        System.out.println("Sorted array");
        print(a);
        
        
        
    }
    static void print(int []a )
    {
         System.out.println("");
        for(int i : a)
        {
            System.out.printf("  %02d  ",i);
        }
        System.out.println("");
        for(int i =0;i<a.length;i++)
        {
            System.out.printf(" [%02d] ",i);
        }
        System.out.println("");
    }
    
}
