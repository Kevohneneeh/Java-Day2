import java.util.Scanner;

public class Fileseven {
    public static void main(String[] args) {
        double radius, height, volume;
        Scanner chukua;
        chukua  = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = chukua.nextDouble();
        Scanner carry;
        carry = new Scanner(System.in);
        System.out.println("Enter the height");
        height = carry.nextDouble();
        volume = radius * radius * Math.PI * height;
        System.out.println("Volume = "+volume);
    }

}
