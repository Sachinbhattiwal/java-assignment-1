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

    public void addNodeAtEnd(int data) {    //Same as addNode
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
    }

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNodeAtEnd(0);
        list.addNode(55);
        list.display();
        list.addNodeAtEnd(11);
        list.display();

    }
}