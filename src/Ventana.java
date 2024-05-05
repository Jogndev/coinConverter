import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Ventana {
    private final String monedasDisponibles = """
            USD --- Dólar Estadounidense
            ARS --- Peso Argentino
            BRL --- Real Brasileño
            COP --- Peso Colombiano
            EUR --- Euro""";

    public void mostrarMenu() {
        System.out.println("**************************************************************");
        System.out.println("Seleccione una de las siguientes opciones: \n");
        String menu = """
                1) Realizar una conversión
                2) Revisar registro de conversiones
                3) Salir                
                """;
        System.out.println(menu);
    }

    public int leerOpcionIngresada() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Seleccione una opción válida");
        System.out.println("**************************************************************");
        return lectura.nextInt();
    }

    public void mostrarMonedas(String denominacion) {
        System.out.println("**************************************************************");
        System.out.println("Seleccione la denominación: " + denominacion + ": \n");
        System.out.println(monedasDisponibles);
        System.out.println("**************************************************************");
    }

    public String leerOpcionMoneda() {
        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine().toLowerCase();
        while (!monedasDisponibles.toLowerCase().contains(opcion)) {
            System.out.println("La opción digitada no está disponible");
            System.out.println("Selecciona una opción válida");
            System.out.println("**************************************************************");
            opcion = lectura.nextLine().toLowerCase();
        }
        return opcion.toUpperCase();
    }

    public Double leerMontoAConvertir() {
        System.out.println("**************************************************************");
        System.out.println("Indique el monto que desea convertir: \n");
        System.out.println("**************************************************************");
        Scanner lectura = new Scanner(System.in);
        double cantidad;
        while (!lectura.hasNextDouble()) {
            System.out.println("**************************************************************");
            System.out.println("El monto digitado no es un número válido");
            System.out.println("Ingrese un monto válido");
            System.out.println("**************************************************************");
            lectura.nextLine();
        }
        cantidad = lectura.nextDouble();
        lectura.nextLine();
        return cantidad;
    }

    public Double montoObtenido(String denominacionBase, double montoAConvertir, double tasaDeConversion, String monedaSeleccionada) {
        double resultado = montoAConvertir * tasaDeConversion;
        System.out.println("**************************************************************");
        System.out.println(montoAConvertir + " " + denominacionBase + " equivalen a " + resultado + " " + monedaSeleccionada);
        return resultado;
    }

    public void imprimirConversiones(ArrayList<Conversion> registroDeConversiones) {
        if (registroDeConversiones.isEmpty()) {
            System.out.println("No se han realizado conversiones");
        } else {
            System.out.println("Registro de conversiones: ");
            for (int i = 0; i < registroDeConversiones.size(); i++) {
                Conversion conversion = registroDeConversiones.get(i);
                System.out.println("Conversion " + (i + 1) + ":");
                System.out.println("Moneda origen: " + conversion.getDenominacionBase());
                System.out.println("Moneda Objetivo: " + conversion.getMonedaSeleccionada());
                System.out.println("Cantidad a cambiar: " + conversion.getMontoAConvertir());
                System.out.println("Cantidad obtenida: " + conversion.getMontoConvertido());
                System.out.println("Fecha y hora: " + formatDateTime(conversion.getTiempo()));
                System.out.println("**************************************************************");
            }
        }
    }
    private String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}
