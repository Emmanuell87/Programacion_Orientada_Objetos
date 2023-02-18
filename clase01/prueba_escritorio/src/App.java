public class App {
    public static void main(String[] args) throws Exception {
        float suma = 0;
        float x = 20;
        suma += x; 
        int y = 40;
        x += Math.pow(y, 2);
        suma += x/y;
        System.out.println("El valor de la suma es: " + suma);  
    }
}
