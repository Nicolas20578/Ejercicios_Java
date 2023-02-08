package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalFlequitos {
    public static void main(String[] args) {
        List<Cliente> clienteList = new ArrayList<>();

        Scanner lector = new Scanner(System.in);

        int cantCliente,subTotal=0, corteCamisa, cortePantalon, confCamisa, confPantalon, estCamiseta, acabPantalon, acabCamisa;

        System.out.println("Digita la cantidad de clientes a ingresar: ");
        cantCliente = lector.nextInt();

        for (int a = 0; a<cantCliente; a++){
            int total= 0;

            System.out.println("Digite la cantidad de Corte Camisa para el cliente "+(a+1));
            corteCamisa = lector.nextInt();
            subTotal= corteCamisa * 3000;

            total = subTotal;


            System.out.println("Digite la cantidad de Corte Pantalón para el cliente "+(a+1));
            cortePantalon = lector.nextInt();
            subTotal= cortePantalon * 5000;

            total = total +subTotal;


            System.out.println("Digite la cantidad de Confeccion Camisa para el cliente "+(a+1));
            confCamisa = lector.nextInt();
            subTotal= confCamisa * 15000;

            total = total +subTotal;


            System.out.println("Digite la cantidad de Confeccion Pantalón para el cliente "+(a+1));
            confPantalon = lector.nextInt();
            subTotal= confPantalon * 25000;

            total = total +subTotal;


            System.out.println("Digite la cantidad de Estampado de Camiseta para el cliente "+(a+1));
            estCamiseta = lector.nextInt();
            subTotal= estCamiseta*3000;

            total = total +subTotal;


            System.out.println("Digite la cantidad de Acabados y terminacion de Pantalón para el cliente "+(a+1));
            acabPantalon = lector.nextInt();
            subTotal= acabPantalon*3000;

            total = total +subTotal;


            System.out.println("Digite la cantidad de Acabados y terminacion de Camisa para el cliente "+(a+1));
            acabCamisa = lector.nextInt();
            subTotal= acabCamisa*2500;

            total = total +subTotal;

            clienteList.add(new Cliente(subTotal, total));



            /*System.out.println("El total a pagar para el cliente "+(a+1)+" es "+total);*/

        }
        for (Cliente c : clienteList) {
            System.out.println("CLIENTE");
            System.out.println("El total a pagar es: "+ c.getTotal());
        }
    }
}
