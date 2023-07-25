import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pin=8844;
        Scanner in=new Scanner(System.in);
        atmMissionOperation atmMissionOperation=new atmMissionOperation();
        System.out.println("Enter your Name :");
        String name=in.nextLine();
        System.out.println("Enter your pin number :");
        int password=in.nextInt();
        if(pin==password){
            System.out.println("Welcome "+name+" to our ATM!");
            while (true){
                atm.menu();
                System.out.println("Enter your choice :");
                int choice=in.nextInt();
                switch (choice){
                    case 1:
                        atmMissionOperation.balance();
                        break;
                    case 2:
                        atmMissionOperation.deposit();
                        break;
                    case 3:
                        atmMissionOperation.withdraw();
                        break;
                    case 4:
                        atmMissionOperation.miniStmt();
                        break;
                    case 5:
                        System.out.println("Collect Your Card!!! \n Thank You!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter Correct choice !");
                        break;
                }
            }
        }
        else {
            System.out.println("Incorrect Username or Password!!!");
        }
    }
}