import java.util.scanner;

public class WhileLoop{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num>0){
            System.out.print(num);
            num--;
        }
    }
}