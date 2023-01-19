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

    public void deleteTail() {
        if (tail == null) {
            return ;
        } else if ( this.tail.prev == null) {
            this.tail = null;
            this.head = null;
            return;
        }
        this.tail.prev.next = null;
        this.tail = this.tail.prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.display();
        list.deleteTail();
        list.display();
        list.deleteTail();
        list.display();
        list.deleteTail();
        list.display();
        list.deleteTail();
        list.display();
    }
}