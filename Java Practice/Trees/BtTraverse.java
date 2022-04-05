package Trees;

final class BinaryTree {
    String value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree() {
    }

    BinaryTree(String value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

}

public class BtTraverse {

    public static void preOrder(BinaryTree bt) {
        if (bt != null) {
            System.out.print(bt.getValue());
            preOrder(bt.getLeft());
            preOrder(bt.getRight());
        }
    }

    public static void inOrder(BinaryTree bt) {
        if (bt != null) {
            inOrder(bt.getLeft());
            System.out.print(bt.getValue());
            inOrder(bt.getRight());
        }
    }

    public static void postOrder(BinaryTree bt) {
        if (bt != null) {
            postOrder(bt.getLeft());
            postOrder(bt.getRight());
            System.out.print(bt.getValue());
        }
    }

    public static void mirror(BinaryTree bt) {
        if (bt != null) {
            mirror(bt.getLeft());
            mirror(bt.getRight());
            BinaryTree temp = bt.getLeft();
            bt.setLeft(bt.getRight());
            bt.setRight(temp);
        }
    }

    public static int heightOfBt(BinaryTree bt) {
        if (bt == null) {
            return -1;
        } else {
            int L = heightOfBt(bt.getLeft());
            int R = heightOfBt(bt.getRight());
            if (L > R)
                return L + 1;
            return R + 1;
        }
    }

    public static int internalNodes(BinaryTree bt) {
        if (bt != null) {
            if (bt.getLeft() == null || bt.getRight() == null) {
                return 0;
            }
            return 1 + internalNodes(bt.getLeft()) + internalNodes(bt.getRight());
        }
        return 0;
    }

    public static int leafNodes(BinaryTree bt) {
        // int count = 0;
        // if (bt != null) {
        // if (bt.getLeft() == null && bt.getRight() == null) {
        // count = 1;
        // } else {
        // return count + leafNodes(bt.getLeft()) + leafNodes(bt.getRight());
        // }
        // }
        // return count;
        if (bt != null) {
            if (bt.getLeft() == null && bt.getRight() == null) {
                return 1;
            } else {
                return leafNodes(bt.getLeft()) + leafNodes(bt.getRight());
            }
        }
        return 0;
    }

    public static int totalNodes(BinaryTree bt) {
        if (bt != null) {
            return 1 + totalNodes(bt.getLeft()) + totalNodes(bt.getRight());
        }
        return 0;
    }

    public static int strictBt(BinaryTree bt) {
        if (bt != null) {
            int l = strictBt(bt.getLeft());
            int r = strictBt(bt.getRight());
            if (bt.getLeft() == null && bt.getRight() == null)
                return 1;
            else {
                return l * r;
            }
        }
        return 0;
    }

    public static boolean identicalStructureBt(BinaryTree bt1, BinaryTree bt2) {
        if (bt1 == null && bt2 == null) {
            // System.out.println("true");
            return true;
        }
        if (bt1 != null && bt2 != null) {
            // if (bt1.getValue().equals(bt2.getValue())) {
            boolean l = identicalStructureBt(bt1.getLeft(), bt2.getLeft());
            boolean r = identicalStructureBt(bt1.getRight(), bt2.getRight());
            // System.out.println(l && r);
            return l && r;
            // }
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree("A",
                new BinaryTree("B", new BinaryTree("D", null, null), new BinaryTree("E", null, null)),
                new BinaryTree("C", null, null));
        BinaryTree bt2 = new BinaryTree("A",
                new BinaryTree("B", new BinaryTree("D", null, null), new BinaryTree("E", null, null)),
                new BinaryTree("C", null, null));

        preOrder(bt);
        System.out.println();
        inOrder(bt);
        System.out.println();
        postOrder(bt);
        System.out.println("\nMirror!\n");
        inOrder(bt);
        System.out.println();
        mirror(bt);
        inOrder(bt);
        System.out.println();
        int height = heightOfBt(bt);
        System.out.println("height " + height);
        int internalNodes = internalNodes(bt);
        System.out.println("internalNodes " + internalNodes);
        int leafNodes = leafNodes(bt);
        System.out.println("leafNodes " + leafNodes);
        int totalNodes = totalNodes(bt);
        System.out.println("totalNodes " + totalNodes);
        int strictBt = strictBt(bt);
        System.out.println("strictBt " + strictBt);
        boolean identicalStructureBt = identicalStructureBt(bt, bt2);
        System.out.println("identicalStructureBt " + identicalStructureBt);

    }
}
