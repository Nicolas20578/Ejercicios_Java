package Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrincipalPizza {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Map<Integer, Pizza> map = new HashMap<Integer, Pizza>();

        int cantCliente, cantCombo, valor;

        System.out.println("Digita la cantidad de clientes a ingresar: ");
        cantCliente = lector.nextInt();

        for (int a = 0; a<cantCliente; a++) {
            System.out.println("Digite el numero de la opcion que desea: \n 1: Combo 1 \n 2: Combo 2 \n 3: Combo 3");
            Integer opcion = lector.nextInt();
            if (opcion == 1){
                System.out.println("Ingrese la cantidad: ");
                cantCombo = lector.nextInt();
                valor = cantCombo * 50000;
                Pizza p = new Pizza(cantCombo, valor);
                map.put(1, p);
            }
            if(opcion == 2){
                System.out.println("Ingrese la cantidad: ");
                cantCombo = lector.nextInt();
                valor = cantCombo * 25000;
                Pizza p = new Pizza(cantCombo, valor);
                map.put(1, p);
            } else {
                System.out.println("Ingrese la cantidad: ");
                cantCombo = lector.nextInt();
                valor = cantCombo * 25000;
                Pizza p = new Pizza(cantCombo, valor);
                map.put(1, p);
            }
        }
        for (Pizza p : map) {
            System.out.println("Lista cliente "+p.getCosto());
        }
    }
}
