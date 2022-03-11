public class binarySearchTree {
    private treeNode root;

    private class treeNode {
        private int data;
        private treeNode left;
        private treeNode right;

        public treeNode(int data) {
            this.data = data;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public treeNode insert(treeNode root, int value) {
        if (root == null) {
            root = new treeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public void inorder(){
        inOrder(root);
    }
    public void inOrder(treeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }




    public static void main(String[] args) {
        binarySearchTree obj = new binarySearchTree();

        obj.insert(7);
        obj.insert(5);
        obj.insert(3);
        obj.insert(4);
        obj.inOrder(obj.root);
    }
}

