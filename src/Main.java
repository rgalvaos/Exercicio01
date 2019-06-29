import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		double peso, altura, nota1, nota2, imc, media;

		System.out.println("Digite seu nome:");
		nome = ler.nextLine();
		System.out.println("Digite seu peso:");
		peso = ler.nextDouble();
		System.out.println("Digite sua altura:");
		altura = ler.nextDouble();
		System.out.println("Digite sua nota1:");
		nota1 = ler.nextDouble();
		System.out.println("Digite sua nota2:");
		nota2 = ler.nextDouble();
		System.out.println(nome + " peso: " + peso + " altura: " + altura + " primeira nota: " + nota1 + " segunda nota: " + nota2);
		media = (nota1 + nota2)/2;
		System.out.println("Sua média das notas é: "+ media);
		imc = peso / (altura * altura);
		System.out.println("Seu IMC é de: "+imc);
		
	}

}
