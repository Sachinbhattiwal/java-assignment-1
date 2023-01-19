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
    
    public int countNodes() {
        Node current = head;
        int count = 0;
        
        while (current!= null) {
            ++count;
            current = current.next;
        }
        return count;
    }

    public LinkList reverseList () {
        LinkList revlist = new LinkList();
        return reverse(revlist, this.head);
    }

    public LinkList reverse(LinkList L, Node h) {
        if (h.next != null) {
            reverse(L, h.next);
        }
        L.addNode(h.data);
        return L;
    }

    public static void main(String[] args) {    
            
        LinkList sList = new LinkList();    
        boolean isPalindrome = true;  
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(2);
        sList.addNode(1); 
        
        LinkList revList = sList.reverseList();
        
        Node current1 = sList.head;
        Node current2 = revList.head;
        while (current1!=null) {
            if (current1.data != current2.data) {
                isPalindrome = false ;
                break;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        if (isPalindrome) {
            System.out.println("Given list is palidrome.");
        } else {
            System.out.println("Given list is not palindrome.");
        }
    }    
}    