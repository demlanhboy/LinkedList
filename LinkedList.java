/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;
/**
 *
 * @author Quang
 */
public class LinkedList {

    /**
     */
    public static Node head,second,third,last;
    
    public static void main(String[] args) {
        //New LinkedList
        LinkedList list = new LinkedList();        
        head = new Node(10);
        second = new Node(4);
        third = new Node(8);
        last = new Node(9); 
        head.next = second;
        second.next = third;
        third.next = last;
        
        //Display Original List
        System.out.print("Original list: ");
        list.display(head);
        System.out.print("\n");
        
        //Remove the tail element from LinkedList then Display
        list.RemoveTail();
        System.out.print("List after Remove Tail Element: ");
        list.display(head);
        System.out.print("\n");
        
        //Append an element into LinkedList then Display
        list.Append(6);
        System.out.print("List after Append: ");
        list.display(head);
        System.out.print("\n");
        
        

        //Remove all element in the linkedlist that is great than 7
        System.out.print("List after Remove all element that is greater than 7: ");
        list.RemoveGreaterValue();
        list.display(head);

    }
    public void display(Node head){
        if (head == null){return;}
        Node current = head;
        while (current!= null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    //Adding at the end of the list

    public void Append(int data) {

        Node temp = head;
        while (temp.next != null) {
                temp = temp.next;
        }
        temp.next = new Node(data);
    }
    
    public void RemoveTail(){
        Node temp = head;
        Node curr = null;
        for (curr = head; curr.next.next != null;curr = curr.next) {
        }
        curr.next = null;
    
    }

    public void RemoveGreaterValue(){
        Node temp = head;
        if (head.data>5){head=head.next;}
        while (temp.next!= null) {
                if(temp.next.data>7){temp.next=temp.next.next;}
                else{temp = temp.next;}
        }
        
    }
}
class Node{

    public int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public String toString() {
        return data + " ";
    }
}