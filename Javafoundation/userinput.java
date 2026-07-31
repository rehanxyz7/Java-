import java.util.Scanner;
public class userinput{

    public static void main(String[]abd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NAME");

        String name = sc.nextLine();

        System.out.println("Hello " + name);

        int n;
         System.out.println("Enter a number ");

        n = sc.nextInt();
        System.out.println(n);
        sc.close();
    }
}