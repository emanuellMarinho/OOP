package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// Configura o local padrão para os valores de ponto flutuante serem exibidos no formato americano
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Cria uma instância da classe Product
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		// Solicita o nome do produto ao usuário
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		// Solicita o preço do produto ao usuário
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		// Solicita a quantidade em estoque do produto ao usuário
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		// Exibe uma linha em branco
		System.out.println();
		
		// Exibe os dados do produto inserido pelo usuário
		System.out.println("Product data: " + product);
		
		// Exibe uma linha em branco
		System.out.println();
		
		// Solicita ao usuário a quantidade de produtos a serem adicionados ao estoque
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		// Chama o método addProducts() da classe Product para adicionar produtos ao estoque
		product.addProducts(quantity);
		
		// Exibe uma linha em branco
		System.out.println();
		
		// Exibe os dados atualizados do produto
		System.out.println("Updated data: " + product);
		
		// Exibe uma linha em branco
		System.out.println();
		
		// Solicita ao usuário a quantidade de produtos a serem removidos do estoque
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		// Chama o método removeProducts() da classe Product para remover produtos do estoque
		product.removeProducts(quantity);
		
		// Exibe uma linha em branco
		System.out.println();
		
		// Exibe os dados atualizados do produto após a remoção
		System.out.println("Updated data: " + product);
		
		// Fecha o Scanner
		sc.close();
	}
}
