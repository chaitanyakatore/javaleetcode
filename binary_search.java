import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //input length of the arr
    System.out.println("enter the size of the array");
    int n = sc.nextInt();

    //user input of the element of the array
    System.out.println("enter the element of the array");
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    //target elemetn of the array
    System.out.println("enter the elemnt you have to search");
    int target = sc.nextInt();
    System.out.println(search(arr,target,0,arr.length-1));
  
     }
    
  //Binary search using the recursion
  static int search(int[] arr, int target, int s, int e){
    if(s>e){
      return -1;
    }
    int mid = (s + (e-s)/2);
    if(arr[mid]==target){
      return mid;
    }
    
    if(target<mid){
      return search(arr,target,s,e);
    }
    else{
      return search(arr, target, mid+1, e);
    }
  }
  
}
