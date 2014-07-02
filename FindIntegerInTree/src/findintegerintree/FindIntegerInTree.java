/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package findintegerintree;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author pepe
 */
public class FindIntegerInTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node t = buildtree();
        boolean b = searchIntegerBreath(t,15);
        System.out.println("b is "+b);
        
        boolean b1 = searchIntegerDepth(t,15);
        System.out.println("b1 is "+b1);
        
        boolean b2 = largeTree(t,15);
        System.out.println("b2 is "+b2);
        
        
        
    }
    
    static Node buildtree()
    {
    
        Node root= new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        
        
        root.left  = n1;
        root.right = n2;
        
        
        n1.left = n3;
        n1.right = n4;
        
        n2.left = n5;
        
        
        return root;
        
    
    
    }
    
    
    public static boolean searchIntegerBreath(Node root, int find)
    {
        //System.out.println("Inspecting "+root.value);
        if (root == null) return false;
        
        LinkedList <Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            
            Node  t = (Node) q.remove();
            System.out.println("Inspecting "+t.value);
            
            if (t.value==find)  return true;
            
            if (t.right!=null)
            q.add(t.right);
            
            if (t.left!=null)
            q.add(t.left);
            
        }
    
        
        return false;
    }
    
    public static boolean searchIntegerDepth(Node root, int findme)
    {
        
        if (root == null) return false;
        
        if (root.value == findme)  return true;
        else
        {
            
            boolean left  = searchIntegerDepth(root.left, findme);
            boolean right = searchIntegerDepth(root.right, findme);
            return left||right;
        }
        
        
    
    }
    public static boolean largeTree(Node root, int findme)
    {
        
        if (root == null) return false;
        
        Stack<Node> s = new Stack<Node>();
        
        s.push(root);
        
        while(!s.empty())
        {
            Node t = s.pop();
            if (t.value==findme) return true;
            else
            {
                if (t.right!=null)
                s.push(t.right);
                
                if (t.left!=null)
                s.push(t.left);
            }
            
            
        }
        
        
        return false;
    
    }
}

class Node{

    int value;
    Node left;
    Node right;

    public Node(int value)
    {
        this.value = value;
    }
    
}