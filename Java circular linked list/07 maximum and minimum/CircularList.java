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


    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(55);
        list.addNode(78);
        list.addNode(2);
        list.addNode(-5);
        list.display();
        
        int maximum = list.head.data;
        int minimum = list.head.data;
        Node current = list.head;
        while (current.next != list.head) {
            current = current.next;
            if (current.data > maximum) {
                maximum = current.data;
            }
            if (current.data < minimum) {
                minimum = current.data;
            }
        }
        System.out.println("Maximum in list is: "+maximum);
        System.out.println("Minimum in list is: "+minimum);
    }
}