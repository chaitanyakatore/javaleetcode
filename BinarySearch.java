import java.util.Scanner;

public class BinarySearch{

    static int search(int[] arr, int start, int end, int target){
        while(start < end){
        int mid = (start + (end-start));

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid] > target){
            return search(arr, start, mid-1,target);
        }
        else{
            return search(arr,mid+1,end,target);
        }

      }
      return -1;
    }

    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};
    int target = 3;
    int end = arr.length-1;
    int ans = search(arr,0,end,target);

    System.out.println(target + " element is present at index " + ans);


    }

}