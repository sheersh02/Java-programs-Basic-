import java.util.Scanner;

public class Speed_calculator {
    public static void main(String args[]) {
        float distance, speed, time;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the distance travelled");
        distance = scan.nextFloat();

        System.out.println("Enter the speed");
        speed = scan.nextFloat();

        time = distance / speed;

        System.out.println("The total time taken " + time);
    }

}
