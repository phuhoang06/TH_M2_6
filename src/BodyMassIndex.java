import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight is: ");
        weight = scanner.nextDouble();
        System.out.print("Your height is: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi < 25) {
            System.out.println("You are normal");
        }
        else if (bmi < 30) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You are obese");
        }
    }
}
