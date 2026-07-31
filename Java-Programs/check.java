 import java.util.Scanner;
public class check {
   
    public static void main(String[] args) {
        System.out.println("Enter  a number to check whether positive or neagtive");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("negative");
        }
        else if(n>0){
            System.out.println("Positive");

        }
        else{
            System.out.println("Zero");

        }
        sc.close();
    }
    
}
