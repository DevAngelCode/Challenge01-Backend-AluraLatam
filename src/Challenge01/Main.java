package Challenge01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        consultaApi consulta = new consultaApi();
        ConversionMoneda conversionMoneda = new ConversionMoneda();

        String continuar;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. USD a MXN");
            System.out.println("2. MXN a USD");
            System.out.println("3. USD a PEN");
            System.out.println("4. PEN a USD");
            int opcion = Integer.parseInt(lectura.nextLine());
            switch (opcion) {
                case 1 -> conversionMoneda.convertir("USD", "MXN", consulta, lectura);
                case 2 -> conversionMoneda.convertir("MXN", "USD", consulta, lectura);
                case 3 -> conversionMoneda.convertir("USD", "PEN", consulta, lectura);
                case 4 -> conversionMoneda.convertir("PEN", "USD", consulta, lectura);
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println("¿Desea realizar otra conversión? (s/n)");
            continuar = lectura.nextLine().toLowerCase();
        } while(continuar.equals("s"));

        System.out.println("Gracias por usar mi convertidor");
        lectura.close();
    }
}
