import java.util.Scanner;
public class Quadratic {

    
  public static void main(String[] Strings) {

        Scanner in = new Scanner(System.in);

            System.out.print("input a: ");
            double a = in.nextDouble();
            System.out.print("input b: ");
            double b = in.nextDouble();
            System.out.print("input c: ");
            double c = in.nextDouble();

            double discriminent = b * b - 4.0 * a * c;
            System.out.println("The value of discriminent is:" +discriminent);

            if (discriminent > 0.0) {
                double r1 = (-b + Math.sqrt(discriminent)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(discriminent)) / (2.0 * a);
                System.out.println("The roots are distinct, roots are:" + r1 + " and " + r2);
            } else if (discriminent == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root are real and equal, roots are:" + r1 + " and " +r1);
            } else {
                System.out.println("The equation has no real solution.");
            }

    }
}
