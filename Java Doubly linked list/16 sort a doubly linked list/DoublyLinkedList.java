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

    public void sort() {
        Node node = this.head;
        while (node != null) {
            Node myNode = node;
            int value = node.data;
            while (myNode.prev != null &&  myNode.prev.data > value) {
                myNode.data = myNode.prev.data;
                myNode = myNode.prev; 
            }
            myNode.data = value;
            node = node.next;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(447);
        list.addNode(993);
        list.addNode(932);
        list.addNode(582);
        list.addNode(719);
        list.addNode(69);
        list.addNode(1000);
        list.addNode(1000);
        list.addNode(-2);
        list.addNode(-2);
        list.addNode(475);
        list.addNode(479);
        list.addNode(193);
        list.addNode(680);
        list.addNode(475);
        list.sort();
        list.display();
    }
}