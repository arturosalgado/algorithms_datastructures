package heapsort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class Node
{
    
    public Node left;
    public Node right;
    public int Value;
    
    
    public Node(int v)
    {
    this.Value  = v;
    }
    
    @Override
    public String toString ()
    {
        return "["+this.Value+"] \n";
    }

}
