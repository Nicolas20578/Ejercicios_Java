package Ejercicio3;

public class Cliente {
    int subTotal, total;

    public Cliente(int subTotal, int total) {
        this.subTotal = subTotal;
        this.total = total;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
