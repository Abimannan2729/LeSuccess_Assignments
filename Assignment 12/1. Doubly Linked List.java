import java.util.*;

class DoublyLinkedList {

    class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node head = null, tail = null;

    public void insertAtEnd(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void insertAtBegin(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void deleteAtBegin() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteAtEnd() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void insertAtPos(int val, int pos) {
        if (pos <= 1) {
            insertAtBegin(val);
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < pos - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            insertAtEnd(val);
            return;
        }
        Node newnode = new Node(val);
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }

    public void deleteMiddle() {
        if (head == null || head.next == null) return;
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == tail) {
            deleteAtEnd();
        } else {
            prev.next = slow.next;
            if (slow.next != null)
                slow.next.prev = prev;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList db_list = new DoublyLinkedList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            db_list.insertAtEnd(val);
        }
        System.out.println("Initial list elements");
        db_list.display();
        db_list.insertAtBegin(0);
        System.out.println("list elements after Insert at begin");
        db_list.display();
        db_list.insertAtEnd(6);
        System.out.println("list elements after Insert at End");
        db_list.display();
        db_list.deleteAtBegin();
        System.out.println("list elements after Delete at begin");
        db_list.display();
        db_list.deleteAtEnd();
        System.out.println("list elements after Delete at End");
        db_list.display();
        db_list.deleteAtEnd();
        System.out.println("list elements after Delete at End");
        db_list.display();
        db_list.insertAtPos(5,3);
        System.out.println("list elements after Insert At Pos #3");
        db_list.display();
        db_list.deleteMiddle();
        System.out.println("list elements after Deleting middle");
        db_list.display();
    }
}
