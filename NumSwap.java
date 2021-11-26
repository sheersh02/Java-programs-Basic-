import java.util.Scanner;

class NumSwap {
    public static void main(String args[]) {
        int num1, num2, temp;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        num1 = scan.nextInt();

        System.out.println("Enter the second number");
        num2 = scan.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped number  " + num1);
        System.out.println("The swaped number  " + num2);
    }
}