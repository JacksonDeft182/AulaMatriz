package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Colunas ");
		int c = sc.nextInt();
		
		System.out.println("Digite a quantidade de linhas ");
		int l = sc.nextInt();
		
		int[][] mat = new int[c][l];	
		
		for(int i=0; i < c; i++) {
			for(int j=0; j < l; j++) {
				System.out.print("Digite " + (j+1) + "ª linha, da " + (i+1) + "ª Coluna: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite número para localização: ");
		int ckNumber = sc.nextInt();
		
		for(int i=0; i < c; i++) {
			for(int j=0; j < l; j++) {
				if(mat[i][j] == ckNumber) {
					if(j > 0) {
						System.out.println(" Esquerda:" + mat[i][j-1]);
					}
					if(j < l-1) {
						System.out.println(" Direita:" + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println(" Cima:" + mat[i-1][j]);
					}
					if(i < c-1) {
						System.out.println(" Baixo: " + mat[i+1][j]);
					}
				}
				
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
