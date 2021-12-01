import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] guestList = new String[1000];
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
            System.out.println("\n1 - Display All Guests");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Quit Program");
            while (true) {
                System.out.println("\n Make a Selection: ");
                int optionSelect = Integer.parseInt(sc.nextLine());
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
                addGuests(guestList);
                return false;
            case 3:
                removeGuests(guestList);
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
            if(name == null){
                System.out.println("--");
            }else System.out.println(name);
        }
    }
    public static void addGuests(String[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == null){
                System.out.println("Please enter the guests information: ");
                arr[i] = sc.nextLine();
                break;
            }
        }
    }
    public static void removeGuests(String[] arr){
        System.out.println("Please enter the guest you would like to remove: ");
        String input = sc.nextLine();
        for (int i = 0;i<arr.length; i++){
            System.out.println(arr[i]);
            System.out.println(input);
            if(arr[i] != null && arr[i].toLowerCase().equals(input.toLowerCase())){
                arr[i] = null;
                System.out.printf("%s has been removed.", input);
                break;
            }
        }
    }
}
