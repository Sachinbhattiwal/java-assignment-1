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

    public void addNodeAt(int index, int data) {
        if (index < 0 || index > this.countNodes()) {
            System.out.println("Cannot add node at index: "+index+". Index is not valid");
            return ;
        } else if (index == this.countNodes()) {
            this.addNode(data);
            return ;
        } else if (index == 0) {
            this.addHead(data);
            return ;
        }
        Node newNode = new Node(data);
        int count = 0;
        Node previos = this.head;
        while (count < index - 1) {
            previos = previos.next;
            count++;
        }
        newNode.next = previos.next;
        newNode.prev = previos;
        previos.next.prev = newNode;
        previos.next = newNode;
    }

    public int countNodes() {
        int count = 0;
        Node node = this.head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public void addHead(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = this.tail = node;
            return ;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(0);
        list.addNodeAt(0, -1);
        list.addNodeAt(1, 10);
        list.addNodeAt(2, 20);
        list.addNodeAt(7, 30);
        list.addNodeAt(5, 40);
        list.display();
    }
}