package AVSomativa;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		
		int Dia; //Aqui é utilizado o int para poderem ser guardados números, porém o int só funciona com números inteiros, e nesse código só haverá números inteiros
		
		Scanner ler = new Scanner (System.in); //É feito para que o computador possa ler o código e entende-lo, capturar os dados que o usuário informar
		
		System.out.println("Informe um valor referente ao dia da semana:"); //Aqui é pedido para informamos um número referente ao dia da semana
		Dia = ler.nextInt(); //Aqui ele irá armazenar o número que foi digitado
		
		if (Dia == 1) { //Aqui é dito que caso o número 1 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Domingo");
		}
		else if (Dia == 2) { //Aqui caso o número 2 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Segunda");
		}
		else if (Dia == 3) { //Aqui caso o número 3 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Terça");
		}
		else if (Dia == 4) { //Aqui caso o número 4 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Quarta");
		}
		else if (Dia == 5) { //Aqui caso o número 5 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Quinta");
		}
		else if (Dia == 6) { //Aqui caso o número 6 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Sexta");
		}
		else if (Dia == 7) { //Aqui caso o número 7 seja informado, a mensagem abaixo irá ser digitada
			System.out.println("Sábado");
		}
		ler.close(); //Este código é utilizado para fechar o Scanner
	}
}