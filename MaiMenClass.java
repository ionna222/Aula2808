package Lista2Pratica;

import java.util.Scanner;

public class MaiMenClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		//Input 
		
		System.out.println("Digite um valor inteiro para a variável A");
		int varA = scn.nextInt();
		
		System.out.println("Digite um valor inteiro para a variável B");
		int varB = scn.nextInt();
		
		//Proc
		
		int dif = varA - varB;
		
		//Output
		
		System.out.println("A diferença entre os numeros é de " + dif);
	}

}
