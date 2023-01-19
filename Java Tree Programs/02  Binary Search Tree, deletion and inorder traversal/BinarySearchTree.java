class Node {
    int data;
    Node leftChild , rightChild ;

    public Node(int key) {
        data = key;
        leftChild = rightChild = null;
    }
}
public class BinarySearchTree {
    Node root ;

    public BinarySearchTree(int key) {
        root = new Node(key);
    }
    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        this.root = realInsert(this.root, key);
    }
    public Node realInsert(Node myRoot, int key) {
        if (myRoot == null) {
            myRoot = new Node(key);
            return myRoot;
        }
        if (myRoot.data > key) {
            myRoot.leftChild = realInsert(myRoot.leftChild, key);
        } else if (myRoot.data < key) {
            myRoot.rightChild = realInsert(myRoot.rightChild, key);
        } else {
            System.out.println("Cannot insert duplicate data");
        }
        return myRoot;
    }

    public void delete(int key) {
        this.root = realDelete(this.root, key) ;
    }
    public Node realDelete(Node myNode, int key) {
        if (myNode == null) {
            return myNode;
        } else if (myNode.data == key ) {
            if (myNode.leftChild == null && myNode.rightChild == null) {
                return null;
            } else if (myNode.leftChild == null) {
                return myNode.rightChild;
            } else if (myNode.rightChild == null) {
                return myNode.leftChild;
            } else {
                myNode.data = inorderNext(myNode.rightChild);
                myNode.rightChild = realDelete(myNode.rightChild, myNode.data);
            }
        } else if (myNode.data > key) {
            myNode.leftChild = realDelete(myNode.leftChild, key);
        } else {
            myNode.rightChild = realDelete(myNode.rightChild, key);
        }
        return myNode;
    }

    public int inorderNext(Node newRoot) {
        int nex = newRoot.data;
        while (newRoot.leftChild != null) {
            newRoot = newRoot.leftChild;
            nex = newRoot.data;
        }
        return nex;
    }

    public static void inorder(Node newRoot) {
        if (newRoot == null) {
            return;
        }
        inorder(newRoot.leftChild);
        System.out.println(newRoot.data);
        inorder(newRoot.rightChild);
    }
    public static void main(String[] args) {
        BinarySearchTree mytree = new BinarySearchTree();
        mytree.insert(10);
        mytree.insert(8);
        mytree.insert(11);
        mytree.insert(12);
        mytree.insert(14);
        mytree.insert(02);
        mytree.insert(9);
        inorder(mytree.root);

        System.out.println("After deleting 10: ");
        mytree.delete(10);
        inorder(mytree.root);

        System.out.println("After deleting 7: ");
        mytree.delete(7);
        inorder(mytree.root);

        System.out.println("After deleting 12: ");
        mytree.delete(12);
        inorder(mytree.root);
    }
}
