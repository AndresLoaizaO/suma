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
public class mainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("**Bienvenido analice las siguientes opciones y elija segun su necesidad** ");
            System.out.println("------------------------------------------------------------------------------ ");
            System.out.println("**Presione « 1 » si desea calcular un sueldo base con 10% de comision por cada venta ");
            System.out.println("**Presione « 2 » si desea calcular su calificacion final en la materia algoritmo segun el promedio en sus 5 notas finales**");
            System.out.println("**Presione « 3 » si desea calcular el numero de pulsaciones por cada 10 segundos de ejercicio**");
            System.out.println("**Presione « 4 » si desea calcular el presupuesto de las areas de ginecologia, traumatologia y pediatria de un hospital segun el presupuesto anual de este **");
            System.out.println("**Presione « 5 » si desea calcular el porcentaje de inversion de 3 personas para fundar una empresa**");
            System.out.println("**Presione « 6 » si desea saber su promedio general en la materia algoritmos segun sus cuatro notas finales **");
            System.out.println("**Presione « 7 » si desea hacer una suma");
            System.out.println("**Presione « 8 » si desea hacer una resta ");
            System.out.println("**Presione « 9 » si desea hacer una multiplicacion ");

            System.out.println("**Presione « 10 » para salir del programa ");
            System.out.println("------------------------------------------------------------------------------------ ");
            System.out.println("Por favor presione segun la opcion que necesite ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    mainSueldo objsueldo = new mainSueldo();
                    objsueldo.main(args);
                    break;
                case 2:
                    mainCalificacionFinal objcafinal = new mainCalificacionFinal();
                    objcafinal.main(args);
                    break;
                case 3:
                    mainPulsaciones objpulsaciones = new mainPulsaciones();
                    objpulsaciones.main(args);
                    break;
                case 4:
                    mainPresupuesto objpresupuesto = new mainPresupuesto();
                    objpresupuesto.main(args);
                    break;
                case 5:
                    mainInversion objinversion = new mainInversion();
                    objinversion.main(args);
                    break;
                case 6:
                    mainNotaFinal objnotafinal = new mainNotaFinal();
                    objnotafinal.main(args);
                    break;
                case 7:
                    mainSuma objsuma = new mainSuma();
                    objsuma.main(args);
                    break;
                case 8:
                    mainResta objresta = new mainResta();
                    objresta.main(args);
                    break;
                case 9:
                    mainMultiplicacion objmultiplicacion = new mainMultiplicacion();
                    objmultiplicacion.main(args);
                    break;
                case 10:
                    salir = true;
                    System.out.println("█ Gracias por utilizar esta app █");
                    break;
                default:
                    System.out.println("██ Opcion incorrecta, solo numeros de 1 al 10 ██");
                    break;

            }

        }

    }

}
