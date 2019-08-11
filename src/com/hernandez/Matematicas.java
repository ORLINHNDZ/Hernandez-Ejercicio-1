package com.hernandez;

public class Matematicas {
    private double n1;
    private double n2;
    private float nn1;
    private int contador, I, numero;

    //metodos
    public Matematicas(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;


    }

    public Matematicas(float nn1) {
        this.nn1 = nn1;


    }

    public Matematicas(int contador, int I, int numero) {
        this.contador = contador;
        this.I = I;
        this.numero = numero;


    }


    public double getPotencia() {
        double ResultadoElevado = Math.pow(n1, n2);
        return ResultadoElevado;
    }

    public double getRaiz() {
        double ResultadoRaiz = Math.sqrt(nn1);
        return ResultadoRaiz;
    }

    public double getPrimo(double resultado) {
        int contador;
        double I;



        contador = 0;

        for (I = 1; I <= resultado; I++) {
            if ((resultado % I) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
        return resultado;
    }
}


