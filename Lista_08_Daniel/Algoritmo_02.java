
import java.util.Scanner;

public class Algoritmo_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {
            "Por acaso telefonou para a vitima?",
            "Voce esteve no local do crime?",
            "Mora perto da vitima?",
            "Devia algo para a vitima?",
            "Ja trabalhou com a vitima?"
        };

        int[] respostas = new int[5];
        int positivas = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.print("Ok, agora ponha o numero 1 para Sim ou 0 para Nao: ");
            respostas[i] = sc.nextInt();

            if (respostas[i] == 1) {
                positivas++;
            }
        }

        if (positivas == 2) {
            System.out.println("Suspeita(o)");
        } else if (positivas == 3 || positivas == 4) {
            System.out.println("Cumplice");
        } else if (positivas == 5) {
            System.out.println("Assassino(a)");
        } else {
            System.out.println("Inocente");
        }

        sc.close();
    }
}
