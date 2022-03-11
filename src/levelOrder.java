
import java.util.Queue;
import java.util.LinkedList;
public class levelOrder{
        private treeNode root;
        private class treeNode{
            private int data;
            private treeNode left;
            private treeNode right;

            public treeNode(int data){
                this.data=data;
            }
        }
        public void createBT(){
            treeNode first=new treeNode(1);
            treeNode second=new treeNode(2);
            treeNode third=new treeNode(3);
            treeNode fourth=new treeNode(4);
            treeNode fifth=new treeNode(5);
            treeNode sixth=new treeNode(6);
            treeNode seventh=new treeNode(7);
            root=first;
            first.left=second;
            first.right=third;
            second.left=fourth;
            second.right=fifth;
            third.left=sixth;
            third.right=seventh;
        }
        public void levelOrder(){
            if(root==null){
                return;
            }
            Queue<treeNode>queue=new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                treeNode temp=queue.poll();
                System.out.print(temp.data+ " ");
                if(temp.left!=null){
                    queue.offer(temp.left);

                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }

        public static void main(String[] args) {
            levelOrder obj=new levelOrder();
            obj.createBT();
            obj.levelOrder();
        }
    }



