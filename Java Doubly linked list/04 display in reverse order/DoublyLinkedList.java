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
            System.out.println("Empty");
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

    public void displayReverse() {
        Node node = this.tail;
        System.out.print("List:- ");
        if (node == null) {
            System.out.println("Empty");
        }
        while (node != null) {
            if (node.prev == null) {
                System.out.println(node.data);
                return;
            }
            System.out.print(node.data+"<--");
            node = node.prev;
        }
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
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.display();
        System.out.println("In reverse order:");
        list.displayReverse();

    }
}