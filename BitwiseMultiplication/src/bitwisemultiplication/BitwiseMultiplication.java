/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitwisemultiplication;

/**
 *
 * @author pepe
 */
public class BitwiseMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        
        int a = 1;
        int b = 1;
        
        int c = 0;
        int s = 0;
        System.out.println(bin(a));
        System.out.println(bin(b));
        System.out.println("");
        
        s =  a ^ b ;
        c =  a & b ;
        System.out.println("carry "+bin(c));
        c = c<<1;
        System.out.println("recor "+bin(c));
        
        System.out.println("Suma  "+bin(s));
        System.out.println(bin(c));
        
        System.out.println("***  ----------------------------");
        
        int z = getSum(3,5);
        
        System.out.println("z = "+z);
        
        System.out.println("***  ---------------Iterative-------------");
        
        int t = iterativeSum(4,10);
        
        System.out.println("t = "+t);
        
        System.out.println("***  ---------------Sum-------------");
    
        int p = sum(1,5);
        System.out.println("p = "+p);
        
        
        System.out.println("***  ---------------Mul-------------");
    
        int r = mul(3,5);
        System.out.println("r = "+r);
        //mul
    }
    
    public static int getSum(int p, int q)
    {
        
        System.out.println("p "+bin(p));
        System.out.println("q "+bin(q));
        
        int result = p ^ q; // + without carry 0+0=0, 0+1=1+0=1, 1+1=0
        int carry = (p & q) << 1; // 1+1=2
        if (carry != 0) {
            return getSum(result, carry);
        }
        return result;
    }
    
    /*
        aqui lo importante es que b se vuelva el nuevo carry y la suma se vuelva la nueva a;
    */
    
    static int iterativeSum(int a , int b)
    {
       
        System.out.println("Llegan"); 
        System.out.println("a = "+bin(a)); 
        System.out.println("b = "+bin(b)); 
        
        int r = 0;
        int c = 0;
       
        while (b!=0 )
        {  
            System.out.println("a = "+bin(a)); 
            System.out.println("b = "+bin(b));
            r = a^b;
            System.out.println("r = "+bin(r));
            c = (a&b)<<1; 
            System.out.println("c = "+bin(c));
            b = c;
            a = r; // this is the new input
           
        }
        return  r;
    }
    
    static int sum(int a , int b)
    {
           System.out.println("a = ["+bin(a));
           System.out.println("b = ["+bin(b));
           int s = a^b; 
           int c = (a&b)<<1;
           if (c != 0)
           {
               return sum(s,c);
           }
           else
           return s;
        
    }
    
    static int mul(int a, int b)
    {
        int res=0; 
        for(int i=0; i<a; i++)
        {
            res = sum(b,res);
        }
        
        
        return res;
    }
    
    static Input half(Input i)
    {
        int s = i.a ^ i.b; 
        int c = (i.a & i.b)<<1;
        Input r = new Input(s,c);
        return r;
        
    }
    
    static void oct(int a)
    {
        System.out.printf("%08o oct [%d]dec   [%s] bin \n", a,a,Integer.toBinaryString(a)); 
    }
    static String bin(int n)
    {
        return String.format("%8s", Integer.toString(n,2)).replace(' ', '0')+" ["+n+"]";
    }
    
}


class Input{

    public int a ;
    public int b ; 
    
    public Input(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

}