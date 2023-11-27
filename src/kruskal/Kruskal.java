package kruskal;

import java.util.*;

public class Kruskal {

    static int PESO_MAXIMO = (int) (Math.pow(10, 5) + 1);
    public int[][] aresta;
    public int[] pai;
    public int qtdNos;
    public int qtdArestas;


    public Kruskal() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de nós e a quantidade de arestas do grafo:");
        qtdNos = sc.nextInt();
        qtdArestas = sc.nextInt();

        if (qtdNos >= 2 && qtdNos <= 3000) {
            if (qtdArestas >= 1 && qtdArestas <= ((qtdNos * (qtdNos - 1)) / 2)) {
                System.out.println("Adicione as arestas confome a regra:");
                System.out.println("x y z -> onde x=número do nó origem, y=número do nó destino, z=peso da aresta");
                int noOrigem, noDestino, pesoAresta = 0;

                aresta = new int[qtdNos][qtdNos];
                pai = new int[qtdNos];

                for (int indI = 0; indI < qtdNos; indI++) {
                    for (int indJ = 0; indJ < qtdNos; indJ++) {
                        aresta[indI][indJ] = (int) (Math.pow(10, 5) + 1);
                    }
                }

                for (int i = 0; i < qtdArestas; i++) {
                    noOrigem = sc.nextInt();
                    noDestino = sc.nextInt();
                    pesoAresta = sc.nextInt();

                    if (!(noOrigem >= 1 && noOrigem <= qtdNos &&
                            noDestino >= 1 && noDestino <= qtdNos &&
                            pesoAresta >= 0 && pesoAresta <= Math.pow(10, 5))) {
                        System.out.println("Verifique a restrição:");
                        System.out.println("x e y devem estar compreendidos entre 1 e " + qtdNos);
                        System.out.println("z deve estar compreendido entre 0 e 10**5");
                        break;
                    }
                    aresta[noOrigem - 1][noDestino - 1] = pesoAresta;
                }

                System.out.println("O peso total é: " + solucao());
            } else {
                System.out.println("Quantidade de arestas limitada a 1 e " + ((qtdNos * (qtdNos - 1)) / 2));
            }
        } else {
            System.out.println("Quantidade de nós limitada a 2 e 3000");
        }
        sc.close();
    }

    public int solucao() {
        int pesoTotal = 0;

        for (int i = 0; i < qtdNos; i++)
            pai[i] = i;

        int borda = 0;
        while (borda < qtdNos - 1) {
            int min = PESO_MAXIMO, a = -1, b = -1;
            for (int i = 0; i < qtdNos; i++) {
                for (int j = 0; j < qtdNos; j++) {
                    if (encontraVertice(i) != encontraVertice(j) && aresta[i][j] < min) {
                        min = aresta[i][j];
                        a = i;
                        b = j;
                    }
                }
            }

            pai[encontraVertice(a)] = encontraVertice(b);

            borda++;
            pesoTotal += min;
        }
        return pesoTotal;
    }

    public int encontraVertice(int i) {
        while (pai[i] != i)
            i = pai[i];
        return i;
    }

}
