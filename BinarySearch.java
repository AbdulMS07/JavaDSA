import java.util.*;
//BinarySearch through inOrder Traversel
//visit left node
//visit root node
//visit right node

public class BinarySearch{

  class Node{
    int key;
    Node right,left;
    public Node(int item){
      key=item;
      left=null;
      right=null;
    }
  }

  Node root;
  BinarySearch(){
    root=null;
  }
  //to return as tree
  void insert(int key){
    root = insertRec(root,key);
  }
  //to create node and detect the location of the node to be inserted
  Node insertRec(Node root,int key){
    //If the tree was empty,or It was the first node to be inserted
    if(root == null){
      root = new Node(key);
      return root;
    }
    if(key < root.key){
      root.left = insertRec(root.left,key);
    }
    else{
      root.right = insertRec(root.right,key);
    }
    return root;
  }
//Inorder traversal
  void inOrder(){
      inOrderRec(root);
  }
  //inorder traversal using recursive
  void inOrderRec(Node root){
    if(root != null){
      inOrderRec(root.left);
      System.out.println(root.key);
      inOrderRec(root.right);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinarySearch bs= new BinarySearch();
    System.out.println("Enter the number of elements: ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Creating BST....");
    //inserting elements into the tree
    for(int i=0;i<n;i++){
      bs.insert(arr[i]);
    }
    System.out.println("BS Tree created Successfully...");
      //display the inserted elements
    bs.inOrder();
  }
}
