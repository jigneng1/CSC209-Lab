public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.addNewNode(50);
        System.out.println(tree1.root.getInfo());
        tree1.addNewNode(20);
                        //50
        //20
        System.out.println(tree1.root.left.getInfo());
        tree1.addNewNode(40);
                        //50
        //20
                //40
        System.out.println(tree1.root.left.right.getInfo());

        tree1.addNewNode(100);
        tree1.addNewNode(150);
        tree1.addNewNode(1000000);
        tree1.addNewNode(50);
                //50
        //20            100
            //40       50     150
                                //1000000
        BinarySearchTreeNode x = tree1.search(150);
        if(x != null){
            System.out.println("Found "+ x.getInfo());
        }
        else{
            System.out.println("not found");
        }
    }

}
