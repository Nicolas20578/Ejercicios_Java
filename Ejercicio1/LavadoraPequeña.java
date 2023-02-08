package Ejercicio1;

public class LavadoraPequeña {
    int domicilio;
    int hora;
    int subTotal;
    int valor;

    public LavadoraPequeña(int domicilio, int hora, int subTotal, int valor) {
        this.domicilio = domicilio;
        this.hora = hora;
        this.subTotal = subTotal;
        this.valor = valor;
    }

    public int getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(int domicilio) {
        this.domicilio = domicilio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
