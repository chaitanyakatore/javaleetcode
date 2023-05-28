public class RecursionQuestion1{
    public static void main(String[] args){
        fun(5);
    }
    //this funtion returns the number from 5 to 1
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    //revere the above process by printing the number from 1 to 5
     static void funRev(int n){
        if(n==0){
            return;
        }
       
        funRev(n-1) ;
        System.out.println(n);
    }
    //factorial of the number 
    static void factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    //sum of n numbers
    static void sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }

    // for the sum of each digit of the number
   static int sumDigit(int n){
        if(n==0){
            return 0;
        }
    return  (n%10) + sumDigit(n/10);
    }
    static void reverse(int n){
        int sum = 0;
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

}