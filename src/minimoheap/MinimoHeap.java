package minimoheap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimoHeap {
    public MinimoHeap() {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        System.out.println("Informe a quantidade de comandos:");
        int Q = sc.nextInt();
        if (Q >= 1 && Q <= Math.pow(10,5)) {
            System.out.println("Informe o comando, conforme:");
            System.out.println("            1 v -> Adicionar um elemento v ao heap");
            System.out.println("            2 v -> Excluir o elemento v do heap");
            System.out.println("            3   -> Imprimir o mínimo de todos os elementos do heap");

            for (int i = 0; i < Q; i++) {
                int command = sc.nextInt();
                if (command == 1) {
                    int v = sc.nextInt();
                    if (v < Math.pow(-10,9) && v > Math.pow(10, 9)){
                        System.out.println("Elemento limitado a -10**9 e 10**9");
                        break;
                    }
                    heap.add(v);
                } else if (command == 2) {
                    int v = sc.nextInt();
                    if (v < Math.pow(-10,9) && v > Math.pow(10, 9)){
                        System.out.println("Elemento limitado a -10**9 e 10**9");
                        break;
                    }
                    heap.remove(v);
                } else if (command == 3) {
                    System.out.println(heap.peek());
                }
            }
            System.out.println(heap.peek());
        }else {
            System.out.println("Quantidade de comandos limitados a 1 e 10**5");
        }
        sc.close();
    }
}
