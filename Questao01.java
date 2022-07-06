package testejava;

import java.util.*;

public class Questao01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] candidatos = new String[5];
		String[] recrutadores = {"Guilherme", "Ewerton", "Fábio"};
		int[] votacao = new int[5];
		
		for(int i = 0; i < candidatos.length; i++) {
		System.out.println("Por favor digite nome de um candidato: ");
		candidatos[i] = scanner.next();
		}
		
		for(int z = 0; z < candidatos.length; z++) {
			for(int j = 0; j < recrutadores.length; j++) {
				System.out.println("Recrutador: " + recrutadores[j]);
				System.out.println("Candidato: " + candidatos[z]);
				System.out.println("0 para não votar");
				System.out.println("1 para votar");
				int escolha = scanner.nextInt();
				if(escolha == 1) {
					votacao[z] += 1;
				} else {
					continue;
				}
			}
		}
		for(int y = 0; y < candidatos.length; y++) {
		System.out.println("Candidato " + candidatos[y] + " e a quantidade de votos recebidos é " + votacao[y]);
		}
		
		for(int k = 0; k < votacao.length; k++) {
			if(votacao[k] == 3) {
				System.out.println("");
				System.out.println("O Candidato vencedor é " + candidatos[k] + " e a quantidade de votos recebidos é " + votacao[k]);
		}	
		scanner.close();
		}
	}	
}
