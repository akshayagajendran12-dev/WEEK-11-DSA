import java.util.Scanner;

public class Problem3_LibraryBookShelf {

    static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;

            System.out.print("After placing " + key + ": ");
            printArray(books);
        }
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] books = new int[n];

        System.out.println("Enter book numbers:");
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        shelf(books);
        sc.close();
    }
}
