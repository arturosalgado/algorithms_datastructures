/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myquicksort;

/**
 *
 * @author pepe
 */
public class MyQuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int []a ={2,4,6,5,1,14,9,8};
        //int []a ={0,3,2,1,-1,-2,8};
        int []a ={53,12,98,63,18,32,80,46,72,21};
       // int []a ={10,9,8,7,3,2,1};
        System.out.println("original");
        print(a);
        quicksort(a,0,a.length-1);
        System.out.println("after");
        print(a);
        
        
    }
    
    static int partition(int []a, int start, int end)
    {
        int pivot = start;
        System.out.println("Pivot is "+pivot+" which is a[pivot ]= "+a[pivot]);
     
      
      
        while(start<end)
        {
            start  = Left(a,start,pivot);
            end = Right(a,end,pivot);
            
            if (start<end){
            swap(a,end,start);
            print(a);
            }
           
            
            System.out.println("sLeft is "+start);
            System.out.println("sRight is "+end);
           
             
           
        }
        
        
       
        
        
        System.out.printf("Returning is [%d] \n",end);
        return end;
    }
    
    static int Left(int a[],int left, int pivot)
    {
        while (a[left]<a[pivot] )
        ++left;    
        return left;
        
    }
     static int Right(int a[],int right, int pivot)
    {
        while (a[right]>a[pivot] )
        --right;    
        return right;
        
    }
     static void quicksort(int a[], int start, int end)
    {
        if (start < end) {
        int dp = partition(a, start, end);
        System.out.println("dp is "+dp);
        //quicksort(a, start, dp);
        //quicksort(a, dp+1, end);
        }
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
