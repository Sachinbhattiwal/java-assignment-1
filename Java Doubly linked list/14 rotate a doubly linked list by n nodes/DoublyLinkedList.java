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
            head =  newNode;
        } else {
            tail.next = newNode;
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

    public void rotate(int byNodes) {
        if (this.head == null || this.head.next == null) {
            return;
        }
        for (int i = 0; i < byNodes; ++i) {
            int value = this.head.data;
            this.head.next.prev = null;
            this.head = this.head.next;
            this.addNode(value);
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        System.out.println("Original: ");
        list.display();
        System.out.println("Rotating by 3 nodes");
        list.rotate(3);
        list.display();
        System.out.println("Rotating by 1 node");
        list.rotate(1);
        list.display();
    }
}