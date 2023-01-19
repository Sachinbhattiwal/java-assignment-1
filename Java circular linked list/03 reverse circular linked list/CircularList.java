public class CircularList {
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Methods
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Nodes of singly linked list: ");
        do {
            System.out.print(current.data + ", ");
            current = current.next;
        } while (current != head) ;
        System.out.println();
    }

    public int countNodes() {
        Node current = head;
        int count = 0;
        if (current == null) {
            return count;
        }
        do {
            ++count;
            current = current.next;
        } while (current != head);
        return count;
    }
    
    public CircularList reverseList () {
        CircularList revlist = new CircularList();
        if (this.head == null) {
            return revlist;
        }
        return reverse(revlist, this.head);
    }

    private CircularList reverse(CircularList L, Node h) {
        if (h.next != head) {
            reverse(L, h.next);
        }
        L.addNode(h.data);
        return L;
    }

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(3);
        list.addNode(4);
        list.display();
        System.out.println("Reversed list: ");
        list.reverseList().display();
    }
}