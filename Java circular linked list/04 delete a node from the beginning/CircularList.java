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

    public void deleteHead() {
        if (head == null) {
            System.out.println("Nothing to delete hear. List is already empty");
            return ;
        } else if (head.next == head) {
            this.head = null;
        } else {
            this.head = this.head.next;
            this.tail.next = this.head;
        }
        
    }

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(3);
        list.addNode(4);
        list.display();
        list.deleteHead();
        System.out.println("After deleting head: ");
        list.display();
        System.out.println("Again, deleting head");
        list.deleteHead();
        list.display();
        System.out.println("Again, deleting head");
        list.deleteHead();
        list.display();
        System.out.println("Again, deleting head");
        list.deleteHead();
        list.display();
        System.out.println("Again, deleting head");
        list.deleteHead();
        list.display();
    }
}