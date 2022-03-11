public class maxValueBinary {
    private treeNode root;

    private class treeNode {
        private int data;
        private treeNode left;
        private treeNode right;

        public treeNode(int data) {
            this.data = data;
        }
    }

    public void createBTT() {
        treeNode first = new treeNode(1);
        treeNode second = new treeNode(2);
        treeNode third = new treeNode(8);
        treeNode fourth = new treeNode(9);
        treeNode fifth = new treeNode(3);
        treeNode sixth = new treeNode(10);
        treeNode seventh = new treeNode(4);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public int findMax(treeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result) {
            return left;
        }
            if (right > result) {
                return right;
            }
            return result;
        }




    public static void main(String[] args) {
        maxValueBinary obj = new maxValueBinary();
        obj.createBTT();
        obj.findMax(obj.root);
    }
}


