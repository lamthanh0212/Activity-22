package homework;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int n = scanner.nextInt();
        System.out.println( + (n) +("+") + ((n*10) + (n)) +("+") + ((n*100)+(n*10)+(n))  +("=") +((n)+((n*10) + (n))+((n*100)+(n*10)+(n))) );
    }
}
