package AVSomativa;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {

		int a [] = new int [15]; //Aqui é informado int, já que só serão utilizados números inteiros, e ele cria um vetor para guardar 15 números

		int soma = 0; //Aqui é informado que a soma é igual a 0

		Scanner ler = new Scanner (System.in); //É feito para que o computador possa ler o código e entende-lo, capturar os dados que o usuário informar

		System.out.println("Informe 15 números:"); //Aqui nos é pedido para informarmos 15 números
		for (int i = 0; i < 15; i++) { //Aqui é dito que o i vai começar no 0, e caso i seja menor que o número 15, um novo número será adicionado, até que o requisito seja completo
			a[i] = ler.nextInt(); //Aqui são guardados os números que foram informados até terem 15 números
			soma += a[i]; //Aqui ele faz a soma de todos os 15 números que foram digitados
		}
		System.out.println("O Resultado da Soma Dos 15 Números Foi De: "+soma); //Aqui é mostrado o resultado da soma de todos os números, ele está fora do colchetes para que não seja repetido
		ler.close(); //Este código é utilizado para fechar o Scanner
	}
}