import java.time.LocalDateTime;

public class Conversion {
    private String denominacionBase;
    private String monedaSeleccionada;
    private Double montoAConvertir;
    private Double montoConvertido;
    private LocalDateTime tiempo;

    public Conversion(String denominacionBase, String monedaSeleccionada, double montoAConvertir, double montoConvertido) {
        this.denominacionBase = denominacionBase;
        this.monedaSeleccionada = monedaSeleccionada;
        this.montoAConvertir = montoAConvertir;
        this.montoConvertido = montoConvertido;
        this.tiempo = LocalDateTime.now();
    }

    public String getDenominacionBase() {
        return denominacionBase;
    }

    public void setDenominacionBase(String denominacionBase) {
        this.denominacionBase = denominacionBase;
    }

    public String getMonedaSeleccionada() {
        return monedaSeleccionada;
    }

    public void setMonedaSeleccionada(String monedaSeleccionada) {
        this.monedaSeleccionada = monedaSeleccionada;
    }

    public Double getMontoAConvertir() {
        return montoAConvertir;
    }

    public void setMontoAConvertir(Double montoAConvertir) {
        this.montoAConvertir = montoAConvertir;
    }

    public Double getMontoConvertido() {
        return montoConvertido;
    }

    public void setMontoConvertido(Double montoConvertido) {
        this.montoConvertido = montoConvertido;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }
}
