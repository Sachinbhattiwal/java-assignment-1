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
    public void addAt(int data,int index) {
        Node newNode = new Node(data);
        if (index == countNodes()) {
            this.addNode(data);
        } else if (index > countNodes() || index < 0) {
            System.out.println("Index is not valid");
        } else if (index == 0) {
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                newNode.next = this.head ;
                this.head = newNode;
            }
        } else {
            int count = 0;
            Node current = this.head ;
            this.head.data = 1000;
            while (count < index-1) {
                count++;
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
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
        sList.addAt(45, 2); 
        sList.display();    
    }    
}    