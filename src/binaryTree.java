import java.util.Stack;

    public class binaryTree {
        private treeNode root;
        private class treeNode{
            private int data;
            private treeNode left;
            private treeNode right;
            treeNode(int data){
                this.data=data;
            }
        }
        public void createBinaryTree() {
            treeNode first = new treeNode(9);
            treeNode second = new treeNode(2);
            treeNode third = new treeNode(4);
            treeNode fourth = new treeNode(3);

            root = first;
            first.left=second;
            first.right=third;
            second.left=fourth;
        }
        // recursive preorder
        public void recPreorder(treeNode root){
            if(root==null){
                return;
            }
            System.out.print(root.data + " ");
            recPreorder(root.left);
            recPreorder(root.right);

        }
      /*  public void preOrder() {
            if (root == null) {
                return;
            }

            System.out.println("preorder");
            Stack<treeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                treeNode temp = stack.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
            }
        }*/

      /*  public void inOrder(){
            if(root==null){
                return;

            }
            System.out.println();
            System.out.println("inorder");
            Stack<treeNode> stack=new Stack<>();
            treeNode temp=root;
            while(!stack.isEmpty() || temp!=null){
                if(temp!=null) {
                    stack.push(temp);
                    temp = temp.left;
                }
                    else{
                        temp=stack.pop();
                    System.out.print(temp.data + " ");
                    temp=temp.right;

                    }
                }
            }*/
        // recursive inorder traversal
        public void inOrder(treeNode root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }

        public void postOrder(treeNode root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args) {
            binaryTree obj = new binaryTree();
            obj.createBinaryTree();
            // obj.preOrder();
            obj.recPreorder(obj.root);
            //  obj.inOrder();
            obj.inOrder(obj.root);

            obj.postOrder(obj.root);
        }
    }


