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
public class mainPresupuesto {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        //Obtener el presupuesto anual de cada area del hospital
        //Creacion de la clase Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Delcaracion e inicializacion de variables
        int presupuestoAnual = 0; //Variable para presupuesto anual del hospital
        int presupuestoGinecologia = 0; //Variable para preuspuesto del area de ginecologia
        int presupuestoTraumatologia = 0; //Variable para el presupuesto del area de traumatologia
        int presupuestoPediatria = 0; //Variable para el presupuesto del area de pediatria
        //Entrada de datos
        System.out.println("Inicio del programa ");
        System.out.println("Digite el presupuesto anual del hospital ");
        presupuestoAnual = entrada.nextInt();
        //Proceso
        presupuestoGinecologia = presupuestoAnual * 40 / 100;
        presupuestoTraumatologia = presupuestoAnual * 30 / 100;
        presupuestoPediatria = presupuestoAnual * 30 / 100;
        //Salida de datos
        System.out.println("El presupuesto anual designado al area de Ginecologia es de " + presupuestoGinecologia);
        System.out.println("El presupuesto anual designado al area de traumatologia es de " + presupuestoTraumatologia);
        System.out.println("El presupuesto anual designado al area de pediatria es de " + presupuestoPediatria);

    }

}
