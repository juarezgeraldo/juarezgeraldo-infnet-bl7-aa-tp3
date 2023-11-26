package minimoheap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimoHeap {
    public MinimoHeap() {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        System.out.println("Informe a quantidade de comandos:");
        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            System.out.println("Comando " + (i+1) + " - Informe o comando, conforme:");
            System.out.println("            1 v -> Adicionar um elemento v ao heap");
            System.out.println("            2 v -> Excluir o elemento v do heap");
            System.out.println("            3   -> Imprimir o mínimo de todos os elementos do heap");

            System.out.println("Comando:");
            int command = sc.nextInt();
            if (command == 1) {
                System.out.println("Elemento a adicionar:");
                int v = sc.nextInt();
                heap.add(v);
            } else if (command == 2) {
                System.out.println("Elemento a excluir:");
                int v = sc.nextInt();
                heap.remove(v);
            } else if (command == 3) {
                System.out.println("Mínimo de todos os elementos do heap:");
                System.out.println(heap.peek());
            }
        }
        System.out.println(heap.peek());
        sc.close();
    }
}
