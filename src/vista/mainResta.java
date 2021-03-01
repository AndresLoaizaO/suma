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
public class mainResta {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // Programa para hacer una resta entre dos numeros enteros
        //Creacion de la clase Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Definicion e inicializacion de variables
        int numero_1 = 0, numero_2 = 0, resultado = 0;
        //Entrada de datos
        System.out.println("Por favor digite el primer numero ");
        numero_1 = entrada.nextInt();
        System.out.println("Por favor digite el segundo numero ");
        numero_2 = entrada.nextInt();
        //Proceso
        resultado = numero_1 - numero_2;
        //Salida de datos
        System.out.println("El resultado de la resta es " + resultado);

    }

}
