public class searchKeyBST {
    private treeNode root;
    private class treeNode{
        private int data;
        private treeNode left;
        private treeNode right;
        public treeNode(int data){
            this.data=data;
        }
    }
    public void insert(int value) {
        root = insert(root, value);
    }

    public treeNode insert(treeNode root, int value) {
        if (root == null) {
            root =  new treeNode(value);
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



    public treeNode search(treeNode root,int key)
    {
        if(root==null|| root.data==key)
        {
            return root;
        }
        if(key<root.data){
            return search(root.left,key);

        }
        else{
            return search(root.right,key);
        }
    }




    public static void main(String[] args) {
        searchKeyBST obj=new searchKeyBST();
        obj.insert(7);
        obj.insert(5);
        obj.insert(3);
        obj.insert(4);
        obj.inOrder(obj.root);
        System.out.println();
      if(null!=obj.search(obj.root,3)){
          System.out.println("key found");
      }
      else{
          System.out.println("key not found");
      }
    }
}
