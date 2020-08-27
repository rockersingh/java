import java.util.Scanner;

public class CheckaAge {

    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access denied! You must be 18 years old!");
        }
        else{
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int x= sc.nextInt();

        int data=9/0;
        System.out.println(data);

        checkAge(x);
    }
}
