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
public class mainInversion {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        //Calcular porcentaje de inversion de 3 personas con respecto a la inversion total
        Scanner entrada = new Scanner(System.in); //Creacion clase Scanner para entrada de datos por consola
        //Declaracion e inicializacion de variables
        int cantidadPerson1 = 0; //Cantidad que invirtio la primera persona
        int cantidadPerson2 = 0; //Cantidad que invirtio la segunda persona
        int cantidadPerson3 = 0; //Cantidad que invirtio la tercera persona
        int cantidadTotal = 0; //Cantidad total invertida
        System.out.println("Inicia el programa ");
        //Entrada de datos
        System.out.println("Digite la cantidad total invertida ");
        cantidadTotal = entrada.nextInt();
        //Proceso
        cantidadPerson1 = cantidadTotal * 10 / 100;
        cantidadPerson2 = cantidadTotal * 30 / 100;
        cantidadPerson3 = cantidadTotal * 60 / 100;
        //Salida
        System.out.println("Paula invirtio para la empresa la suma de " + cantidadPerson1);
        System.out.println("Jose invirtio para la empresa la suma de " + cantidadPerson2);
        System.out.println("Juan invirtio para la empresa la suma de " + cantidadPerson3);

    }

}
