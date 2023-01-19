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

    public void addAt(int data,int index) {
        Node newNode = new Node(data);
        if (index == countNodes()) {
            this.addNode(data);
        } else if (index > countNodes() || index < 0) {
            System.out.println("Index is not valid");
        } else if (index == 0) {
            this.addBegining(data);
        } else {
            int count = 0;
            Node prev = this.head ;
            while (count < index-1) {
                count++;
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    public void addBegining(int data) {
        Node newNode = new Node(data) ;
        if (this.head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        tail.next = head;
    }

    public void addNodeAtEnd(int data) {    
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
        list.addAt(44, 0);
        list.display();
        list.addAt(33, 1);
        list.display();
        list.addBegining(55);
        list.display();
        list.addNodeAtEnd(66);
        list.display();
        list.addAt(77, 4);
        list.display();
        list.addAt(88, 3);
        list.display();
        list.addAt(99, 6);
        list.display();
        list.addAt(22, 0);
        list.display();
    }
}