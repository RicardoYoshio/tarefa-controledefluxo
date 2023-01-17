package Modulo10;

import java.util.Scanner;

public class modulo10 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a nota 1: ");
		int nota1 = sc.nextInt();
		System.out.println("Digite a nota 2: ");
		int nota2 = sc.nextInt();
		System.out.println("Digite a nota 3: ");
		int nota3 = sc.nextInt();
		System.out.println("Digite a nota 4: ");
		int nota4 = sc.nextInt();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4f;
		
		String mediaF = getMedia(media);
		System.out.printf("Media das notas: %.2f%n", media);
		System.out.println(mediaF);
		
	}

	public static String getMedia(float media) {
		String result;
		if (media >= 7) {
			result = "Aluno passou de ano";
		} else if (media >= 5 && media < 7) {
			result = "Aluno de recuperação";
		} else {
			result = "Aluno reprovado";
		}
		return result;
	
	}

}

