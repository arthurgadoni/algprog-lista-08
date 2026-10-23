
import java.util.Scanner;

public class Algoritmo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cont = new int[9];
        double vendas;
        double salario;

        for (int i = 0; i < cont.length; i++) {
            cont[i] = 0;
        }

        System.out.print("Diga-me a quantidade de vendedores: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Agora habla as vendas brutas do vendedor: ");
            vendas = sc.nextDouble();

            salario = 200 + vendas * 0.09;

            if (salario >= 1000) {
                cont[8]++;
            } else {
                int indice = (int) salario / 100 - 2;

                if (indice >= 0 && indice < 8) {
                    cont[indice]++;
                }
            }
        }

        System.out.println("Os salarios dos vendedores é:");

        for (int i = 0; i < 8; i++) {
            System.out.println("$" + (200 + i * 100) + " - $" +
                (299 + i * 100) + ": " + cont[i]);
        }

        System.out.println("Os $1000 em diante: " + cont[8]);

        sc.close();
    }
}
