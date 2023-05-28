import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num < 10){
            System.out.println("Number is less than 10");
        }
        else{
            System.out.println("number is greater than 10")
        }
    }
}