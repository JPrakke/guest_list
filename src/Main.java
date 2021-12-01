import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] guestList = new String[10];
    static boolean continueScript = true;
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        guestList[0] = "Carl Sagan";
        guestList[1] = "Neil Degrasse Tyson";
        guestList[2] = "Bill Nye";
        guestList[3] = "Nelson Mandela";
        guestList[4] = "Stephen Hawking";
        guestList[5] = "Anita Curey";
        guestList[6] = "Grace Hopper";
        guestList[7] = "Price William";
        guestList[8] = "Prince Harry";
        do {
            allGuests();
            displayMenu();
            getOption();
        } while (continueScript);
    }
    public static void displayMenu(){
        System.out.println("============================");
        System.out.println(" -- Menu --\n");
        System.out.println("1 - Add Guests");
        System.out.println("2 - Remove Guests");
        System.out.println("3 - Quit Program\n");
    }
    public static void getOption(){
        while (true) {
            System.out.println("\n Make a Selection: ");
            int optionSelect = Integer.parseInt(sc.nextLine());
            if (!selector(optionSelect)) {
                break;
            }
        }
    }
    public static boolean selector(int input){
        switch (input){
            case 1:
                addGuests();
                return false;
            case 2:
                removeGuests();
                return false;
            case 3:
                System.out.println("Goodbye...");
                continueScript = false;
                return false;
            default:
                 System.out.println("You did not select a valid option.");
                 return true;
        }
    }
    public static void allGuests(){
//        refactored to a turney statement
        System.out.println("============================");
        System.out.println(" -- Guests --\n");
        for(String name : guestList){
            System.out.println(name == null ? "--" : name);
        }
    }
    public static void addGuests(){
        for(int i = 0; i<guestList.length; i++){
            if(guestList[i] == null){
                System.out.println("Please enter the guests information: ");
                guestList[i] = sc.nextLine();
                break;
            }
        }
    }
    public static void removeGuests(){
        System.out.println("Please enter the guest you would like to remove: ");
        String input = sc.nextLine();
        for (int i = 0;i<guestList.length; i++){
            if(guestList[i] != null && guestList[i].toLowerCase().equals(input.toLowerCase())){
                guestList[i] = null;
                System.out.printf("%s has been removed.", input);
                break;
            }
        }
    }
}
