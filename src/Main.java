import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int position;
        int number;
        int[] arr;
        int size;

        System.out.println("Enter the array size:");
        size = sc.nextInt();
        arr = new int[size + 1];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i + 1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Array now:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the position to add number:");
        position = sc.nextInt();
        System.out.println("Enter the number to add:");
        number = sc.nextInt();
        for (int i = arr.length - 1; i != position - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = number;

        System.out.println("Array after replacing:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}