import java.util.Scanner;

class Alice_Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of apples needed: ");
        int n = sc.nextInt();
        int total = 0, k = 0;
        while (total < n) {
            k++;
            total += 12 * k * k;
        }
        System.out.println("Minimum Perimeter: " + 8*k);
    }
}
