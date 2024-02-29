package com.mycompany.calculadora;

import javax.swing.JOptionPane;


public class Operaciones {
    //atributos de clase
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int porcentaje;
    
    //metodos
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("colca el num 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el num 2"));
    }
    //Metodo de suma 
    public void suma(){
        suma=numero1+numero2;
        
    }
    //metodo de resta
    public void resta(){
        resta=numero1-numero2;
    }
    //metodo de multiplicacion
    public void multiplicacion(){
        multiplicacion=numero1*numero2;
    }
    //metodo de resta 
    public void division(){
        division=numero1/numero2;
    }
    //metodo porcentaje 
    public void porcentaje(){
        porcentaje=(numero1/numero2)*100;
    }
    //muestra resultados
    
    public void mostrarResultados(){
         System.out.print("La suma es: " + suma);
         
          System.out.print("La resta es: " + resta);
          
           System.out.print("La multiplicacion es: " + multiplicacion);
           
            System.out.print("La division es: " + division);
            
             System.out.print("el porcentaje es: " + porcentaje);
    }
}
