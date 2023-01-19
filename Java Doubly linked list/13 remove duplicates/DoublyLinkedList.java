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

    public DoublyLinkedList removeDuplicates() {
        DoublyLinkedList temp = new DoublyLinkedList();
        Node node = this.head;
        if (node == null) {
            return temp;
        }
        while (node != null) {
            if (!temp.search(node.data)) {
                temp.addNode(node.data);
            }
            node = node.next;
        }
        return temp;
    }

    public boolean search(int searchValue) {
        Node node = this.head;
        if (node == null) {
            return false;
        }
        while (node != null) {
            if (node.data == searchValue) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(0);
        list.addNode(0);
        list.addNode(0);
        list.addNode(0);
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(0);
        list.addNode(5);
        list.addNode(5);
        list.addNode(1);
        list.display();
        System.out.println("After removing duplicates: ");
        list.removeDuplicates().display();
    }
}