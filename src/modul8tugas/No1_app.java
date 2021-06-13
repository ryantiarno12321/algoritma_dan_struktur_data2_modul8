package modul8tugas;

public class No1_app {
     public static void main(String[] args) {  
        No1 tree = new No1();
    
        No1_node node;
    
        node = new No1_node('D');
        tree.insert(node);
    
        node = new No1_node('B');
        tree.insert(node);
    
        node = new No1_node('A');
        tree.insert(node);
    
        node = new No1_node('C');
        tree.insert(node);
    
        node = new No1_node('F');
        tree.insert(node);
    
        node = new No1_node('E');
        tree.insert(node);
    
        node = new No1_node('G');
        tree.insert(node);
    
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder : ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        
        System.out.println("");
        System.out.println("Mukhammad ryantiarno priyadi");
    }   
    
}
