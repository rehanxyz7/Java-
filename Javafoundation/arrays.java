import java.util.Scanner;
public class arrays {

    public static void main(String[] args) {
      //  int [] arr = {44,43,5,6,8,33};
      //  System.out.println(arr[0]);
       // System.out.println(arr[1]);
       // System.out.println(arr[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the element "+i);
            arr[i]= sc.nextInt();
        }
        System.out.println("Printing the entered array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
         sc.close();
    }
    
}
