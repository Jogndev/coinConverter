import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        int opcionUsuario = 0;
        ConsultorApi consultorApi = new ConsultorApi();
        ArrayList<Conversion> registroDeConversiones = new ArrayList<>();
        System.out.println("**************************************************************\n");
        System.out.println("Bienvenid@ a Conversor de Monedas G6");
        while (opcionUsuario != 3) {
            Ventana ventana = new Ventana();
            ventana.mostrarMenu();
            opcionUsuario = ventana.leerOpcionIngresada();

            switch (opcionUsuario) {
                case 1:
                    ventana.mostrarMonedas("Moneda inicial");
                    String denominacionBase = ventana.leerOpcionMoneda();
                    ventana.mostrarMonedas("Moneda Final");
                    String monedaSeleccionada = ventana.leerOpcionMoneda();
                    Double montoAConvertir = ventana.leerMontoAConvertir();
                    Convertidor convertidor = consultorApi.buscarMoneda(denominacionBase);
                    Double tasaDeConversion = convertidor.getConversionRate(monedaSeleccionada.toUpperCase());
                    Double montoConvertido = ventana.montoObtenido(denominacionBase, montoAConvertir, tasaDeConversion, monedaSeleccionada);
                    Conversion nuevaConversion = new Conversion(denominacionBase, monedaSeleccionada, montoAConvertir, montoConvertido);
                    registroDeConversiones.add(nuevaConversion);
                    break;

                case 2:
                    ventana.imprimirConversiones(registroDeConversiones);
                    break;

                case 3:
                    System.out.println("Gracias por utilizar nuestro convertidor de moneda");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor seleccione otra opción");
            }
        }
    }
}
