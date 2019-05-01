import java.io.*;
/**
 * <p>
 * Clase para ordenar una serie de números empleando el algoritmo de ordenamiento
 * o ordenación de burbuja
 * </p>
 * @author A18PabloPL
 * @version 1.0
 * @since 01/05/2019
 */

public class burbuja {
    
/**
 * <p>
 * Se te pedirá introducir la cantidad de números que quieres ordenar y luego
 * introducirá uno a uno
 * </p>
 * @param arg
 * @throws IOException 
 */
    
    public static void main(String arg[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
        int tam = Integer.parseInt(in.readLine());
        int arr[] = new int[tam];

        System.out.println();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j += 1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        burbuja(arr);
    }
/**
 * <p>
 * Se lleva a cabo el algoritmo de ordenamiento: se compara cada par de elementos
 * adyacentes, si el segundo es menor, se intercambian la posición.
 * </p>
 * @param arreglo 
 */
    
    static void burbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\n");
        }
    }
}
