import java.util.Scanner;

class Discount {
    public static void main(String args[]) {
        double price, quantity, total, discount, discounted;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter price of the product");
        price = scan.nextInt();

        System.out.println("enter quantity of the product");
        quantity = scan.nextInt();

        total = price * quantity;
        System.out.println("The total for order is" + total);

        if (total > 2000) {
            discount = total * 0.1;
            discounted = total - discount;
            System.out.println("The discounted price is  " + discounted);
        } else {
            System.out.println("not eligible for discount");
        }
    }
}