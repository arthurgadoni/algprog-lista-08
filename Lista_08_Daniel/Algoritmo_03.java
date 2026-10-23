
import java.util.Scanner;

public class Algoritmo_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[1000];
        double nota;
        double soma = 0;
        double media = 0;
        int quantidade = 0;
        int acima_media = 0;
        int abaixo_sete = 0;

        System.out.print("Me diga uma nota ou -1 para encerrar: ");
        nota = sc.nextDouble();

        while (nota != -1 && quantidade < notas.length) {
            notas[quantidade] = nota;
            soma += nota;
            quantidade++;

            System.out.print("Ok, agora me diga outra nota ou -1 para encerrar: ");
            nota = sc.nextDouble();
        }

        System.out.println("Ok entao a quantidade de valores é: " + quantidade);

        System.out.println("Ordem das coisas ai ó:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();
        System.out.println("Ordem inversa agora:");

        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(notas[i]);
        }

        System.out.println("A soma é: " + soma);

        if (quantidade > 0) {
            media = soma / quantidade;
            System.out.println("A media é: " + media);

            for (int i = 0; i < quantidade; i++) {
                if (notas[i] > media) {
                    acima_media++;
                }

                if (notas[i] < 7) {
                    abaixo_sete++;
                }
            }

            System.out.println("Aqui é o acima da media: " + acima_media);
            System.out.println("Aqui é o abaixo de sete: " + abaixo_sete);
        } else {
            System.out.println("Nao foram informadas notas, burro");
        }

        System.out.println("Programa encerrado, GG, Fim");
        sc.close();
    }
}
