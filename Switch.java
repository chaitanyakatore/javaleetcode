import java.util.Scanner;

public class Switch{

    Scanner sc = new Scanner(System.in);

    //input your age
    int age = sc.nextInt();

    Switch (age){

        //if your age is less than 18 
        case (age <18):
            System.out.println("unable to vote");
            break;

        case (age==18);
            System.out.println("you can vote from now");
            break;

        case (age > 18):
            System.out.println("you are able to vote");
            break;
        default:
            System.out.println("you should make voter id")
    }
}