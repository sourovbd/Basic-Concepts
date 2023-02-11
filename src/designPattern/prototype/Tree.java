package designPattern.prototype;

public class Tree implements Cloneable{
    public Tree copy() {
        try {
            return (Tree) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        Tree tree = new Tree();
        Tree tree1 = tree.copy();

        PlasticTree plasticTree = new PlasticTree(1, 2);
        Tree tree2 = plasticTree.copy();

        PineTree pineTree = new PineTree(3,4);
        Tree tree3 = pineTree.copy();

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }

    @Override
    public String toString() {
        return "Tree{}";
    }
}
