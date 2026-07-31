import java.util.Scanner;
public class loginsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String userName = sc.nextLine();

        System.out.println("Enter your password : ");
        String password= sc.nextLine();

        if(userName.equals("admin")){
            if(password.equals("java123")){
                System.out.println("Login Successful");
            }
        }
        else{
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
}
