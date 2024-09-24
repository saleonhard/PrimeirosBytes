
import java.util.Scanner;

public class v114 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, quantPar = 0;
        int v1[] = new int[5];
        int v2[] = new int[5];
        for (i = 0; i < 5; i++) {
            System.out.printf("Vetor 1. Posição %d = ", i);
            v1[i] = entrada.nextInt();
            if (v1[i] % 2 == 0) {
                quantPar++;
            }

        }

        System.out.print("\n");
        for (i = 0; i < 5; i++) {
            System.out.printf("Vetor 2. Posição %d = ", i);
            v2[i] = entrada.nextInt();
            if (v2[i] % 2 == 0) {
                quantPar++;
            }

        }

        System.out.printf("Quantidade de pares = %d", quantPar);

        System.out.print("\n\n");

        int cont = 0;

        int v3[] = new int[quantPar];
        for (i = 0; i < quantPar; i++) {
            if (v1[i] % 2 == 0) {
                v3[cont] = v1[i];
                cont++;
            }
            else
            if (v2[i] % 2 == 0) {
                v3[cont] = v2[i];
                cont++;
            }
        }
        for (i = 0; i < quantPar; i++) {
            System.out.printf("Posicao %d = %d\n", i, v3[i]);
        }

    }

}
