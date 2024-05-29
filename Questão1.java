package AVSomativa;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		
		double a, b, soma, sub, multi, div; //Aqui utilizamos o double para que a conta possa ser feita, e possam haver números com vírgula
		
		Scanner ler = new Scanner (System.in); //É feito para que o computador possa ler o código e entende-lo, capturar os dados que o usuário informar
		
		System.out.println("Informe o primeiro número:"); //Aqui nos é pedido para informamos o primeiro número
		a = ler.nextDouble(); //Aqui é guardado no "a" o número que foi digitado
		
		System.out.println("Informe o segundo número:"); //Aqui nos é pedido para informarmos um segundo número
		b = ler.nextDouble(); //Aqui o segundo número é guardado no "b"
		
		soma = a + b; //Aqui ele faz com que os números guardados em "a" e "b" sejam somados
		sub = a - b;  //Aqui ele faz com que eles sejam subtraídos
		multi = a * b; //Aqui ele faz com que eles sejam multiplicados
		div = a / b;   //Aqui ele faz com que eles sejam divididos
		
		System.out.println("O Resultado da Soma é: "+soma); //Aqui ele faz com que o resultado da conta da soma feita a cima seja mostrado
		System.out.println("O Resultado da Subtração é: "+sub); //Aqui ele faz com que o resultado da conta de subtração seja mostrado
		System.out.println("O Resultado da Multiplicação é: "+multi); //Aqui ele faz com que o resultado da conta de multiplicação seja mostrado
		System.out.println("O Resultado da Divisão é: "+div); //Aqui ele faz com que o resultado da conta de divisão seja mostrado
		ler.close(); //Este código é utilizado para fechar o Scanner
	}
}