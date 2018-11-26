import java.util.Scanner;

public class Filesix {
    public static void main(String[] args) {
        double radius,answer;
       Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = chukua.nextDouble();
        answer = Math.PI * Math.pow(radius,2);
        System.out.println("Area = "+answer);
    }
}
//interest loan borrowed
//volume of a cylinder