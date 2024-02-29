package com.mycompany.calculadora;

public class Calculadora {

    public static void main(String[] args) {
        Operaciones op= new Operaciones();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.division();
        op.porcentaje();
        op.mostarResultados();
    }
        
    }
