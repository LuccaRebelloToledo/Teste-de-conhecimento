package testejava;

import java.util.*;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] candidatos = new String[5];
        String[] recrutadores = {"Guilherme", "Ewerton", "Fábio"};
        int[] votacao = new int[5];
        HashMap<String, Integer> vencedores = new HashMap<>();

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("Por favor digite nome de um candidato: ");
            candidatos[i] = scanner.next();
        }

        for(int z = 0; z < candidatos.length; z++) {
            for (String recrutador : recrutadores) {
                System.out.println("Recrutador: " + recrutador);
                System.out.println("Candidato: " + candidatos[z]);
                System.out.println("0 para não votar");
                System.out.println("1 para votar");
                int escolha = scanner.nextInt();
                if (escolha == 1) {
                    votacao[z] += 1;
                }
            }
        }
        scanner.close();
        for(int y = 0; y < candidatos.length; y++) {
            System.out.println("Candidato " + candidatos[y] + " e a quantidade de votos recebidos é " + votacao[y]);
        }

        for(int k = 0; k < votacao.length; k++) {
            if(votacao[k] == 3) {
                vencedores.put(candidatos[k],votacao[k]);
            }
        }
        System.out.println();
        System.out.println("É ou são vencedor(es): ");
        for (String i : vencedores.keySet()) {
            System.out.println("Nome: " + i + " Quantidade de votos: " + vencedores.get(i));
        }
    }
}