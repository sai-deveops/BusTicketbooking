import java.util.Scanner;

public class BusTicketBooking {

    static int totalSeats = 10;
    static boolean[] seats = new boolean[totalSeats];

    public static void displaySeats() {
        System.out.println("\nSeat Status:");
        for (int i = 0; i < totalSeats; i++) {
            System.out.println("Seat " + (i + 1) + " : " +
                    (seats[i] ? "Booked" : "Available"));
        }
    }

    public static void bookSeat(int seatNo) {
        if (seatNo < 1 || seatNo > totalSeats) {
            System.out.println("Invalid seat number!");
        } else if (seats[seatNo - 1]) {
            System.out.println("Seat already booked!");
        } else {
            seats[seatNo - 1] = true;
            System.out.println("Seat " + seatNo + " booked successfully.");
        }
    }

    public static void cancelSeat(int seatNo) {
        if (seatNo < 1 || seatNo > totalSeats) {
            System.out.println("Invalid seat number!");
        } else if (!seats[seatNo - 1]) {
            System.out.println("Seat is not booked.");
        } else {
            seats[seatNo - 1] = false;
            System.out.println("Booking cancelled for Seat " + seatNo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== BUS TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displaySeats();
                    break;

                case 2:
                    System.out.print("Enter Seat Number to Book: ");
                    int bookSeatNo = sc.nextInt();
                    bookSeat(bookSeatNo);
                    break;

                case 3:
                    System.out.print("Enter Seat Number to Cancel: ");
                    int cancelSeatNo = sc.nextInt();
                    cancelSeat(cancelSeatNo);
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
