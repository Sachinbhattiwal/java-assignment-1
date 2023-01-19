public class Main {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.addNode(25);
        list.addNode(35);
        list.addNode(33);
        list.display();
        System.out.println("Number of items in list is: "+list.countNodes());
    }
}
