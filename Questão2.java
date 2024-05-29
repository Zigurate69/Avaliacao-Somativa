package AVSomativa;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		double A, b, h; //Aqui é utilizado o double para guardar valores númericos em casas decimais, assim podendo haver contas que possuam vírgula
		
		Scanner ler = new Scanner (System.in); //É feito para que o computador possa ler o código e entende-lo, capturar os dados que o usuário informar
		
		System.out.println("Informe a base do triângulo:"); //Aqui é pedido para que informemos a base do triângulo
		b = ler.nextDouble(); //Aqui o número informado é guardado dentro de b, para assim no futuro ser utilizado
		
		System.out.println("Informe a altura do triângulo:"); //Aqui é pedido para que seja informado a altura do triângulo
		h = ler.nextDouble(); //Aqui o número informado é guardado dentro de h, para assim poder ser utilizado no futuro
		
		A = (b * h)/2; //Aqui é feita a conta para descobrir a área, onde utilizamos os números que foram guardados, fazendo a multiplicação de b e h, e em seguida divindo eles por 2
		
		System.out.println("A Área do Triângulo é: "+A); //Aqui ele informa o resultado da conta feita acima
		ler.close(); //Este código é utilizado para fechar o Scanner
	}
}