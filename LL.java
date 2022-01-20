class LL {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node ptr = head;
        while(ptr.next != null) {
            ptr = ptr.next;
            
        }
        ptr.next = newNode;
    } 
    public void printList() {
        Node ptr = head;
        while(ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;

        }
        System.out.print("null");
    }
    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node currNode = head;
        Node pre = null;
        while(currNode != null) {
            Node next = currNode.next;
            currNode.next = pre;

            pre = currNode;
            currNode = next;
        } 
        head = pre;
    }
    public Node reversrRecursive(Node head) {
        if (head == null || head.next == null) {
            System.out.print("first returned " + head.data + " ");
            return head;
        }
        Node newNode = reversrRecursive(head.next);
        System.out.print("then " + head.data + " ");
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public void removeNthFromLast(int n) {
        Node ptr = head;
        int size = 0;
        while(ptr != null) {
            size++;
            ptr = ptr.next;
        }
        int count = 1;
        ptr = head;
        Node pre = null;
        // 4  3  2  1
        // 1->2->3->4->null
        while(count != size-n+1) {
            pre  = ptr;
            ptr = ptr.next;
            count++;
        }
        if(count == 1) {
            head = head.next;
            return;
        }
        pre.next = ptr.next;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        // list.reverseIterative();
        // list.head = list.reversrRecursive(list.head);
        // System.out.println();
        list.removeNthFromLast(4);
        list.printList();
    }
}

// import java.util.*;

// class LL {
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         // remove nth node from last in a list
//         int n = 4;
//         list.remove(list.size()-n);
//         System.out.println(list);
//     }
// }