public class CircularList {
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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

    public void deleteTail() {
        Node current = this.head;
        if (current == null) {
            System.out.println("Already empty");
        } else if (current.next == head) {
            this.head = null;
            this.tail = null;
        } else {
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next;
            tail = current;
        }
    }


    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();
        list.deleteTail();
        System.out.println("After deleting tail: ");
        list.display();
        System.out.println("Again, deleting tail");
        list.deleteTail();
        list.display();
        System.out.println("Again, deleting tail");
        list.deleteTail();
        list.display();
        System.out.println("Again, deleting tail");
        list.deleteTail();
        list.display();
        System.out.println("Again, deleting tail");
        list.deleteTail();
        list.display();
    }
}