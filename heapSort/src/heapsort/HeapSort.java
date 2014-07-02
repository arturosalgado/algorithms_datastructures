/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapsort;

import java.awt.BorderLayout;

import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author pepe
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node root = buildTree();
        print(root);
        
        heapArraySort(root);
        System.out.println("After sorting and re-inserting in the tree..");
        print(root);     
        
        
    }
    
    
    public static Node heapArraySort(Node root )
    {
        int size = traverse(root,0,null);
        Node[] arr = new Node[size];
        
        traverse(root, 0, arr);
        
        System.out.println("Printing Array");
        for(Node a : arr)
        {
            System.out.println("["+a.Value+"]");
        }
        
        /*sort the array*/
        Arrays.sort(arr,new Comparator<Node>(){
            @Override public int compare(Node m, Node n){
                int mv = m.Value;
                int nv = n.Value;
                return (mv<nv ? -1 :(mv==nv ? 0 : 1));
            }
            
        });
        
        for(Node a : arr)
        {
            System.out.println("["+a.Value+"]");
        }
        
        /*reinserting the nodes in the three*/
        
        for(int i=0; i<size;i++)
        {
        
            int left  = 2*i+1;
            int right = left+1;
            
            Node temp_left;
            if (left>= size)
            {
                temp_left = null;
            }    
            else
            {
                temp_left = arr[left];
            }
            arr[i]= temp_left;
            
            Node temp_right;
            if (right>= size)
            {
                temp_right = null;
            }    
            else
            {
                temp_right = arr[right];
            }
            
            arr[i]= temp_right;
        
        }
        System.out.println("Root is "+arr[0].Value);
        return arr[0]; // return the root;
        
        
    }
    
    public static int traverse(Node node,int count , Node[] array )
    {
        if (node == null)
        {
            return count;
        }
        
        if (array != null)
        {
            array[count] = node;
        }
        System.out.println("Count is "+count+"");
        count ++;
        
        count = traverse(node.left, count, array);
        count = traverse(node.right, count, array);
        
        
        return count;
    }
    
    public static Node buildTree()
    {
        Node n100 = new Node(100);
        Node n5 = new Node(5);
        Node n10 = new Node(10);
        Node n3 = new Node(3);
        Node n12 = new Node(12);
        Node n8 = new Node(8);
        
        
        
        n100.left = n5;
        n100.right = n3;
                
        n3.right = n10;
        n3.left  = n12;
        
        n5.left = n8;         
                
        
        return n100;
    }
    
    
    
    public static void print(Node root)
    {  
            if (root == null) return;
            
           
            print(root.left);
            System.out.print(root);
            print(root.right);
     
    }
}


