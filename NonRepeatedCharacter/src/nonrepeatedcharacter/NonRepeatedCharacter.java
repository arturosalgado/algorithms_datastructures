/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nonrepeatedcharacter;

import java.util.HashMap;

/**
 *
 * @author pepe
 */
public class NonRepeatedCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("Find the first non Repeated Character...");
        //Character c = firstNoneRepeated("asdcdbdadscWWSS");
        //System.out.println("The char is "+c);
        
        //System.out.println("Flags");
        
        //String s = removeChars("Arturo de los Angeles","oe");
        
        //System.out.println("Cleared string "+s);
        
        System.out.println("Reverse words "+reverseWords("Red Army Choir"));
        
        
    }
    
    
    public static Character firstNoneRepeated(String str)
    {
        HashMap<Character, Integer> charhash = new HashMap<Character, Integer>();
        int i, length; 
        Character c=null;
        
        length = str.length();
        
        /*scan string */
        for(i = 0; i<length;i++)
        {
            c = str.charAt(i);
            System.out.println("Char at "+i+" is "+c);
            if (charhash.containsKey(c))
            {
                charhash.put(c,charhash.get(c) + 1);
            }
            else
            {
                charhash.put(c, 1);
            }
            
        }
        
        /*what did you find*/
        for (i = 0; i < length; i++) 
        {
            c = str.charAt(i);
            if (charhash.get(c) == 1)
            return c;
        }
        
        return null;
        
        
    }
    
    
    public static String reverseWords(String s)
    {
        char []original  = s.toCharArray();
        char []buffer = new char[original.length+1];
        int writePos = 0;
        System.out.println("Size is "+original.length);
        for(int i = original.length-1; i>=0; i-- )
        {
            System.out.println("Char is "+original[i]);
        }
    
        int PosPointer = original.length-1;
       
        while (PosPointer >=0 ){
            
            if (original[PosPointer]==' ')
            {
                System.out.println("Found an empty space");
                buffer[writePos++] = original[PosPointer--];
            }
            else
            {
               int wordEnds = PosPointer;
               int forwardPointer ; 
               while(PosPointer>=0 && original[PosPointer]!=' ')
               {
                   PosPointer--;
               }
               forwardPointer = PosPointer+1;
               while(forwardPointer<=wordEnds)
               buffer[writePos++]= original[forwardPointer++];
               
            }
           
        }
        
        buffer[writePos]='\0';
        return new String(buffer);
    }
    
    public static String removeChars( String str, String remove ){
        char[] original = str.toCharArray();
        char[] r = remove.toCharArray();
        int src, dst = 0;
        // flags automatically initialized to false, size of 128 assumes ASCII
        boolean[] flags = new boolean[128];
        // Set flags for characters to be removed
        char e='e';
        int eholder = e;
        System.out.println("Char of e is "+eholder);
        
        for( src = 0; src < r.length; ++src ){
            System.out.println("Src  is "+src);
            int index =  r[src];
            System.out.println("Index is "+index);
        
            flags[index] = true;
        }
        System.out.println("Flags");
        for(int k=0; k<flags.length;k++)
        {
            System.out.println("k is "+k+"val is  ["+flags[k]+"]");
        }
        // Now loop through all the characters,
        // copying only if they aren’t flagged
        
        System.out.println("Copy...");
        
        for( src = 0; src < original.length; ++src ){
            
                int index2 = original[src];
                System.out.println("Index2 is "+index2);
                if( flags[ index2 ]== false){
                    original[dst++] = original[src];
                    System.out.println("Originial[dst++]="+original[dst]);
                }
        }
        return new String( original, 0, dst );
    } 
}
