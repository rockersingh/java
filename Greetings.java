import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 24");
        int x= sc.nextInt();
        if(x<=12){
            System.out.println("Good morning");
        }
        else if(x>12 && x<18 ){
            System.out.println("Good afternoon");
        }
        else{
            System.out.println("Good night");
        }


    }
}
