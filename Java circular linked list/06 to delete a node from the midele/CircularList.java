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

    public void deleteHead() {
        if (head == null) {
            System.out.println("Nothing to delete hear. List is already empty");
            return ;
        } else if (head.next == head) {
            this.head = null;
        } else {
            this.head = this.head.next;
            this.tail.next = this.head;
        }
        
    }

    public void deleteTail() {
        Node current = this.head;
        if (current == null) {
            System.out.println("Already empty");
        } else if (current.next == head) {
            this.head = null;
            this.tail = null;
        } else {
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next;
            tail = current;
        }
    }

    public void delete(int index) {
        if (index < 0) {
            System.out.println("Not a valid index");
        } else if (index >= this.countNodes()) {
            System.out.println("Cannot delete, Index out of bound");
        } else if (index == 0) {
            this.deleteHead();
        } else if (index == this.countNodes()-1) {
            this.deleteTail();
        } else {
            Node prev = this.head;
            int count = 0;
            while (count < index-1) {
                prev = prev.next;
                ++count;
            }
            prev.next = prev.next.next;
        }
    }

    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();
        list.delete(2);        
        list.display();
        list.delete(2);
        list.display();
    }
}