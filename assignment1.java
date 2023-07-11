import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five integers:");
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }
        System.out.println("The sum of the numbers is: " + total);
        sc.close();
    }
}
