public class LinkList {    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    public Node head = null;    
    public Node tail = null;    
        
    public void addNode(int data) {    
        Node newNode = new Node(data);    
            
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
        
    public void display() {    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            System.out.print(current.data + ", ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
    
    public void deleteHead() {
        this.head = this.head.next;
    }

    public void deleteTail() {
        Node current = this.head;
        if (current == null) {
            System.out.println("Already empty");
        } else if (current.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void delete(int index) {
        if (index < 0) {
            System.out.println("Not a valid index");
        } else if (index > this.countNodes()-1) {
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

    public int countNodes() {
        Node current = head;
        int count = 0;
        
        while (current!= null) {
            ++count;
            current = current.next;
        }
        return count;
    }


    public static void main(String[] args) {    
            
        LinkList sList = new LinkList();    
            
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(11);
        sList.display();

        System.out.println("After deleting tail");
        sList.delete(0);
        sList.display();
    }    
}    