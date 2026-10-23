
import java.util.Scanner;

public class Algoritmo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {
            "Janeiro", "Fevereiro", "Marco", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        double[] temperaturas = new double[12];
        double soma = 0;
        double media;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("A temperatura de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];
        }

        media = soma / temperaturas.length;

        System.out.println("Media anual geral é de: " + media);

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.println(meses[i] + ": " + temperaturas[i]);
            }
        }

        sc.close();
    }
}
