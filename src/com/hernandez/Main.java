package com.hernandez;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Matematicas ele;
        Matematicas raiz;
        Matematicas Primo;
        double n1, n2;
        float nn1, numero;
        int opc;
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. Elevar un número");
        System.out.println("2. Calcular raiz");
        System.out.println("3. Determinar si un número es primo");
        opc = entrada.nextInt();

        switch (opc) {
            case 1:

                n1 = LectorDeDatos.solicitarDouble("Ingrese el primer digito: ");
                n2 = LectorDeDatos.solicitarDouble("Ingrese la potencia a elevar: ");

                ele = new Matematicas(n1, n2);
                System.out.println("El resultado es: " + ele.getPotencia());
                break;

            case 2:
                nn1 = LectorDeDatos.solicitarFlotante("Ingrese el primer digito: ");
                raiz = new Matematicas(nn1);
                System.out.println("El resultado es: " + raiz.getRaiz());

                break;

            case 3:
                numero = LectorDeDatos.solicitarEntero("Ingrese el dato a comparar: ");
                Primo = new Matematicas(numero);
                System.out.println("El resultado es: " + Primo.getPrimo(numero));

                break;
        }

    }
}
