import java.util.scanner;
public class Array{
    public static void main(String[] args){
        int[] arr = {11,23,45,32};
        System.out.println(arr);

        //can change array element by just just using following syntax

        arr[0] = 1;

        //below code represents the length of the array
        System.out.println(arr.length);

        //declear array as follow

        //method 1:
        int[] rollno;
        rollno[1] =12;

        //method 2:
        int[] id = new int[5]; // here 5 is size of the array

        //input array using the loop

        Scanner sc = new Scanner(System.in);

        for(int i =0; i<id.length; i++){
            id[i]= sc.nextInt();
        }

        //output the array using the for loop
        for(int i =0 ;i<id.length; i++){
            System.out.print(id[i] + " ");
        }

        //output the array using for each loop
        for(int j : id){
            System.out.print(j + " ");
        }

        //output Array using the "toString" method
        System.out.print(Arrays.toString(id));


        //2D array or "MULTI DIMENSIONAL ARRAY"

        //defining the col size is not necesary
        int[][] array2D = new int[3][2];

        int[][] array2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        //taking the input from the user
        for(int row = 0; row < array2D.length;row++){
            for(int col=0; col < array2D[row].length; col++){
                array2D[row][col] = in.nextInt();
            }
        }

        //output the 2D arary
        for(int row = 0; row < array2D.length; row++){
            for(int col = 0; col < array2D[row].length: col++){
                System.out.println(arr[row][col] + " ");
            }
        }

    }
}