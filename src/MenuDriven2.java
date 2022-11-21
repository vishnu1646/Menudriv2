import java.util.Scanner;

public class MenuDriven2 {
    public static void main(String[] args) {
int a,b,c;
int choice;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.for Largest of 3");
            System.out.println("2.for Smallest of 3");
            System.out.println("3.Prime or not");
            System.out.println("4.Even or not");
            System.out.println("Exit");
            choice =sc.nextInt();

switch (choice) {
    case 1:
        System.out.println("Enter the 1st number : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        c = sc.nextInt();
        if (a > b) {

            if(a>c){
                System.out.println(" "+a);
            }else {
                System.out.println(" "+c);
            }
        }else {
            if (b > c) {
                System.out.println(" "+b);
            }else {
                System.out.println(" "+c);
            }
        }

        }
}
        }
    }

