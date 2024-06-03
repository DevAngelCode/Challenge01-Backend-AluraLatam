package Challenge01;
import java.util.Scanner;

public class ConversionMoneda {


    public void convertir(String monedaBase, String monedaAConvertir, consultaApi consulta, Scanner lectura) {
        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaAConvertir);
        System.out.println("La tasa de conversion es: "+monedaBase+" - "+monedaAConvertir);
        System.out.println("ingrese la cantidad de " + monedaBase);
        double cantidad = Double.parseDouble(lectura.nextLine());
        double cantidadComvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadComvertida + " " + moneda.target_code());
    }

}