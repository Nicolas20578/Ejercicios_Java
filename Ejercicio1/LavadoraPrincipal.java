package Ejercicio1;

import Primero.Lavadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LavadoraPrincipal {
    public static void main(String[] args) {

        List<LavadoraPequeña> arlPequeña = new ArrayList<>();
        List<LavadoraGrande> arlGrande = new ArrayList<>();

        Scanner lector = new Scanner(System.in);

        int cliente, opcion;
        int domicilio, hora, subTotal = 0, valor = 0;

        System.out.println("Digita la cantidad de clientes a ingresar: ");
        cliente = lector.nextInt();

        for (int a = 0; a<cliente; a++){

            System.out.println("Digita 1 si la lavadora es grande y 2 si es pequeña: ");
            opcion = lector.nextInt();

            System.out.println("Digita 1 si es a domicilio y 2 en caso de que no: ");
            domicilio = lector.nextInt();

            System.out.println("Digita la cantidad de horas: ");
            hora = lector.nextInt();

            if (opcion == 1){
                if (domicilio == 1){
                    if(hora > 5){
                        subTotal = 8000*hora;
                        valor = (subTotal+160)-4000;
                        arlGrande.add(new LavadoraGrande(domicilio, hora, valor, subTotal));
                    } else {
                        subTotal = 8000*hora;
                        valor = subTotal+160;
                        arlGrande.add(new LavadoraGrande(domicilio, hora, valor, subTotal));

                    }
                } else {
                    if(hora > 5){
                        subTotal = 8000*hora;
                        valor = subTotal-4000;
                        arlGrande.add(new LavadoraGrande(domicilio, hora, valor, subTotal));

                    } else {
                        valor = 8000*hora;
                        arlGrande.add(new LavadoraGrande(domicilio, hora, valor, subTotal));

                    }
                }
            }

            else {
                if (domicilio == 1){
                    if(hora > 5){
                        subTotal = 6000*hora;
                        valor = (subTotal+120)-4000;
                        arlPequeña.add(new LavadoraPequeña(domicilio, hora, valor, subTotal));
                    } else {
                        subTotal = 6000*hora;
                        valor = subTotal+120;
                        arlPequeña.add(new LavadoraPequeña(domicilio, hora, valor, subTotal));
                    }
                } else {
                    if(hora > 5){
                        subTotal = 6000*hora;
                        valor = subTotal-4000;
                        arlPequeña.add(new LavadoraPequeña(domicilio, hora, valor, subTotal));
                    } else {
                        valor = 6000*hora;
                        arlPequeña.add(new LavadoraPequeña(domicilio, hora, valor, subTotal));
                    }
                }
            }

        }

        for (LavadoraGrande g : arlGrande) {
            System.out.println("CLIENTE DE LAVADORA GRANDE");
            System.out.println("Cantidad De Horas: " + g.getHora());
            System.out.println("Cuenta De Cobro: " + g.getValor());
        }

        for (LavadoraPequeña p : arlPequeña) {
            System.out.println("CLIENTE DE LAVADORA PEQUEÑA");
            System.out.println("Cantidad De Horas: " + p.getHora());
            System.out.println("Cuenta De Cobro: " + p.getValor());
        }
    }
}