public class App {
    public static void main(String[] args) throws Exception {
        int horasXSemana = 48;
        int razon = 5000;
        float porcentajeRetencion = 0.125f;
        int salarioBruto = horasXSemana * razon * 4;
        float retencionFuente = salarioBruto * porcentajeRetencion;
        float salarioNeto = salarioBruto * (1-porcentajeRetencion);
        System.out.println("El salario bruto del trabajador es: " + salarioBruto);
        System.out.println("La retención en la fuente del trabajador es: " + retencionFuente);
        System.out.println("El salario neto del trabajador es: " + salarioNeto);
    }

}
