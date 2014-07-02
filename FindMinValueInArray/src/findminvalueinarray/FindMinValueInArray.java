/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package findminvalueinarray;

/**
 *
 * @author pepe
 */
public class FindMinValueInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {0,-1};
      
        System.out.printf("length is %d",a.length);
        int min = find(a,0,a.length-1);
        System.out.printf("min is [%d]",min);
    }
    
    
    static int find(int[]a, int min, int max)
    {
        System.out.printf("min %d and max %d ",min,max);
        if (0 == max)
        {
            System.out.println("Here 0");
            return a[0];
        }
        else{
            
            int temp = find(a,min,max-1);
            int end = a[max];
            return (int)Math.min(temp,end);
        }
     
    }
    
}
