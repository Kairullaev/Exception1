import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double pi = Math.PI;

        System.out.println("   1 or 2  :"+"\n 1 : papaleliped   "+"\n 2 : Clinder ");
        int a = new Scanner(System.in).nextInt();

        switch (a) {
            case 1:
                try {
                    Scanner sc = new Scanner(System.in);
                    Parallelepiped p = new Parallelepiped();
                    p.setHeight(sc.nextDouble());
                    p.setLength(sc.nextDouble());
                    p.setWidth(sc.nextDouble());
                    p.setRadius(sc.nextDouble());


                    System.out.println(2 * ((p.getHeight() * p.getLength()) +
                            (p.getLength()) * p.getWidth() + (p.getHeight()) * p.getWidth()));
                    System.out.println(p.getLength() * p.getWidth() * p.getHeight());
                } catch (ArithmeticException e) {
                    System.out.println(" Berilgen maalymat ters ");
                } catch (InputMismatchException e) {
                    System.out.println(" berilgen maalymat tamga : \n" + "san jazynyz :  ");
                }
                break;
            case 2:
                try {
                    Scanner sc = new Scanner(System.in);
                    Cylinder c = new Cylinder();
                    c.setHeight(sc.nextDouble());
                    c.setLength(sc.nextDouble());
                    c.setWidth(sc.nextDouble());
                    c.setRadius(sc.nextDouble());

                    System.out.println(2 * pi * c.getRadius() * (c.getHeight() + c.getRadius()));
                    System.out.println(pi * c.getRadius() * c.getRadius() * c.getHeight());

                } catch (ArithmeticException e) {
                    System.out.println(" Berilgen maalymat ters ");
                } catch (InputMismatchException e) {
                    System.out.println(" berilgen maalymat tamga : \n" + "san jazynyz :  ");

                }break;
            default:
                System.out.println(" 1 je 2 tandanyz : " );

        }
    }
}