import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {4,6,3,2,7,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
    //last size is arr.length-i-1 because it is getting less one by one and max element come to end;
        int last = arr.length - i -1;        
        int maxIndex = getmaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
        }

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}