package InterviewPrep.LinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

//SinglyLinkedList
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class SinglyLinkedList{

    Node head; // Initializing head of the list

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next!=null){
            current=current.next;
        }

        current.next=newNode;
    }

    public void insertAtBeginning(int data){
        if(head == null){
            head = new Node(data);
            return ;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPos(int position,int data){
        Node newNode = new Node(data);

        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node cur = head;
        int i=0;
        while(cur!=null && i<position-1){
            cur = cur.next;
            i++;
        }

        if(cur == null){
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        else{
            newNode.next  = cur.next;
            cur.next = newNode;
        }

    }

    public void deleteFromBeginning(){
        if(head!=null){
            head=head.next;
        }
    }

    public void deleteFromEnd(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node cur = head;
        while(cur.next.next!=null){
            cur = cur.next;
        }
        cur.next =null;

    }
    public void deleteByValue(int data) {

        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
        }

        Node current = head;

        while (current.next != null && current.next.data != data) {

            if (current.next.next != null) {
                current = current.next;
            }
        }
        if(current.next==null){
            return ;
        }
        current.next = current.next.next;
    }

    public void deleteAtPosition(int pos){
        if(head ==null){
            return;
        }
        if(pos == 0){
            head = head.next;
            return;
        }
        Node cur = head;
        int i=0;
        while(cur!=null && i<pos-1){
            cur = cur.next;
            i++;
        }
        if(cur!=null && cur.next!=null){
            cur.next = cur.next.next;
        }
    }

    public boolean search(int data){
        Node cur = head;
        while(cur!=null){
            if(cur.data == data){
                return true;
            }
            else{
                cur=cur.next;
            }
        }
        return false;
    }

    public void reverse(){
        Node cur = head;
        Node prev = null;
        Node Next = null;

        while(cur!=null){
            Next = cur.next;
            cur.next = prev;
            prev =cur;
            cur = Next;
        }
        head = prev;
    }


    public void display(){
        Node cur = head ;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args){
       SinglyLinkedList obj = new SinglyLinkedList();

       obj.insertAtBeginning(1);
        obj.insertAtEnd(2);
        obj.insertAtBeginning(3);
        obj.insertAtEnd(5);
        obj.insertAtEnd(4);
        obj.display();
        obj.deleteByValue(4);
        obj.display();
        obj.deleteAtPosition(2);
        obj.display();
        obj.reverse();
        obj.display();
        obj.search(5);
        obj.deleteAtPosition(0);
        obj.display();


    }
}
