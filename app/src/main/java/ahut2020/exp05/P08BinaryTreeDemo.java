package ahut2020.exp05;

public class P08BinaryTreeDemo {
    static class BinaryTree {
        char root;
        BinaryTree left, right;

        public BinaryTree(char root) {
            this(root, null, null);

        }

        public BinaryTree(char root, BinaryTree left, BinaryTree right) {
            this.root = root;
            this.left = left;
            this.right = right;
        }

        static BinaryTree create(String pre, String mid) {
            if (pre.length() == 0) return null;
            if (pre.length() == 1) return new BinaryTree(pre.charAt(0));
            char root = pre.charAt(0);
            int pos = mid.indexOf(root);
            String leftMid = mid.substring(0, pos);
            String rightMid = mid.substring(pos + 1);
            String leftPre = pre.substring(1, pos + 1);
            String rightPre = pre.substring(pos + 1);
            BinaryTree left = create(leftPre, leftMid);
            BinaryTree right = create(rightPre, rightMid);
            return new BinaryTree(root, left, right);
        }

        void postVisit() {
            if (left != null)
                left.postVisit();
            if (right != null)
                right.postVisit();
            System.out.print(root);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree=BinaryTree.create("ABFCDGHEI","BFAGDHCIE");
        tree.postVisit();
    }
}
//## 8. 输出二叉树
//
//我们知道二叉树的先序序列和中序序列或者是中序和后序能够唯一确定一颗二叉树。现在给一颗二叉树的先序序列和中序序列，要求输出它的后序序列。
//
//输入
//多组测试数据，每组测试数据格式如下：
//第一行为先序序列
//第二行为中序序列
//
//输出
//输出该二叉树的后序序列。
//
//样例输入
//ABFCDGHEI
//BFAGDHCIE
//样例输出
//FBGHDIECA