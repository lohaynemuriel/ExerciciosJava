package visao;

import java.util.Scanner;

import modelo.Circulo;
import modelo.FiguraGeometrica;
import modelo.Quadrado;
import modelo.Retangulo;
import modelo.Triangulo;

public class Principal {

	public static void main(String[] args) {
		FiguraGeometrica figuras[]= new FiguraGeometrica[4];
		

		double lado, lado2, lado3, raio;
		int i, tipoFigura;
		Scanner entrada= new Scanner(System.in);
		
		for(i=0; i<figuras.length; i++) {
			System.out.println("1. Quadrado"+"\n2. Retangulo"+ "\n3. Triangulo"+ "\n4. Circulo"+ "\n Qual figura quer criar?");
			tipoFigura=entrada.nextInt();
			switch(tipoFigura) {
			case 1: 
				System.out.println("Digite o lado do quadrado: ");
				lado=entrada.nextDouble();
				figuras[i]=new Quadrado(lado);
				
				break;
			case 2:
				System.out.println("Digite o menor lado do Retangulo: ");
				lado=entrada.nextDouble();
				System.out.println("Digite o maior lado do Retangulo: ");
				lado2=entrada.nextDouble();
				figuras[i]=new Retangulo(lado, lado2);
		
				break;
			case 3:
				System.out.println("Digite os lados do Triangulo: ");
				lado=entrada.nextDouble();
				lado2=entrada.nextDouble();
				lado3=entrada.nextDouble();
				figuras[i]=new Triangulo(lado, lado2, lado3);
				break;
			case 4:
				System.out.println("Digite o raio do circulo: ");
				raio=entrada.nextDouble();
				figuras[i]= new Circulo(raio);
				break;
			default: System.out.println("Tipo de figura inválida");
				i--;
			}
		}
	}
}
