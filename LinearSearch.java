//liear serach algorithm
import java.util.Scanner;
public class LinearSearch{
    
 //function for linear search algorithm   
static int search(int[] arr, int n , int t){
    for(int i=0;i<n;i++){
        if (arr[i] == t)
            return i;
    }
    //if element is not found in the array then return -1
    return -1;
}


    public static void main(String[] args){
        int[] arr = {23,43,55,33,22};
        int n = arr.length;
        int target = 55;

        //call the linear search algorithm
        int index = search(arr, n, target);

        // print where the element is present
        System.out.println("your element is present at position " + index);
    }
}