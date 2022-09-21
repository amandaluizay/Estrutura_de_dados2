import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Figura figuras[] = new Figura[3];
		int i, opcao;
		double raio, base, altura;
		
		for (i=0;i<figuras.length;i++) {
			
			Scanner entrada = new Scanner(System.in);
		    System.out.println("1. Círculo" + "\n2. Retangulo" + "\nEscolha a opção");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o raio: ");
					raio = entrada.nextInt();
					figuras[i] = new Circulo(raio);
				
			break;
				
				case 2:
					System.out.println("Digite a base: ");
					 base = entrada.nextInt();
					 System.out.println("Digite a altura: ");
					 altura = entrada.nextInt();
					 
					figuras[i] = new Retangulo(base, altura);
					
					
			
		    break; 
		    
		    	default:
		    		System.out.println("Opção Inválida");
		    		i--;
			}
			
			
			
		}
		
		
		for (i=0;i<figuras.length;i++) {
			
			System.out.println(figuras[i].toString());
			System.out.println(figuras[i].getArea());
			System.out.println(figuras[i].getPerimetro());
		}

	}

}
