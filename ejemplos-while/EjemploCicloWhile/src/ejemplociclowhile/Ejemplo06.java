/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double suma_total = 0;
        double calificacion;
        boolean bandera = true;

        System.out.println("Ingrese las notas de los "
                + "estudiantes de su materia");
        // true 
        // while (bandera) {
        while(bandera==true){ // t == t -> t f==t =f
            System.out.println("Ingrese calificación");
            calificacion = entrada.nextDouble();//23 15

            if (calificacion > 20) {//23 <20 t 15<20 f
                calificacion = 20;// 20
            }
            suma_total = suma_total + calificacion; //0 + 20=20 20+15=35

            // proceso para salir del ciclo.
            System.out.println("Ingrese el valor -1 para salir del ciclo");
            int temporal = entrada.nextInt();

            if (temporal == -1) {//0==-1 F -1 T
                bandera = false;// bandera es flase
            }
        }

        System.out.printf("Suma de calificaciones es %.2f\n", suma_total);
           // suma de calificaiones es 35.00000000000000000
    }
}
