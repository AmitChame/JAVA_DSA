/*public class Star {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
public class S {
    public static void main(String[] args) {
        int rows = 5; // You can change this value for more rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star on same line
            }
            System.out.println(); // Move to the next line
        }
    }
}
