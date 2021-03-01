/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Andres Loaiza Ortiz
 */
public class mainNotaFinal {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        //Calcular nota final de la materia Algoritmos
        //Iniciacion y declaracion de variables
        //Creacion de la clase Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double nota4 = 0.0;
        double notaFinal = 0.0;
        System.out.println("Inicia el programa ");
        //Entrada de datos
        System.out.println("Por favor digite la primera nota ");
        nota1 = entrada.nextDouble();
        System.out.println("Por favor digite la segunda nota ");
        nota2 = entrada.nextDouble();
        System.out.println("Por favor digite la tercera nota ");
        nota3 = entrada.nextDouble();
        System.out.println("Por favor digite la cuarta nota ");
        nota4 = entrada.nextDouble();
        //Proceso
        notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        //Salida 
        System.out.println("Su nota fina es " + notaFinal);

    }

}
