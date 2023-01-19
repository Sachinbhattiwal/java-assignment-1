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

    public boolean search(int data) {
        Node current = this.head ;
        if (current == null) {
            return false ;
        }
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }  while (current != this.head);
        return false;
    }

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(2);
        list.addNode(45);
        list.addNode(44);
        list.display();
        System.out.println("Searching for 44 in list\nFound: "+list.search(44));
        System.out.println("Searching for 49 in list\nFound: "+list.search(40));
        System.out.println("Searching for 2 in list\nFound: "+list.search(2));
    }
}