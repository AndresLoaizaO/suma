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
public class mainCalificacionFinal {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        //Calcular calificacion final de la materia algoritmos 
        //Creacion clase Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        double calParcial1 = 0.0; //Variable para calificacion del primer parcial
        double calParcial2 = 0.0; //Variable para calificacion del segundo parcial
        double calParcial3 = 0.0; //Variable para calificacion del tercer parcial
        double promedio = 0.0; //Variable para promedio de calificaciones de los 3 parciales
        double promediop = 0.0;
        double promedioef = 0.0;
        double promediotf = 0.0;
        double calExamFinal = 0.0; //Variable para calificacion del examen final
        double calTrabajoFi = 0.0; //Variable para calificacion del trabajo final
        double calDefinitiva = 0.0; //Variable para la calificacion final

        System.out.println("Empieza el programa");
        //Entrada de datos
        System.out.println("Por favor digite la calificacion parcial 1 ");
        calParcial1 = entrada.nextDouble();
        System.out.println("Por favor digite la calificacion parcial 2 ");
        calParcial2 = entrada.nextDouble();
        System.out.println("Por favor digite la calificacion parcial 3 ");
        calParcial3 = entrada.nextDouble();
        System.out.println("Digite la calificacion de su examen final ");
        calExamFinal = entrada.nextDouble();
        System.out.println("Digite la calificacion de su trabajo final ");
        calTrabajoFi = entrada.nextDouble();
        //Proceso 
        promedio = (calParcial1 + calParcial2 + calParcial3) / 3;
        promediop = promedio * 0.55;
        promedioef= calExamFinal * 0.30;
        promediotf = calTrabajoFi * 0.15;
        calDefinitiva = promediop + promedioef + promediotf;
        //Salida
        System.out.println("Su calificacion final en la materia de algoritmos es " + calDefinitiva
        );

    }

}
