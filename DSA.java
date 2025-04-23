class dll {
    Node root;

    static class Node {
        int data;
        Node left, right;
    
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);    // Left
        System.out.print(node.data + " "); // Root
        inorderTraversal(node.right);   // Right
    }

    public static void main(String[] args) {
        dll tree = new dll();

        // Create tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);
    }
}




class dll {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    public static int NofNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + NofNodes(root.left) + NofNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("no of nodes of tree are: " + NofNodes(root));
    }
}








class dll {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    public static boolean search(TreeNode root,int k){
        if(root==null)return false;
        if(root.data==k)return true;
        return search(root.left,k)||search(root.right,k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);

        root.left = new TreeNode(5);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(112);
        root.left.right = new TreeNode(5);

        System.out.println("Is 3 in Tree: " + search(root,3));
        System.out.println("Is 19 in Tree: " + search(root,19));
    }
}






class dll {
        static class TreeNode {
            int data;
            TreeNode left, right;
    
            TreeNode(int val) {
                data = val;
                left = right = null;
            }
        }
        public static void printLevel(TreeNode root,int k){
            if(root==null)return;
            if(k==1){
                System.err.println(root.data+ " ");
            }
            else{
                printLevel(root.left, k-1);
                printLevel(root.right, k-1);
            }
        }
    
        public static void main(String[] args) {
            TreeNode root = new TreeNode(10);
    
            root.left = new TreeNode(20);
            root.right = new TreeNode(30);
            root.left.left = new TreeNode(40);
            root.left.right = new TreeNode(50);
    
            System.out.println("Nodes at level 2: ");
            printLevel(root,2);
        }
    }


//max value
class dll {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    public static int findMax(TreeNode root){
        if(root==null)return Integer.MIN_VALUE;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data,Math.max(leftMax,rightMax));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        System.out.println("Maximun value: "+ findMax(root));
       
    }
}





//leaf node 
class dll {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    public static int countLeave(TreeNode root){
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return 1;
        return countLeave(root.left)+countLeave(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        System.out.println("no of leaf nodes: "+ countLeave(root));
       
    }
}







//find total sum of all node value in the tree
class dll {
    Node root;
    int sum =0;
    static class Node {
        int data;
        Node left, right;
    
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);    // Left
        System.out.print(node.data + " ");
        sum += node.data; // Root
        inorderTraversal(node.right);   // Right
    }

    public static void main(String[] args) {
        dll tree = new dll();

        // Create tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nSum of all nodes: " + tree.sum);
    }
}







///traverse a binary tree in postorder(lrv)
class dll {
    Node root;

    static class Node {
        int data;
        Node left, right;
    
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    void postorderTraversal(Node node) {
        if (node == null)
            return;

        postorderTraversal(node.left); 
        postorderTraversal(node.right);   // Left
        System.out.print(node.data + " "); // Root
        // inorderTraversal(node.right);   // Right
    }

    public static void main(String[] args) {
        dll tree = new dll();

        // Create tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("postorder traversal:");
        tree.postorderTraversal(tree.root);
    }
}





//insert a new node in the first available position
class dll {
    Node root;
    boolean inserted = false; // flag to stop once inserted

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Get height of tree
    int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Try inserting at a specific level
    void insertAtLevel(Node node, int level, int data) {
        if (node == null || inserted) return;

        if (level == 1) {
            if (node.left == null) {
                node.left = new Node(data);
                inserted = true;
            } else if (node.right == null) {
                node.right = new Node(data);
                inserted = true;
            }
        } else {
            insertAtLevel(node.left, level - 1, data);
            insertAtLevel(node.right, level - 1, data);
        }
    }

    // Main insert method (without queue)
    void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        int h = height(root);
        for (int i = 1; i <= h; i++) {
            insertAtLevel(root, i, data);
            if (inserted) break;
        }
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        dll tree = new dll();

        // Build initial tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder before insertion:");
        tree.inorder(tree.root);

        tree.insert(6); // inserting new node

        System.out.println("\nInorder after inserting 6:");
        tree.inorder(tree.root);
    }
}