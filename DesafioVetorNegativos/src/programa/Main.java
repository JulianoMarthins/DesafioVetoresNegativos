package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos números você vai digitar:  ");
		int quantidade = sc.nextInt();
		
		if(quantidade > 10) {
			quantidade =10;
		} else if ( quantidade < 0) {
			quantidade = 1;
		}

		Integer[] num = new Integer[quantidade];

		int contador = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("Insira o %d° valor: ", i + 1);
			int valor = sc.nextInt();
			if (valor < 0) {
				contador += 1;
			}
			num[i] = valor;
		}
		
		int cont = 0;
		Integer[] negativo = new Integer[contador];
		for (int i = 0; i < num.length; i++) {
			if(num[i] < 0) {
				negativo[cont] = num[i];
				cont++;
			}
		}

		System.out.println("Valores negativos inseridos: ");
		for (int i = 0; i < negativo.length; i++) {
			System.out.println(negativo[i]);
		}

		sc.close();
	}

}
