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
public class mainSueldo {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        //Cacular sueldo base y comisiones de un vendedor
        //Creacion clase Scanner para entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        int sueldoBase = 900000;
        int venta1 = 0;
        int venta2 = 0;
        int venta3 = 0;
        int totalVentas = 0;
        int totalSueldo = 0;
        int totalComisiones = 0;
        //Entrada de datos
        System.out.println("Digite el valor de la venta 1 ");
        venta1 = entrada.nextInt();
        System.out.println("Digite el valor de la venta 2 ");
        venta2 = entrada.nextInt();
        System.out.println("Digite el valor de la venta 3 ");
        venta3 = entrada.nextInt();
        //Proceso
        totalVentas = venta1 + venta2 + venta3;
        totalSueldo = sueldoBase + totalVentas * 10 / 100;
        totalComisiones = totalVentas * 10 / 100;
        //Salida de datos
        System.out.println("El empleado vendio en el mes " + totalVentas);
        System.out.println("Recibira de comision por las ventas en el mes " + totalComisiones);
        System.out.println("Recibira de sueldo incluidas comisiones un total de " + totalSueldo);

    }

}
