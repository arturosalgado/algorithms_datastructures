/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printreversedlinkedlistrecursive;

/**
 *
 * @author pepe
 */
public class PrintReversedLinkedListRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node n = buildList();
        printr(n);
        
    }
    
    
    static void printr(Node n)
    {
        if (n==null)
        {
            return;
        }
        else
        {
            
            printr(n.next);
            System.out.printf("%d",n.value);
        }
    }
    
    static Node buildList()
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        return a;
        
    }
    
    
    
}

class Node{

    public int value;
    public Node next;
    public Node(int val)
    {
        this.value = val;
    }

}
