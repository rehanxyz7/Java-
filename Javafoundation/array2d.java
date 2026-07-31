import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        int x = sc.nextInt();
         System.out.println("Enter the no of col ");
        int y= sc.nextInt();
        int [][]  arr = new int[x][y];

        System.out.println("Enter the array elements ");
        for(int i=0;i<x;i++){
            for(int k=0;k<y;k++){
                System.out.println("Enter array element "+ i + k);
                arr[i][k]= sc.nextInt();
            }
        }

        System.out.println("Printing the array ");
        for(int i=0;i<x;i++){
            for(int k=0;k<y;k++){
                System.out.print(arr[i][k]);
                
        }

    }

    sc.close();
}
}
