package InterviewPrep.LinkedList.DLL;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node cur = head;

        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.prev = cur;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtPos(int pos, int data) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        int i = 0;
        Node cur = head;
        while (cur != null && i < pos - 1) {
            cur = cur.next;
            i++;
        }

        if (cur == null) {
            insertAtEnd(data);
        } else {
            newNode.next = cur.next;
            newNode.prev = cur;
            if (cur.next != null) {
                cur.next.prev = newNode;
            }
            cur.next = newNode;
        }
    }

    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.prev.next = null;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node cur = head;
        int i = 0;
        while (cur != null && i < pos) {
            cur = cur.next;
            i++;
        }

        if (cur != null) {
            if (cur.prev != null) {
                cur.prev.next = cur.next;
            }
            if (cur.next != null) {
                cur.next.prev = cur.prev;
            }
        }
    }

    public boolean search(int data) {
        Node cur = head;
        while (cur != null) {
            if (cur.data == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void reverse() {
        Node temp = null;
        Node cur = head;
        while (cur != null) {
            temp = cur.prev;
            cur.prev = cur.next;
            cur.next = temp;
            cur = cur.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void display() {
        Node cur = head;
        System.out.print("null <-> ");
        while (cur != null) {
            System.out.print(cur.data + " <-> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtFront(1);
        list.insertAtEnd(2);
        list.insertAtFront(3);
        list.insertAtEnd(5);
        list.insertAtEnd(4);
        list.display();

        list.deleteAtPosition(4); // Replaced deleteBy with deleteAtPosition for testing
        list.display();

        list.deleteAtPosition(2);
        list.display();

        list.reverse();
        list.display();

        boolean found = list.search(5);
        System.out.println("Search for 5: " + (found ? "Found" : "Not Found"));

        list.deleteAtPosition(0);
        list.display();
    }
}
