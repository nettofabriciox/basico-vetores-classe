package vetores_classe;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	Scanner cs = new Scanner(System.in);
		
		System.out.print("Entrar com qunatidade e produtos: ");
		int n = cs.nextInt();
		
		VetoresDeClasse[] v = new VetoresDeClasse[n];
		for(int i=0; i<n; i++ ) {
			cs.nextLine();
			System.out.print("Entrar com nome: ");
			String nome = cs.nextLine();
			System.out.print("Entrar com preço: ");
			double preco = cs.nextInt();
			
			v[i] = new VetoresDeClasse(nome, preco);
		}
		
		double s = 0;
		for(int i=0; i<n; i++ ) {
			s += v[i].getPreco();
		    System.out.println(v[i]);
		}
		
		   System.out.println("Valor Total de compras: R$" + s);
		
		   cs.nextLine();

	}

}
