package AVSomativa;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {

		String a [] = new String [6]; //Aqui informamos o valor String, já que iremos digitar o nome de carros, e não algum número, em seguida informamos que iremos criar um vetor com 6 espaços

		Scanner ler = new Scanner (System.in); //É feito para que o computador possa ler o código e entende-lo, capturar os dados que o usuário informar

		for (int i = 0; i<6; i++) { //Aqui temos o for que é um sistema de repetição, onde ele pede para informarmos um total de 6 nomes, caso tenha menos ele permitirá que adicionemos mais um nome
			System.out.println("Informe o nome do carro que sera inserido na garagem:"); //Aqui ele pede para digitarmos os 6 nomes que são pedidos logo acima
			a[i] = ler.next(); //Aqui ele armazena todos os 6 nomes que foram digitados
		}
		for (int i = 0; i<6; i++) { 
			System.out.println(a[i]); //Aqui ele apresenta os nomes que foram salvos dentro do vetor, apresentando na ordem em que foram inseridos na garagem
		}
		ler.close(); //Este código é utilizado para fechar o Scanner
	}
}