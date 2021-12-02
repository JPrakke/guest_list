import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] guests = new String[10];
    static boolean continueScript = true;
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        insertTestNames();
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
        System.out.println("2 - Insert Guests");
        System.out.println("2 - Rename Guests");
        System.out.println("3 - Remove Guests");
        System.out.println("4 - Quit Program\n");
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
                insertGuests();
                return false;
            case 3:
                renameGuests();
                return false;
            case 4:
                removeGuests();
                return false;
            case 5:
                System.out.println("Goodbye...");
                continueScript = false;
                return false;
            default:
                 System.out.println("You did not select a valid option.");
                 return true;
        }
    }
    public static void allGuests(){
        System.out.println("============================");
        System.out.println(" -- Guests --\n");
        boolean isEmpty = true;
        for(int i = 0;i<guests.length; i++){
            if(guests[i] != null){
                System.out.println((i+1) + ". "  + guests[i]);
                isEmpty = false;
            }
        }
        if(isEmpty){
            System.out.println("Guest list is empty.");
        }
    }
    public static void addGuests(){
        for(int i = 0; i<guests.length; i++){
            if(guests[i] == null){
                System.out.println("Please enter the guests information: ");
                guests[i] = sc.nextLine();
                break;
            }
        }
    }
    public static void insertGuests(){
        System.out.println("Enter the number where you want the new guest to be: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num >= 1 && num <= guests.length && guests[num-1] != null){
            System.out.println("What is the new name of the guest?");
            String newName = sc.nextLine();

            for(int i = guests.length-1; i>num-1; i--){
                guests[i]=guests[i-1];
            }
            guests[num-1] = newName;
        }else{
            System.out.println("\nError: There is no guest with that number.");
        }

    }
    public static void renameGuests(){
        System.out.println("Enter the number of a guest to rename: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num >= 1 && num <= guests.length && guests[num-1] != null){
            System.out.println("What is the new name of the guest?");
            String newName = sc.nextLine();
            guests[num-1] = newName;
        }else{
            System.out.println("\nError: There is no guest with that number.");
        }

    }
    public static void removeGuests(){
        System.out.println("Please enter the number of the guest you would like to remove: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num >= 1 && num <= guests.length && guests[num-1] != null){
            System.out.printf("Guest: %s was removed.\n", guests[num-1]);
            guests[num-1]= null;
            cleanArray();
        }else{
            System.out.println("\nError: There is no guest with that number.");
        }
    }
    public static void cleanArray(){
        String[] tempArr = new String[guests.length];
        int tempLoc = 0;
        for(int i = 0; i <guests.length; i++){
            if(guests[i] != null){
                tempArr[tempLoc] = guests[i];
                tempLoc ++;
            }
        }
        guests = tempArr;
    }
    public static void insertTestNames(){
        guests[0] = "Carl Sagan";
        guests[1] = "Neil Degrasse Tyson";
        guests[2] = "Bill Nye";
        guests[3] = "Nelson Mandela";
        guests[4] = "Stephen Hawking";
        guests[5] = "Anita Curey";
        guests[6] = "Grace Hopper";
        guests[7] = "Price William";
        guests[8] = "Prince Harry";
    }
}
