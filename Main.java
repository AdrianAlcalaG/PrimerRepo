import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        ejercicio10();
    }

    public static void ejercicio7() {

		/*Crea un programa que lea por teclado tres números enteros H, M, S
		correspondientes a hora, minutos y segundos respectivamente, y
		comprueba si la hora que indican es una hora válida.*/

        Scanner sc = new Scanner(System.in);
        int h, m, s;
        boolean correcto=false;

        System.out.println("Introduzca tres números enteros que correspondan a la hora, los minutos y los segundos uno por linea: ");
        h=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();

        if(23>=h && h>=1) {
            if(59>=m && m>=0) {
                if(59>=s && s>=0) {
                    correcto=true;
                }
            }
        }

        if(correcto==true) {
            System.out.println("La hora es correcta");
        } else {
            System.out.println("La hora es incorrecta");
        }
    }

    public static void ejercicio8(){
        /*Programa que lea por teclado un número
        correspondiente a un mes e indique si es un mes de 28, 30 o 31 días y qué mes es en un String.
         */

        int mes, dias = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número correspondiente a un mes");
        mes=sc.nextInt();

        if(mes<=12 && mes >0) {

            switch (mes) {
                case 1:
                    dias = 31;
                    break;
                case 2:
                    dias = 28;
                    break;
                case 3:
                    dias = 31;
                    break;
                case 4:
                    dias = 30;
                    break;
                case 5:
                    dias = 31;
                    break;
                case 6:
                    dias = 30;
                    break;
                case 7:
                    dias = 31;
                    break;
                case 8:
                    dias = 31;
                    break;
                case 9:
                    dias = 30;
                    break;
                case 10:
                    dias = 31;
                    break;
                case 11:
                    dias = 30;
                    break;
                case 12:
                    dias = 31;
                    break;
            }
            System.out.println("Se trata de un mes de "+ dias +" dias");
        } else {
            System.out.println("No ha introducido un mes correcto");
        }

    }

    public static void ejercicio9(){
        /* Escribir un programa que pida al usuario que introduzca por teclado números enteros.
        La lectura de números por teclado finaliza cuando se introduce un -25.
        El programa mostrará cuántos números negativos y ceros se han introducido.*/

        Scanner sc = new Scanner(System.in);
        int cont=0;

        System.out.println("Introduzca números por teclado. Cuando acabe, escriba '-25'");
        while(true){
            int number=sc.nextInt();
            if(number==-25){
                break;
            }if(number<=0) {
                cont++;
            }
        }
        System.out.println(cont);
    }

    public static void ejercicio10(){
        /* Programa para invertir el orden de las cifras de un número.
        Se introduce un número entero positivo por teclado y el programa modifica
        el número invirtiendo el orden de sus cifras.*/

        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Introduzca un numero entero positivo: ");
        i=sc.nextInt();
        if (i<=0){
            System.out.println("El numero introducido no es correcto");
        }
        while(i>0){
            int j = i%10;
            System.out.print(j);
            i=i/10;
        }
    }
}