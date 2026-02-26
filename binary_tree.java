class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class Root_methods{
    Node root;
    void insert(int data){
        root=insertdata(root,data);
    }
    Node insertdata(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        if(data<root.data){
            root.left=insertdata(root.left,data);
        }
        else if(data>root.data){
            root.right=insertdata(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
    void search(Node root,int data){
        if(root==null){
            System.out.println("Element not found");
            return;
        }
        if(root.data==data){
            System.out.println("Element found");
            return;
        }
        if(data<root.data){
            search(root.left,data);
        }
        else{
            search(root.right,data);
        }
    }
}
class binary_tree{
    public static void main(String[] args) {
        Root_methods r=new Root_methods();
        r.insert(10);
        r.insert(5);
        r.insert(15);
        r.insert(3);
        r.insert(7);
        r.insert(12);
        r.insert(18);
        r.search(r.root,2);
    }
}