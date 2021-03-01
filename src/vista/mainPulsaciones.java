/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Carlos Andres Loaiza Ortiz
 */
public class mainPulsaciones {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        //Calcular numero de pulsaciones por cada 10 segundos de ejercicio
        //Creacion clase Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        int edad = 0;
        double numPulsaciones = 0.0;
        //Entrada de datos
        System.out.println("Inicio del programa ");
        System.out.println("Por favor digite su edad ");
        //Proceso
        edad = entrada.nextInt();
        numPulsaciones = (double) (220 - edad) / 10;
        //Salida de datos
        System.out.println("Su numero de pulsaciones por cada 10 segundos de ejercicio es de " + " " + numPulsaciones + " " + "pulsaciones");

    }

}
