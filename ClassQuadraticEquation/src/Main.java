import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation root = new QuadraticEquation(a, b, c);

        if (root.getDiscriminant() > 0){
            System.out.printf("The equation has two roots %f and %f", root.getRoot1(), root.getRoot2());
        } else if (root.getDiscriminant() == 0){
            System.out.print("The equation has one root " + root.getRoot1());
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
