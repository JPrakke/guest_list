import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] guestList = new String[1000];
    static boolean continueScript = true;
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        do {
            System.out.println("\n1 - Display All Guests");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Quit Program");
            while (true) {
                System.out.println("\n Make a Selection: ");
                int optionSelect = sc.nextInt();
                if (!selector(optionSelect)) {
                    break;
                }
            }
        } while (continueScript);
    }
    public static boolean selector(int input){
        switch (input){
            case 1:
                allGuests(guestList);
                return false;
            case 2:
                System.out.println("you selected option 2");
                return false;
            case 3:
                System.out.println("you selected option 3");
                return false;
            case 4:
                System.out.println("Goodbye...");
                continueScript = false;
                return false;
            default:
                 System.out.println("You did not select a valid option.");
                 return true;
        }
    }
    public static void allGuests(String[] arr){
        for(String name : arr){
            System.out.println(name);
        }
    }
}
