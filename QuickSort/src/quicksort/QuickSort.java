/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

import java.util.Random;

/**
 *
 * @author pepe
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []a ={2,4,6,5,1,14,9,8};
        System.out.println("Original array");
        print(a);
        quicksort(a, 0, 7);
        System.out.println("Final array is ");
        print(a);
        
        
    }
    
    
    static void quicksort(int a[], int start, int end)
    {
        if(start>=end)
        {
            System.out.println("start and end equal so return...");
            return;
        }
        
        int index = partition(a,start, end);
        System.out.println("returned partiion = "+index);
        quicksort(a, start, index);
        quicksort(a, index+1, end);
        System.out.println("in quicksort index is "+index);
        
    }
    
    
    static int partition(int a[],int start , int end)
    {
        Random r = new Random();
        int pivot = r.nextInt(end- start+1)+start;
        pivot = start;
        System.out.println("pivot is "+pivot);
        
        System.out.println("prior to first swap");
        print(a);
        swap(a,pivot,end);
        System.out.println("After  swap");
        print(a);
        
        
        
        int small = start-1;
        System.out.printf("in partition: Small is  = [%d] \n",small);
        System.out.printf("prior to loop start =  [%d] , end = [%d] \n",start,end);
        for(int i = start; i<= end;++i)
        {
            if (a[i]<a[end])
            {
                System.out.printf("a[i]=(%d) i=[%d]< a[end]=(%d)  end=%d\n",a[i],i,a[end],end);
                System.out.printf("increasing small to (%d) \n",++small);
                if(i!=small)
                {
                    System.out.println("Still separated so swap elements ");
                    print(a);
                    swap(a,small,i);
                    print(a);
                }
                else
                {
                    System.out.printf("i is equal to small %d \n",i);
                }
            }
            else
            {
                System.out.printf("a[i]=(%d) i=[%d]< a[end]=(%d)  end=%d\n",a[i],i,a[end],end);
                System.out.printf("not minor, movin i = %d \n",i);
            }
        }
        ++small;
        if(small!=end)
            swap(a,small,end);
        
        return small;    
    }
    
    static void swap(int []a, int x, int y)
    {
        int temp = a[y];
        a[y]=a[x];
        a[x] = temp;
    
    }
    
    static void print(int []a )
    {
         System.out.println("");
        for(int i : a)
        {
            System.out.printf(" %d ",i);
        }
        System.out.println("");
        
    }
            
}
