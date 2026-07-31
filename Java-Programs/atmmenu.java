import java.util.Scanner;
public class atmmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=300000, withdraw, deposit;
        System.out.println("WELCOME TO ATM MENU");
        System.out.println("1. Check balance\n 2. Deposit\n 3. Withdraw \n 4. Exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(balance);
                break;
            case 2:
                System.out.println("Enter the amount to deposit");
                deposit = sc.nextInt();
                balance+= deposit;
                System.out.println("The current balance is "+ balance);
                break;
            case 3:
                System.out.println("Enter the amount to be withdrawn : ");
                withdraw = sc.nextInt();
                balance-=withdraw;
                System.out.println("The current balance is "+ balance);
                break;
            default:
                System.out.println("Exiting ");
                break;
        }
        sc.close();
    }
    
}
