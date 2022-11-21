import java.util.Scanner;

public class MenuDriven2 {
    public static void main(String[] args) {
        int a, b, c, smallest;
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.for Largest of 3");
            System.out.println("2.for Smallest of 3");
            System.out.println("3.Prime or not");
            System.out.println("4.Even or not");
            System.out.println("Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the 1st number : ");
                    a = sc.nextInt();
                    System.out.println("Enter 2nd number : ");
                    b = sc.nextInt();
                    System.out.println("Enter 3rd number : ");
                    c = sc.nextInt();
                    if (a > b) {

                        if (a > c) {
                            System.out.println(" " + a);
                        } else {
                            System.out.println(" " + c);
                        }
                    } else {
                        if (b > c) {
                            System.out.println(" " + b);
                        } else {
                            System.out.println(" " + c);
                        }
                    }

                case 2:
                    System.out.println("Enter the 1st number : ");
                    a = sc.nextInt();
                    System.out.println("Enter 2nd number : ");
                    b = sc.nextInt();
                    System.out.println("Enter 3rd number : ");
                    c = sc.nextInt();
                    smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
                    System.out.println("The smallest number is: " + smallest);

                case 3:
                    boolean flag = true;
                    System.out.println("Enter a number : ");
                    a = sc.nextInt();
                    for (int i = 2; i <= a / 2; i++) {
                        if (a % i == 0) {
                            flag = false;
//                            System.out.println("It is prime " + a);
                            break;
                        }
                    }
                    if (flag == false)
                        System.out.println("Not prime");
                    else
                        System.out.println("Prime");

            }
        }
    }}
