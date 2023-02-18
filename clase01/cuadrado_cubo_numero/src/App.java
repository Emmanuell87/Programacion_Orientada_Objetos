import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        float x = scanner.nextFloat();
        scanner.close();
        System.out.println("El cuadrado de " + x + " es: " + Math.pow(x, 2));
        System.out.println("El cubo de " + x + " es: " + Math.pow(x, 3));
    }
}
