        /*
        Consigna:
        *Generar un programa que retorne por consola el monto total 
        que se pagará al banco. 
        *El monto total es Capital Solicitado + intereses a pagar.
        *La fórmula para calcular "cuánto interés se pagará" por un 
        préstamo pedido al banco es: 
        *Interés a pagar = Capital solicitado x Interés x periodo en meses
        *El objetivo es que los alumnos realicen su primer programa 
        Java, entender el uso de variables, aprender a ver problemas 
        de compilación y el uso de la consola.


        Planteo:
        °Monto total a pagar = Capital solicitado + Intereses a pagar
        °Capital solicitado
        °Intereses a pagar = (Capital solicitado * Interés * periodo en meses) / 100
        */

import java.util.Scanner;

public class NumeroFlotanteFestorazzi {

    public static void main(String[] args) throws Exception {
        
        //Declaro funciones
        final int INTERESES = 2;
        final int MES_MINIMO= 1;
        final int MES_MAXIMO = 12;

        //Abro sc.Scanner
        Scanner sc = new Scanner(System.in);

        //Declaro variables
        float periodoMeses;
        float capitalSolicitado;
        

        //Informo el interés mensual.
        System.out.println("El interés mensual actual es de: " + INTERESES + "%");

        //Solicito que se ingrese un capital
        do{
        System.out.println("Ingrese Capital solicitado en número entero mayor que 0, sin caracteres especiales ni puntos ni comas");
        capitalSolicitado = sc.nextFloat();
        }while(capitalSolicitado<1);

        //Solicito que se ingrese cantidad de meses que se va a demorar en pagar
        do{
        System.out.println("Ingrese periodo de meses en números, del 1 al 12");
        periodoMeses = sc.nextFloat();
        }while(periodoMeses<MES_MINIMO || periodoMeses>MES_MAXIMO);

        //Realizo cálculos
        Float calculoInteres = (capitalSolicitado*INTERESES*periodoMeses)/100;
        Float calculoTotal = capitalSolicitado+calculoInteres;
        
        //Devuelvo datos
        System.out.println("Intereses a pagar: $" + calculoInteres);
        System.out.println("Total a pagar: $" + calculoTotal);


        //Cierro sc.Scanner
        sc.close();
    }
}
