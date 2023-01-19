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
        
    public static void main(String[] args) {    
            
        LinkList sList = new LinkList();    
            
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(-2);   
        sList.addNode(200); 
        
        int maximum, minimum;

        Node current = sList.head;
        minimum = maximum = current.data;
        while (current != null) {
            if (current.data > maximum) {
                maximum = current.data;
            } else if (current.data < minimum) {
                minimum = current.data;
            }
            current = current.next;
        }
        System.out.println("Maximum value in list is: "+maximum);
        System.out.println("Minimum value in list is: "+minimum);
    }    
}    