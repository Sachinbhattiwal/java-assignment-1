class DoublyLinkedList {
    class Node {
        int data;
        Node prev = null;
        Node next = null;

        public Node(int value) {
            this.data = value;
        }
    }
    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.prev = this.tail;
        if (this.head == null) {
            this.head =  newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    public void display() {
        Node node = this.head;
        System.out.print("List:-  ");
        if (node == null) {
            System.out.print("Empty");
        }
        while (node != null) {
            if (node.next == null) {
                System.out.println(node.data);
                return;
            }
            System.out.print(node.data+" --> ");
            node = node.next;
        }
    }

    public void addTail(int data) { // Same as addNode
        Node node = new Node(data);
        if (this.tail == null) {
            this.head = this.tail = node;
            return ;
        }
        node.prev = this.tail;
        this.tail.next = node;
        this.tail = node;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addTail(-1);
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addTail(5);
        list.display();
    }
}