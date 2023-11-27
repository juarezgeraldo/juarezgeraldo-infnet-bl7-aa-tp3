import kruskal.Kruskal;
import minimoheap.MinimoHeap;

import java.io.IOException;
import java.util.Scanner;

//public class Application implements Comparable<Edge> {
public class Application {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual rotina quer executar:");
        System.out.println("1 - Problema 01");
        System.out.println("2 - Problema 02");

        int opcao = sc.nextInt();
        if (opcao == 1) new MinimoHeap();
        else if (opcao == 2) new Kruskal();
    }
}



