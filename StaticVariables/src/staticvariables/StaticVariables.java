/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staticvariables;

/**
 *
 * @author pepe
 */
public class StaticVariables {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ant[] nest = new Ant[10];
        for(int i = 0; i<10; i++)
        {
            nest[i]= new Ant();
        }
        
        System.out.println("Total ants "+Ant.getTotal());
        
    }
    
    
}


class Ant{

    static int ant_count=0; 
    int level;
    static int MAX_PRICE = 99;
    public Ant()
    {
        ant_count++;
        System.out.println("We are now"+ant_count);
        
    }
    
    public static int getTotal()
    {
      
        return ant_count;
    }

}
