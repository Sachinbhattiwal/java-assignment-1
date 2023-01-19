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

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(-1000);
        list.addNode(1);
        list.addNode(2);
        list.addNode(100);
        list.addNode(-10);
        list.addNode(55);
        list.addNode(-20);
        list.display();

        Node node = list.head;
        int maximum = node.data;
        int minimum = node.data;
        node = node.next;
        while (node != null) {
            if (node.data < minimum) {
                minimum = node.data;
            }
            if (node.data > maximum) {
                maximum = node.data;
            }
            node = node.next;
        }
        System.out.println("Maximum value in list: "+maximum);
        System.out.println("Minimum value in list: "+minimum);
    }
}