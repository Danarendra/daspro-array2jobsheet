import java.util.Scanner;
public class CinemaWithScanner19Modify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int choice;
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            if (choice == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    int row, column;
                    boolean validSeat = false;
                    
                    while (!validSeat) {
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine(); 
                        
                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("Invalid seat number.");
                            continue;
                        }
                        
                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("This seat is already occupied.");
                            continue;
                        }
                        
                        audience[row - 1][column - 1] = name;
                        validSeat = true;
                    }
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (choice == 2) {
                System.out.println("\nAudience List:");
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        String seat = audience[i][j] == null ? "***" : audience[i][j];
                        System.out.println("Row " + (i+1) + " Column " + (j+1) + ": " + seat);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exitting.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close(); 
    }
}

