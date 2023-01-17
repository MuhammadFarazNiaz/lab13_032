
package q;

import java.util.LinkedList;
import java.util.Queue;

public class Exam {

    public static void main(String[] args) {
        
        Queue <Integer>q = new LinkedList<Integer>();
           for(int i =0; i<5;i++){
              q.add(i);}
        System.out.println("Elements of queue are : "+q);      
        int removedelement = q.remove();
        
        System.out.println("removedelement "+ removedelement );
        
        System.out.println("updated queue  "+ q );
        
        int head = q.peek();
        
        System.out.println("head of queue : "+head);
        
        int size = q.size();
        
        System.out.println("size of queue : "+size); 
    }   
}
