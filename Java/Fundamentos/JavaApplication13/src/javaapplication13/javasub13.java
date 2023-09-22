package javaapplication13;
import java.util.Arrays;
import java.util.Scanner;
public class javasub13 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        //LECTURA DE DATOS
        System.out.println("Escribe tu dato ");
        int dato1 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato2 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato3 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato4 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato5 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato6 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato7 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato8 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato9 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato10 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato11 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato12 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato13 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato14 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato15 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato16 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato17 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato18 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato19 = sc.nextInt();
        System.out.println("Escribe tu dato ");
        int dato20 = sc.nextInt();

        int arreglo[] = {dato1, dato2, dato3, dato4, dato5, dato6, dato7, 
            dato8, dato9, dato10, dato11,
                         dato12, dato13, dato14, dato15, dato16, dato17, 
                         dato18, dato19, dato20};

        //PROMEDIO O MEDIA
        int sumatoria = (dato1 + dato2 + dato3 + dato4 + dato5 + dato6 + 
                dato7 + dato8 + dato9 + dato10 + dato11 +
                         dato12 + dato13 + dato14 + dato15 + dato16 + 
                dato17 + dato18 + dato19 + dato20);
        var media = (sumatoria / 20);

        //MEDIANA
        Arrays.sort(arreglo);
        int mediana;
        int mitad = arreglo.length / 2;
        // Si la longitud es par, se deben promediar los del centro
        if (arreglo.length % 2 == 0) {
            mediana = (arreglo[mitad - 1] + arreglo[mitad]) / 2;
        } else {
            mediana = arreglo[mitad];
        }

        //MODA
        int maximaVecesQueSeRepite = 0;
        int moda = 0;

        for (int i = 0; i < arreglo.length; i++) {

            int vecesQueSeRepite = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    vecesQueSeRepite++;
                }
            }

            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                moda = arreglo[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        //IMPRESION DE VALORES
        System.out.println("El arreglo es: ");
        System.out.println(Arrays.toString(arreglo));

        System.out.println("La media es " + media);
        System.out.println("La mediana es " + mediana);
        System.out.println("La moda es " + moda + " y se repitió " +
                maximaVecesQueSeRepite + " veces.");

    }

}
