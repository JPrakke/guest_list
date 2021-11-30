import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        System.out.println("1 - Display All Guests");
        System.out.println("2 - Add Guests");
        System.out.println("3 - Remove Guests");
        while(true){
            System.out.println("\n Make a Selection: ");
            int optionSelect = sc.nextInt();
            if(!selector(optionSelect)){
                break;
            }
        }
    }
    public static boolean selector(int input){
        switch (input){
            case 1:
                System.out.println("you selected option 1");
                return false;
            case 2:
                System.out.println("you selected option 2");
                return false;
            case 3:
                System.out.println("you selected option 3");
                return false;
            default:
                 System.out.println("You did not select a valid option.");
                 return true;
        }
    }
}
