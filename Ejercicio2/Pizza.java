package Ejercicio2;

public class Pizza {
    int cantidad, costo;

    public Pizza(int cantidad, int costo) {
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
