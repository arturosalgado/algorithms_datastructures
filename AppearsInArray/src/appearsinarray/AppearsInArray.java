/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appearsinarray;

/**
 *
 * @author pepe
 */
public class AppearsInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[] = {5,2,3,4,1,5};
        Integer tim = new Integer(0);
        Integer index = new Integer(0);
        
        times(a,index,5,tim);     
        System.out.printf("%d",tim);
        
    }
    
    static void times(int[] a,Integer index, int c,Integer total)
    {
        System.out.println("index"+index);
        
        if (index==a.length)
        return ;
        
        if (a[index]==c)
        {
            total = total+1;
            times(a,index++,c,total);
        }
        else
        {
            times(a,index++,c,total);
            
        }
      
      
      
    }
}
