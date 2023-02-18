import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        float radio = scanner.nextFloat();
        scanner.close();
        double circunferencia = Math.PI * radio * 2;
        double area =  Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
}
