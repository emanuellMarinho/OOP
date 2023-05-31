package entities;

public class Product {
	
	// Atributos da classe
	public String name;     // Nome do produto
	public double price;    // Preço do produto
	public int quantity;    // Quantidade em estoque do produto
	
	// Método para calcular o valor total em estoque
	public double totalValueInStock() {
		return price * quantity;
	}
	
	// Método para adicionar produtos ao estoque
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	// Método para remover produtos do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// Sobrescrita do método toString() para retornar uma representação em String dos dados do produto
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
