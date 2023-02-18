import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        int EDJuan = scanner.nextInt();
        scanner.close();

        int EDAlberto = Math.round(EDJuan * 2/3);

        int EDAna = Math.round(EDJuan * 4/3);

        int EDMama = Math.round(EDJuan + EDAlberto + EDAna);

        System.out.println("La edad de Juan es: " + EDJuan );
        System.out.println("La edad de Alberto es: " + EDAlberto );
        System.out.println("La edad de Ana es: " + EDAna );
        System.out.println("La edad de la Mamá es: " + EDMama );
    }
}
