import java.util.*;
class Main{static class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
    this.value = value;
  }
  }
           
  public static boolean search(Node root , int key){
    if(root==null){
      return false;
    }
    if(root.value > key){
      return search(root.left,key);
    }
    else if(root.value < key){
      return search(root.right,key);
    }
    else{
      return true;
    }
  }

  public static Node insert(Node root, int val){
    if(root==null){
      root = new Node(val);
      return root;
    }
    if(root.value > val){
      root.left = insert(root.left,val);
    }
    else{
      root.right = insert(root.right,val);
    }
    return root;
  }

  public static void inOrder(Node root){
    if(root == null){
      return ;
    }
    inOrder(root.left);
    System.out.print(root.value+ " ");
    inOrder(root.right);
  }

  public static Node delete(Node root, int val){
    if(root.value > val){
       root.left = delete(root.left,val);
    }
    else if(root.value < val){
      root.right = delete(root.right,val);
    }
    else{
       if(root.left==null && root.right==null){
       return null;
       }
      if(root.left==null){
        return root.right;
      }
      if(root.right==null){
        return root.left;
      }
      Node IS = inorderSuccesor(root.right);
      root.value = IS.value;
      root.right = delete(root.right,IS.value);
      
    }
    return root;    
  }

  public static Node inorderSuccesor(Node root){
    while(root.left!=null){
      root = root.left;
    }
    return root;
  }
  
  public static void main(String[] args){
    int[] arr = {4,6,2,7,9,3,22,34};
    Node root = null;

    for(int i = 0 ; i < arr.length; i++){
      root = insert(root,arr[i]);
    }
    inOrder(root);
    System.out.println();

    if(search(root,3)){
      System.out.println("found");
    }
    else{
      System.out.println("not found");
    }
    delete(root,7);
    inOrder(root);
  }

}
