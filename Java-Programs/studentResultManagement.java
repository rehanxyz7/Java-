import java.util.Scanner;
public class studentResultManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students name :");
        String name = sc.nextLine();
        int n =5;
        double[] arr = new double [5];

        double totalMarks =0;
         String grade;
       
        System.out.println("Enter the marks of the student for 5 subjects :");
       
        for(int i =0;i<5;i++){
            System.out.println("Enter the marks for subject " + (i+1));
            arr[i]= sc.nextDouble();
         totalMarks += arr[i];
        }
        double percentage = ((totalMarks/500)*100);
        if(percentage>=90){
             grade = "A";
        }
        else if(percentage>=60 && percentage<=90){
            grade = "B";
        }
        else if(percentage>=40 && percentage<=60){
            grade = "C";
        }
        else if(percentage>=20 && percentage<=40){
            grade = "D";
        }
        else{
            grade = "F";
        }

       int choice;
        do{
             System.out.println("----MENU----\n 1. View Result\n 2. View Grade\n 3. View Percentage\n 4.Exit");
             choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("The result of " +name+ "is : " + totalMarks+"/500");
                break;
            case 2:
                System.out.println("The grade of the student named : "+name+ "is : "+grade);
                break;
            case 3:
                System.out.println("The percentage of the student named : " +name+ "is :"+percentage);
                break;
            case 4:
                System.out.println("Exiting ");
                break;
                }
        }
        while(choice!=4);
        sc.close();
        
    }
}

