public class BinarySearchTree {
    BinarySearchTreeNode root;

    public  BinarySearchTree(){
        root = null;
    }

    public void addNewNode(int info){
        BinarySearchTreeNode temp = root;
        if(root == null){
            root = new BinarySearchTreeNode(info,null,null);
        }
        else {
            while (true) {
                if (temp.getInfo() > info && temp.left != null) {
                    temp = temp.left;
                } else if (info >= temp.getInfo() && temp.right != null) {
                    temp = temp.right;
                } else if (info < temp.getInfo()) { // temp.left is null
                    temp.left = new BinarySearchTreeNode(info, null, null);
                    break;
                } else if (info >= temp.getInfo()) {
                    temp.right = new BinarySearchTreeNode(info, null, null);
                    break;
                }
            }
        }
    }

    public BinarySearchTreeNode search(int key){
        BinarySearchTreeNode temp = root;
        while(temp != null && temp.getInfo() != key){
            if(key < temp.getInfo()){
                temp=temp.left;
            }
            else{
                temp= temp.right;
            }
        }
        return temp;
    }
}
