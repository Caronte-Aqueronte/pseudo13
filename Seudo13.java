import java.util.Scanner;

public class Seudo13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op = "";
        while (!op.equals("c")) {
            System.out.println("a.Sumar dos numeros, b.Dividir dos numeros, c.Salir");
            op = scanner.nextLine();
            switch (op) {
                case "a":
                    double num1;
                    double num2;
                    System.out.println("Ingrese los numeros a sumar");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("R//" + (num1 + num2));
                    break;
                case "b":
                    double num3;
                    double num4;
                    System.out.println("Ingrese los numeros a dividir");
                    num3 = scanner.nextDouble();
                    num4 = scanner.nextDouble();
                    while (num3 == 0) {
                        System.out.println("Ingrese divisor distinto de cero");
                        num3 = scanner.nextDouble();
                    }
                    System.out.println("R//" + (num3 / num4));
                    break;
            }
        }
    }
}