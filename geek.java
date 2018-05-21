
class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
class BST 
{
    Node root;
      
    Node lca(Node node, int n1, int n2) 
    {
        if (node == null)
            return null;
  
        if (node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);
  
        if (node.data < n1 && node.data < n2) 
            return lca(node.right, n1, n2);
  
        return node;
    }
  
    public static void main(String args[]) 
    {
        BST a = new BST();
        a.root = new Node(20);
        a.root.left = new Node(8);
        a.root.right = new Node(22);
        a.root.left.left = new Node(4);
        a.root.left.right = new Node(12);
        a.root.left.right.left = new Node(10);
        a.root.left.right.right = new Node(14);
  
        int n1 = 10, n2 = 14;
        Node t = a.lca(a.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

        n1 = 14;
        n2 = 8;
        t = a.lca(a.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
  
        n1 = 10;
        n2 = 22;
        t = a.lca(a.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
  
    }
}
  
