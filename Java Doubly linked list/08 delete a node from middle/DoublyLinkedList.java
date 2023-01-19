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

    public void delete(int index) {
        if (index < 0 || index >= this.countNodes()) {
            System.out.println("Cannot delete. Not a valid index");
            return ;
        } else if (index == 0) {
            this.deleteHead();
        } else if (index == this.countNodes() - 1) {
            this.deleteTail();
        } else {
            int count = 0;
            Node node = this.head;
            while (count < index) {
                node = node.next;
                ++count;
            }
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
    public void deleteHead() {
        if (this.head == null) {
            return ;
        } else if (this.head.next == null) {
            this.head = null;
            this.tail = null;
            return ;
        }
        this.head.next.prev = null;
        this.head = this.head.next;
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
        list.addNode(3);
        list.addNode(4);
        list.addNode(10);
        list.addNode(15);
        list.display();
        list.delete(1);
        list.display();
        list.delete(3);
        list.display();
    }
}