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

    public void addAt(int data,int index) {
        Node newNode = new Node(data);
        if (index == countNodes()) {
            this.addNode(data);
        } else if (index > countNodes() || index < 0) {
            System.out.println("Index is not valid");
        } else if (index == 0) {
            this.addBegining(data);
        } else {
            int count = 0;
            Node prev = this.head ;
            while (count < index-1) {
                count++;
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }
    public void addBegining(int data) {
        Node newNode = new Node(data) ;
        if (this.head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        tail.next = head;
    }

    public void addNodeAtEnd(int data) {    
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
    }

    public boolean search(int data) {
        Node current = this.head ;
        if (current == null) {
            return false ;
        }
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }  while (current != this.head);
        return false;
    }

    public CircularList sort() {
        CircularList temp = new CircularList();
        Node current = this.head;
        if (current == null) {
            return temp;
        }
        temp.addNode(current.data);
        current = current.next;
        while (current != this.head) {
            Node iter = temp.head;
            int count = 0;
            while (iter.data < current.data) {
                count++;
                iter = iter.next;
                if (iter == temp.head) {
                    break;
                }
            }
            temp.addAt(current.data, count);
            current = current.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(55);
        list.addNode(2);
        list.addNode(45);
        list.addNode(44);
        list.addNode(-5);
        list.addNode(78);
        list.display();
        System.out.println("After sorting");
        list.sort().display();
    }
}