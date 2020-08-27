import java.util.HashMap;
import java.util.Scanner;

public class hashMap {

    public static void login(String phonenumber,Integer otp){
        HashMap<String, Integer> dataBase= new HashMap<String, Integer>();
        dataBase.put("9810884413", 123);
        dataBase.put("9810084432", 234);
        dataBase.put("9810084436", 345);
        dataBase.put("9810084423", 456);
        dataBase.put("9810084412", 567);


        if(dataBase.get(phonenumber)==otp){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Unsuccessful");
        }
    }
    public static void main(String[] args) {
        login("9810884413", 123);
        login("9810087899", 678);




    }

}
