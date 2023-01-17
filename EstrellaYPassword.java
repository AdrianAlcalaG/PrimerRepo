import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //imprimirEstrella();
        Scanner sc = new Scanner(System.in);
        int passwords;
        int len;
        System.out.println("Introduzca el numero de passwords que desee");
        passwords=sc.nextInt();
        System.out.println("Introduzca la longitud de las contraseñas");
        len=sc.nextInt();
        Password[] pass= new Password[passwords];
        Password[] copia = new Password[passwords];

        for(int i=0; i<pass.length;i++){
            pass[i] = new Password(len);
        }
        for(int j=0; j<copia.length;j++){
            copia[j] = new Password(pass[j]);
        }
        Arrays.sort(copia);
        System.out.println(copia);

    }


    public static void imprimirEstrella() {
        int dim1, dim2, aux, aux1 = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca ambas dimensiones separadas por un enter");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
        aux = ((dim2 - dim1) / 2);
        if(dim1 % 2 != dim2 % 2) {
            System.out.println("Ambos números deben ser pares o impares");
        } else {

            while (aux != 0) {
                for (int j = 0; j < aux; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < dim1 + (2 * i); k++) {
                    System.out.print("+");
                }
                System.out.println("");
                aux--;
                i++;
            }

            while (aux != ((dim2 - dim1) / 2) + 1) {
                for (int j = 0; j < aux; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < dim1 + (2 * i); k++) {
                    System.out.print("+");
                }
                for (int l = 0; l < aux; l++) {
                    System.out.print(" ");
                }
                System.out.println("");
                aux++;
                i--;
            }
        }
    }
}